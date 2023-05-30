package seleniumsessions;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ResponsiveTestingExample {
    public static void main(String[] args) {
        // Set up the Chrome driver and options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingAnyFreePort()
                .build();
        ChromeDriver driver = new ChromeDriver(service, options);

        // Set the device metrics to emulate an iPhone X screen size
        Map<String, Object> metrics = new HashMap<>();
        metrics.put("width", 375);
        metrics.put("height", 812);
        metrics.put("deviceScaleFactor", 3.0);
        metrics.put("mobile", true);
        Map<String, Object> params = new HashMap<>();
        params.put("deviceMetricsOverride", metrics);
        driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", params);

        // Navigate to a website and perform responsive testing
        driver.get("https://www.example.com");
        // Perform responsive testing here

        // Quit the driver
        driver.quit();
    }
}

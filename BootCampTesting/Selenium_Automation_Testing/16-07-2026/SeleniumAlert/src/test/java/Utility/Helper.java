package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Helper {
	public static WebDriver startBroweser(String browser) {
		WebDriver driver = null ;
		if (browser.equalsIgnoreCase("Chrome"))


        if (browser.equalsIgnoreCase("Chrome")
                || browser.equalsIgnoreCase("Google Chrome")
                || browser.equalsIgnoreCase("GC")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        } else if (browser.equalsIgnoreCase("Edge")
                || browser.equalsIgnoreCase("Microsoft Edge")
                || browser.equalsIgnoreCase("EG")) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();

        } else if (browser.equalsIgnoreCase("FireFox")
                || browser.equalsIgnoreCase("Mozilla Firefox")
                || browser.equalsIgnoreCase("EG")) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();

        } else {
            System.out.println("Sorry we do not support this browser");
        }

        return driver;
    }

    public static void closeBrowser(WebDriver driver) {
        driver.quit();
    }
}
package TakeScreenshortConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Library.Reusuability;

public class TestScreenshort1 {

    @Test
    public void Browser() throws Exception {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://spicejet.woohoo.in/en-in/home");
        driver.manage().window().maximize();

        Reusuability.capturedScreenShot(driver, "A. Launch Application - TakeScreenShot");

        driver.findElement(By.id("username"))
              .sendKeys("neerajsingh345678");

        driver.findElement(By.name("password"))
              .sendKeys("Singh@123");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[@name='action']"))
              .click();

        Reusuability.capturedScreenShot(driver, "B. Click Sign In Button - TakeScreenShot");

        driver.quit();
    }
}
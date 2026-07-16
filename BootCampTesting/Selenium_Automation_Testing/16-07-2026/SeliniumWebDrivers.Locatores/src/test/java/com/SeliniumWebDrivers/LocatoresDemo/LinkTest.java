package com.SeliniumWebDrivers.LocatoresDemo;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class LinkTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hollandandbarrett.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
    }

    @Test
    public void linkTest() {
        driver.findElement(By.partialLinkText("Vitamins")).click();
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int nolinks = links.size();
        System.out.println("No.Of links in hollandandbarrett Application: " + nolinks);

        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getText());
            String str = links.get(i).getText();
            String str1 = "Vitamins";
            
            // Fixed: Changed (str == str1) to str.equals(str1) for correct Java string comparison
            if (str.equals(str1)) { 
                driver.findElement(By.linkText("Vitamins")).click();
                driver.findElement(By.xpath("(//a[contains(@type, 'button')])[4]")).click();
            }
        }
    }
}
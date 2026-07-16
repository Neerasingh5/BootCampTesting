package Utility;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlert {
	   @Test
	    public void TestPopups() throws Exception {

	        WebDriver driver = Helper.startBrowser("Chrome");
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

	   
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click(); 
	        Alert alert = driver.switchTo().alert();
	        Thread.sleep(8000);
	        alert.accept();
	        String result = driver.findElement(By.cssSelector("#result")).getText();
	        System.out.println(result);
	        Assert.assertEquals("You successfully clicked an alert", result);
	        
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click(); 
	        Alert alert2 = driver.switchTo().alert();
	        Thread.sleep(8000);
	        alert.accept();
	        String result2 = driver.findElement(By.cssSelector("#result")).getText();
	        System.out.println(result2);
	        Assert.assertEquals("You successfully clicked an alert", result2);

	   
	        
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	        Alert alert3 = driver.switchTo().alert();
	        Thread.sleep(8000);
	        alert3.accept();
	        String result3 = driver.findElement(By.cssSelector("#result")).getText();
	        System.out.println(result3);
	        Assert.assertEquals("You clicked: Ok", result3);
	 
	        
	                
	        
	   }
}
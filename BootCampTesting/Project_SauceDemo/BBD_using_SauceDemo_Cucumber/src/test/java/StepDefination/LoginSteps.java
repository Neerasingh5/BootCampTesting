package StepDefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginSteps {
 WebDriver driver;
 @Given("User launches browser")
    public void user_launches_browser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);}
     @When("User opens SauceDemo website")
      public void user_opens_saucedemo_website() throws InterruptedException {
      driver.get("https://www.saucedemo.com/");
      Thread.sleep(2000);}
     @When("User enters username {string}")
    public void user_enters_username(String uname) throws InterruptedException {
     driver.findElement(By.id("user-name")).sendKeys(uname);
   Thread.sleep(2000);}
  @When("User enters password {string}")
    public void user_enters_password(String pass) throws InterruptedException {
    driver.findElement(By.id("password")).sendKeys(pass);
     Thread.sleep(2000);}
     @When("User clicks Login button")
    public void user_clicks_login_button() throws InterruptedException {
   driver.findElement(By.id("login-button")).click();
  Thread.sleep(3000);
    }
 @Then("User should be on Products page")
    public void user_should_be_on_products_page() throws InterruptedException {
        if (driver.getCurrentUrl().contains("inventory")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }  Thread.sleep(5000);
 driver.quit();
    }
}
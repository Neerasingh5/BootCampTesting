package comFramework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages {

    WebDriver driver;

    public LoginPages(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "user-name")
    WebElement Username;

    @FindBy(id = "password")
    WebElement Password;

    @FindBy(id = "login-button")
    WebElement BtnLogin;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement AddToCart;

    public void LoginSauceDemo(String Uname, String Psd) {
        Username.sendKeys(Uname);
        Password.sendKeys(Psd);
        BtnLogin.click();
    }

    public void AddProductToCart() {
        AddToCart.click();
    }
}
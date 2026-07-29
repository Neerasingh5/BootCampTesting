package comFramework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AddToCartPage {
  WebDriver driver;
 // Constructor
    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
 // ===================== LOCATORS =====================

    // Add Backpack
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addBackpack;

    // Shopping Cart
    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCart;
  // Checkout
    @FindBy(id = "checkout")
    WebElement checkoutBtn;
   // Customer Information
    @FindBy(id = "first-name")
    WebElement firstName;
   @FindBy(id = "last-name")
    WebElement lastName;
  @FindBy(id = "postal-code")
    WebElement postalCode;
  @FindBy(id = "continue")
    WebElement continueBtn;
  // Finish
    @FindBy(id = "finish")
    WebElement finishBtn;

    // Menu
    @FindBy(id = "react-burger-menu-btn")
    WebElement menuBtn;
    // Logout
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutBtn;
   // ===================== METHODS =====================

    // Add Product
    public void addProduct() {
        addBackpack.click();
    }
  // Open Cart
    public void openCart() {
        shoppingCart.click();
    }
    // Checkout
    public void checkout() {
        checkoutBtn.click();
    }
    // Customer Details
    public void enterCustomerDetails(String fname, String lname, String zip) {

        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        postalCode.sendKeys(zip);
     continueBtn.click();
    }
    // Finish Order
    public void finishOrder() {
        finishBtn.click();
    }
    // Logout
    public void logout() throws InterruptedException {
   menuBtn.click();
        Thread.sleep(2000);
        logoutBtn.click();
    }

}
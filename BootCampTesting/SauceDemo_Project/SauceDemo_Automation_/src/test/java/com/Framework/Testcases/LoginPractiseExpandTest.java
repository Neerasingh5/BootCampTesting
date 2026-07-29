package com.Framework.Testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import comFramework.Pages.AddToCartPage;
import comFramework.Pages.BaseClass;
import comFramework.Pages.LoginPages;
public class LoginPractiseExpandTest extends BaseClass {

   @Test
    public void SauceDemoTest() throws Exception {
        LoginPages login = PageFactory.initElements(driver, LoginPages.class);
        AddToCartPage cart = PageFactory.initElements(driver, AddToCartPage.class);
     // Login
        login.LoginSauceDemo("standard_user", "secret_sauce");
        Thread.sleep(2000);
        // Add Product
        cart.addProduct();
        Thread.sleep(2000);

        // Open Cart
        cart.openCart();
        Thread.sleep(2000);

        // Checkout
        cart.checkout();
        Thread.sleep(2000);
        // Customer Details
        cart.enterCustomerDetails("Neeraj", "Singh", "221001");
        Thread.sleep(2000);
      // Finish Order
        cart.finishOrder();
        Thread.sleep(3000);

        // Logout
        cart.logout();
        Thread.sleep(3000);
    }
}
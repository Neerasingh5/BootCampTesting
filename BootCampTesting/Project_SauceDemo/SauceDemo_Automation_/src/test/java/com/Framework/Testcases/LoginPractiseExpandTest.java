package com.Framework.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import comFramework.Pages.BaseClass;
import comFramework.Pages.LoginPages;

public class LoginPractiseExpandTest extends BaseClass {

    @Test
    public void LoginApp() throws Exception {
        Thread.sleep(5000);
        
        LoginPages login = PageFactory.initElements(driver, LoginPages.class);
        Thread.sleep(5000);
        login.LoginSauceDemo("standard_user", "secret_sauce");

        Thread.sleep(5000);
        login.AddProductToCart();
    }
}
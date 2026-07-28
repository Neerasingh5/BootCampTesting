package com.Easycalculation.Testcase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Easycalculation.pages.LoginEasyCal;

import Helper.BrowserFactory;

public class ExecuteLoginPage {

    @Test
    public void CheckValidUser() {

        WebDriver driver = BrowserFactory.BrowserOptions(
                "chrome",
                "https://www.login.hiox.com/login?referrer=easycalculation.com");
        
        LoginEasyCal log=PageFactory.initElements(driver,com.Easycalculation.pages.LoginEasyCal.class);
        log.login_EasyCal("9740673180", "raghubn@123");
    }
}
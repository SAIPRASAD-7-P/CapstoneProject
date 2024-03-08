package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase1;

public class CustomerLoginPage extends TestBase1 {

    @FindBy(xpath = "//button[@ng-click='customer()']")
    WebElement customerLoginBtn;
    
    @FindBy(xpath = "//select[@class='form-control ng-valid ng-dirty ng-valid-parse ng-touched']")
    WebElement customerDropdownBtn;
    
    @FindBy(xpath = "//select[@ng-model='custId']")
    WebElement customeNameBtn;
    
    @FindBy(xpath = "//button[@type='submit']")
    WebElement lgnBtn;
    

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnCustomerLogin() {
        customerLoginBtn.click();
        customerDropdownBtn.click();
        customeNameBtn.click();
        lgnBtn.click();        
        
    }
    // You can add more methods for login functionality if needed
    
}
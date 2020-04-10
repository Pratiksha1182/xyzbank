package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.junit.Assert;


public class BankManagerLoginPage extends Utility {
    By addCustomersBtn = By.xpath("//button[contains(text(),'Add Customer')]");
    By openAccountBtn = By.xpath("//button[contains(text(),'Open Account')]");
    By customerButton = By.xpath("//button[contains(text(),'Customers')]");


    public void clickOnAddCustomerBtn() {
        clickOnElement(addCustomersBtn);
    }

    public void clickOnOpenAccountBtn() {
        clickOnElement(openAccountBtn);
    }

    public void clickOnCustomerButton(){ clickOnElement(customerButton);}


    public void handleAlert() {
        String actual_msg =driver.switchTo().alert().getText();
        System.out.println("Alert Message : "+actual_msg);
        driver.switchTo().alert().accept();
        String expected_msg = "Customer added successfully";
        Assert.assertNotEquals(actual_msg,expected_msg);

    }
}

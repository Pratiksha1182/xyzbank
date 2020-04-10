package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By bankManagerLoginButton = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLoginButton = By.xpath("//button[contains(text(),'Customer Login')]");

    public void clickOnBankManagerLoginButton(){ clickOnElement(bankManagerLoginButton);}
    public void clickOnCustomerLoginButton(){ clickOnElement(customerLoginButton);}
}

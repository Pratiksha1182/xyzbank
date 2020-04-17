package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By logOutButton = By.xpath("//button[@class='btn logout']");
    By depositButton = By.xpath("//button[contains(text(),'Deposit')]");
    By amountField = By.xpath("//input[@placeholder='amount']");
    By depositBtn = By.xpath("//button[@class='btn btn-default']");
    By depositSuccessfulMsg = By.xpath("//span[@class='error ng-binding']");
    By withdrawButton = By.xpath("//button[contains(text(),'Withdrawl')]");
    By amountToBeWithdrawnField = By.xpath("//input[@placeholder='amount']");
    By withdrawBtn = By.xpath("//button[@class='btn btn-default']");
    By transactionSuccessfulMsg = By.xpath("//span[@class='error ng-binding']");
    By homeButton = By.xpath("//button[@class='btn home']");



    public void clickOnDepositButton(){clickOnElement(depositButton);}
    public void enterAmount(){sendTextToElement(amountField,"100");}
    public void clickOnDepositBtn(){ clickOnElement(depositBtn);}
    public String getDepositSuccessfulMessage(){ return getTextFromElement(depositSuccessfulMsg);}
    public void clickOnWithdrawlBtn(){ clickOnElement(withdrawButton);}
    public void enterAmountToBeWithdrawn(){sendTextToElement(amountField,"10");}
    public void clickOnWithdrawBtn(){ clickOnElement(withdrawBtn);}
    public String getTransactionSuccessfulMessage(){return getTextFromElement(transactionSuccessfulMsg);}
    public void clickOnHomeButton(){clickOnElement(homeButton);}





    public void verifyThatLogOutBtnIsDisplayed() {
        if (verifyThatElementIsDisplayed(logOutButton)) {
            System.out.println("LogOut Button is Present");
            clickOnElement(logOutButton);
        } else System.out.println("User is not successfully Logged In.");
    }
}


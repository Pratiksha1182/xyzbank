package com.bank.testsuit;

import com.bank.TestBase.TestBase;
import com.bank.pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerPage customerPage = new CustomerPage();
    AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterpostcode();
        addCustomerPage.clickOnAddCustomerButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterpostcode();
        addCustomerPage.clickOnAddCustomerButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickOnCustomerDropDownMenAndSelectCustomerName();
        openAccountPage.clickOnDropDownMenuAndSelectCurrency();
        openAccountPage.clickOnProcessButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);

    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterpostcode();
        addCustomerPage.clickOnAddCustomerButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickOnCustomerDropDownMenAndSelectCustomerName();
        openAccountPage.clickOnDropDownMenuAndSelectCurrency();
        openAccountPage.clickOnProcessButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        openAccountPage.clickOnHomeButton();
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDownMenu();
        Thread.sleep(3000);
        customerLoginPage.clickOnLogInButton();
        accountPage.verifyThatLogOutBtnIsDisplayed();
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterpostcode();
        addCustomerPage.clickOnAddCustomerButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickOnCustomerDropDownMenAndSelectCustomerName();
        openAccountPage.clickOnDropDownMenuAndSelectCurrency();
        openAccountPage.clickOnProcessButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        openAccountPage.clickOnHomeButton();
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDownMenu();
        Thread.sleep(3000);
        customerLoginPage.clickOnLogInButton();
        accountPage.verifyThatLogOutBtnIsDisplayed();
        customerPage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDownMenu();
        Thread.sleep(3000);
        customerLoginPage.clickOnLogInButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmount();
        accountPage.clickOnDepositBtn();
        String expectedText = "Deposit Successful";
        String actualText = accountPage.getDepositSuccessfulMessage();
        Assert.assertEquals(expectedText, actualText);

    }
@Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterpostcode();
        addCustomerPage.clickOnAddCustomerButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickOnCustomerDropDownMenAndSelectCustomerName();
        openAccountPage.clickOnDropDownMenuAndSelectCurrency();
        openAccountPage.clickOnProcessButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        openAccountPage.clickOnHomeButton();
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDownMenu();
        Thread.sleep(3000);
        customerLoginPage.clickOnLogInButton();
        accountPage.verifyThatLogOutBtnIsDisplayed();
        customerPage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDownMenu();
        Thread.sleep(3000);
        customerLoginPage.clickOnLogInButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmount();
        accountPage.clickOnDepositBtn();
        String expectedText = "Deposit Successful";
        String actualText = accountPage.getDepositSuccessfulMessage();
        Assert.assertEquals(expectedText, actualText);
        accountPage.clickOnWithdrawlBtn();
        accountPage.enterAmountToBeWithdrawn();
        accountPage.clickOnWithdrawBtn();
        String expectedText1 = "Transaction successful";
        String actualText1 = accountPage.getTransactionSuccessfulMessage();
        Assert.assertEquals(expectedText1, actualText1);
        accountPage.clickOnHomeButton();
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnCustomerButton();
        customerPage.enterCustomerName();
        customerPage.clickOnDeleteButton();
    }
}

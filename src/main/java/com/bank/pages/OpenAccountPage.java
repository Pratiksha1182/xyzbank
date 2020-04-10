package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By customerDropDownMenu = By.id("userSelect");
    By currencyDropDownMenu = By.xpath("//select[@id='currency']");
    By processButton = By.xpath("//button[contains(text(),'Process')]");
    By homeButton = By.xpath("//button[@class='btn home']");

    public void clickOnCustomerDropDownMenAndSelectCustomerName(){clickOnElement(customerDropDownMenu);
    selectByVisibleTextFromDropDown(customerDropDownMenu,"Pratiksha Patel"); }

    public void clickOnDropDownMenuAndSelectCurrency(){ selectByValueFromDropDown(currencyDropDownMenu,"Pound");
    selectByVisibleTextFromDropDown(currencyDropDownMenu,"Pound");}
    public void clickOnProcessButton(){ clickOnElement(processButton);}
    public void clickOnHomeButton(){clickOnElement(homeButton);}
}

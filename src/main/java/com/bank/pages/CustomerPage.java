package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {

By homeBtn = By.xpath("//button[@class='btn home']");
By searchCustomerField = By.xpath("//input[@placeholder='Search Customer']");
By deleteButton = By.xpath("//button[contains(text(),'Delete')]");

public void clickOnHomeBtn(){clickOnElement(homeBtn);}
public void enterCustomerName(){ sendTextToElement(searchCustomerField,"Pratiksha");}
public void clickOnDeleteButton(){ clickOnElement(deleteButton);}


}

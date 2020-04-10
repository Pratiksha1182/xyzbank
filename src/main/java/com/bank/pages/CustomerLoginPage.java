package com.bank.pages;


import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By yourNameDropDownMenu = By.xpath("//select[@id='userSelect']");
    By loginButton = By.xpath("//button[@class='btn btn-default']");

    public void selectYourNameFromDropDownMenu(){ clickOnElement(yourNameDropDownMenu);
    selectByVisibleTextFromDropDown(yourNameDropDownMenu,"Pratiksha Patel");}

    public void clickOnLogInButton(){ clickOnElement(loginButton);}


}

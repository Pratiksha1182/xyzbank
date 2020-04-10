package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postCodeField = By.xpath("//input[@placeholder='Post Code']");
    By addCustomersButton = By.xpath("//button[@class='btn btn-default']");

    public void enterFirstName(){sendTextToElement(firstNameField,"Pratiksha");}
    public void enterLastName(){sendTextToElement(lastNameField,"Patel");}
    public void enterpostcode(){sendTextToElement(postCodeField,"AL10 8PW");}
    public void clickOnAddCustomerButton(){clickOnElement(addCustomersButton);}

}

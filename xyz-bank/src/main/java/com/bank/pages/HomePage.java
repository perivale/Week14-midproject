package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//button[contains(text(),'Bank Manager Login')]" )
    WebElement bankmanagerlogintab;

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerlogintab;


    public void clickOnBankMangerloginTab(){
      //  CustomListeners.node.log(Status.PASS,"click on bankmanager tab");
        Reporter.log("clicking on bankmanger tab"+bankmanagerlogintab.toString()+"<br>");
        clickOnElement(bankmanagerlogintab);
    }
    public void clickOnCustomerLogintab(){
     //   CustomListeners.node.log(Status.PASS,"click on customer login tab");
        Reporter.log("clicking on customerlogintab"+"<br>");
        clickOnElement(customerlogintab);
    }
}

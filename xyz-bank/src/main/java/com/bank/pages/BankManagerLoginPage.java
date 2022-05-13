package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addcustomer;

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement selectcustomername;

    @FindBy(xpath = "//select[@id='currency']")
    WebElement selectcurrancy;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processbutton;

    public void clickoncustomeraddtab() {
     //   CustomListeners.node.log(Status.PASS,"click on customer add tab:");
        Reporter.log("clicking on add cutstomer tab" + "<br>");
        clickOnElement(addcustomer);
    }

    public void srachOnCustomername(String name) {
     //   CustomListeners.node.log(Status.PASS,"Select customer name:");
        Reporter.log("selectcustomer name" + "<br>");
        selectByVisibleTextFromDropDown(selectcustomername, name);
    }

    public void srachOnCurrancy(String pound£) {
     //   CustomListeners.node.log(Status.PASS,"Select currancy:");
        Reporter.log("select currancy" + "<br>");
        selectByVisibleTextFromDropDown(selectcurrancy, pound£);
    }

    public void clickonProceesbutton() {
    //    CustomListeners.node.log(Status.PASS,"Click on procees button:");
        Reporter.log("click on procees button" + "<br>");
        clickOnElement(processbutton);
    }


}


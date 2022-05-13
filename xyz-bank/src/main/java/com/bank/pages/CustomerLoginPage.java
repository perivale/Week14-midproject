package com.bank.pages;


import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }
        @FindBy(xpath = "//select[@id='userSelect']")
        WebElement searchcustomername;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginbutton;



        public void searchOnCustomeraname(String name){
           // CustomListeners.node.log(Status.PASS,"select customer name:");
            Reporter.log("serchCustomername"+"<br>");
            selectByVisibleTextFromDropDown(searchcustomername,name);
        }
        public void clickOnLoginButton(){
          //  CustomListeners.node.log(Status.PASS,"click on login button:");
            Reporter.log("click on login button"+"<br>");
            clickOnElement(loginbutton);
        }

    }


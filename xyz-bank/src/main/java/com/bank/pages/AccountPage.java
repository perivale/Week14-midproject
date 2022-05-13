package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITest;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement logoutbutton;

  public String verifyTheLogOutText(){
     //CustomListeners.node.log(Status.PASS,"Verify the log out text");
      Reporter.log("verify the logout text"+"<br>");
      return getTextFromElement(logoutbutton);
  }
  public void clickonLogoutButton(){
   //   CustomListeners.node.log(Status.PASS,"click on log out button");
      Reporter.log("click on log out button"+"<br>");
      clickOnElement(logoutbutton);
  }

}

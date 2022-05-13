package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yournametext;

    @FindBy(xpath = "//button[@ng-click=\"deposit()\"]")
    WebElement depositlink;

    @FindBy(xpath = "//button[@class='btn btn-lg tab btn-primary']")
    WebElement deposit;

    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withDrow;

    @FindBy(tagName = "input")
    WebElement depositmoney;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositButton;

    @FindBy(tagName = "input")
    WebElement withdrowmoney;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement withdrowbutton;

    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement verifytransuccmessage;

    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement verifydipositsuccesmessage;


    public String verifyYournameText() {
     //   CustomListeners.node.log(Status.PASS,"verify your name text;");
        Reporter.log("verify the yournametext" + "<br>");
        return getTextFromElement(yournametext);
    }

    public void clickondesositlink() {
      //  CustomListeners.node.log(Status.PASS,"click on depositlink");
        Reporter.log(("click on diposit link" + "<br>"));
        clickOnElement(depositlink);
    }

    public void entermoney(String money) {
      //  CustomListeners.node.log(Status.PASS,"deposit the monry:");
        Reporter.log("clickon windrow moeny" + "<br>");
        clickOnElement(depositmoney);
        sendTextToElement(depositmoney, money);
    }

    public void clickonDiposittab() {
      //  CustomListeners.node.log(Status.PASS,"click on diposit tab:");
        Reporter.log("clickon diposit tab" + "<br>");
        clickOnElement(deposit);
    }

    public void clickOnDipositbutton() {
      //  CustomListeners.node.log(Status.PASS,"click on dipositbutton:");
        Reporter.log("enter on diposit button" + "<br>");
        clickOnElement(depositButton);
    }

    public void clickonWithdrow() {
    //    CustomListeners.node.log(Status.PASS,"click on withdrow link:");
        Reporter.log("click on withdrow link" + "<br>");
        clickOnElement(withDrow);
    }

    public void clickonwithdrowmoney(String withdorewmoney) {
     //   CustomListeners.node.log(Status.PASS,"click on withdrow money:");
        Reporter.log("click on withdorw money" + "<br>");
        clickOnElement(withdrowmoney);
        sendTextToElement(withdrowmoney, withdorewmoney);
    }

    public void clickonwithdrowbutton() {
     //   CustomListeners.node.log(Status.PASS,"click on withdrow button");
        Reporter.log("click on withdrow button"+"<br>");
        clickOnElement(withdrowbutton);
    }

    public String verifyrancesssuccesfullytextmessage() {
     //   CustomListeners.node.log(Status.PASS,"verify the suceessfully message");
        Reporter.log("verify the successfully message"+"<br>");
        return verifytransuccmessage.getText();
    }


    public String verifydipositsuccesfullymessage() {
   //     CustomListeners.node.log(Status.PASS,"verify the diposit successfully message");
        Reporter.log("verify  the deposit suceessfully message"+"<br>");
        return verifydipositsuccesmessage.getText();
    }


}

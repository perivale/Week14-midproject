package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.apache.commons.compress.harmony.pack200.Segment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import javax.xml.bind.annotation.W3CDomHandler;

public class AddCustomerPage extends Utility {
    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement fristname;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement lastname;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement postcode;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement clickonaddcustomer;



    public void enterfristname(String fname){
      //  CustomListeners.node.log(Status.PASS,"Enter firstname:");
        Reporter.log("enterfristname"+fname+"topasswordfield"+fristname.toString()+"<br>");
        sendTextToElement(fristname,fname);
    }
    public void enterlastname(String lastname1){
      //  CustomListeners.node.log(Status.PASS,"Enter lastname:");
        Reporter.log("enterlastname"+lastname1+"to passwordfiled"+lastname.toString()+"<br>");
        sendTextToElement(lastname,lastname1);
    }
    public void enterpostcode(String pcode){
      //  CustomListeners.node.log(Status.PASS,"Enter postcode:");
        Reporter.log("enterpostcode"+pcode+"to postcodefiled"+postcode.toString()+"<br>");
        sendTextToElement(postcode,pcode);
    }
    public void clickonaddtocustomertab(){
     //   CustomListeners.node.log(Status.PASS,"click on add to custemor tab:");
        Reporter.log("clickon addto to customertab"+"<br>");
        clickOnElement(clickonaddcustomer);
    }
    public void clickonpopupwindow(){
      //  CustomListeners.node.log(Status.PASS,"click on pop up window");
        Reporter.log("clickonpopup window"+"<br>");
        acceptAlert();

    }









}

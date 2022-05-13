package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BankTest extends TestBase {
    HomePage homePage;
    CustomerLoginPage customerLoginPage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    AccountPage accountPage;
    CustomersPage customersPage;
    OpenAccountPage openAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        customerLoginPage = new CustomerLoginPage();
        addCustomerPage = new AddCustomerPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        accountPage = new AccountPage();
        customersPage = new CustomersPage();
        openAccountPage=new OpenAccountPage();


    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankMangerloginTab();
        bankManagerLoginPage.clickoncustomeraddtab();
        addCustomerPage.enterfristname("shilpa");
        addCustomerPage.enterlastname("patel");
        addCustomerPage.enterpostcode("HW4 1RR");
        addCustomerPage.clickonaddtocustomertab();
        String expectedmessage = "Customer added successfully";
        boolean actualmessage = driver.switchTo().alert().getText().contains("Customer added successfully");
        Assert.assertTrue( true,expectedmessage);
        addCustomerPage.acceptAlert();


    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankMangerloginTab();
        openAccountPage.clickonopenAccountTab();
        bankManagerLoginPage.srachOnCustomername("Harry Potter");
        bankManagerLoginPage.srachOnCurrancy("Pound");
        bankManagerLoginPage.clickonProceesbutton();
        String expectedmessage = "Account created successfully";
        boolean actualmessage = driver.switchTo().alert().getText().contains("Account created successfully");
        Assert.assertTrue(true,expectedmessage);
        bankManagerLoginPage.acceptAlert();


    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldLoginAndLogoutSuceessfully() {
        SoftAssert softAssert=new SoftAssert();
        homePage.clickOnCustomerLogintab();
        customerLoginPage.searchOnCustomeraname("Harry Potter");
        customerLoginPage.clickOnLoginButton();
        String expectedresult = "Logout";
        String actualresult = accountPage.verifyTheLogOutText();
        softAssert.assertEquals(expectedresult,actualresult,"verify the text");
        accountPage.clickonLogoutButton();
        String Expectedname = "Your Name :";
        String actualname = customersPage.verifyYournameText();
        softAssert.assertEquals(Expectedname,actualname,"verify the text");
        softAssert.assertAll();


    }


    @Test(groups = {"smoke", "regression"})
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLogintab();
        customerLoginPage.searchOnCustomeraname("Harry Potter");
        customerLoginPage.clickOnLoginButton();
        customersPage.clickondesositlink();
        customersPage.entermoney("100");
        customersPage.clickOnDipositbutton();
        String expectedmessage = "Deposit Successful";
        String actualmessge = customersPage.verifydipositsuccesfullymessage();
        Assert.assertEquals(expectedmessage, actualmessge, "verify the deposit succesfully message");


    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnCustomerLogintab();
        customerLoginPage.searchOnCustomeraname("Harry Potter");
        customerLoginPage.clickOnLoginButton();
        customersPage.clickonWithdrow();
        customersPage.clickonwithdrowmoney("50");
        customersPage.clickonwithdrowbutton();
        String expectedmessage = "Transaction successful";
        String actualmessage = customersPage.verifyrancesssuccesfullytextmessage();
        Assert.assertEquals(expectedmessage, actualmessage, "verify the text message");


    }


}

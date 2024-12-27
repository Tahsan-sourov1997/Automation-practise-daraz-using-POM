package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FlashSellPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.driverSetup;

public class TestLoginPage extends driverSetup {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    FlashSellPage flashSellPage = new FlashSellPage();

    @Test
    public void testLoginWithValidUsers() throws InterruptedException {
        homePage.loadAnWebPage(homePage.home_page_url);
        homePage.clickElement(homePage.login_button);
        loginPage.writeElement(loginPage.email_input_field, loginPage.email);
        loginPage.writeElement(loginPage.password_input_field, loginPage.password);
        loginPage.clickElement(loginPage.login_button);
        Assert.assertTrue(flashSellPage.getElement(flashSellPage.flash_text).isDisplayed());
        flashSellPage.clickElement(flashSellPage.logout_path_btn);
        Thread.sleep(5000);
        Assert.assertTrue(flashSellPage.getElement(flashSellPage.logout_btn).isDisplayed());
        flashSellPage.clickElement(flashSellPage.logout_btn);
        Thread.sleep(5000);
    }

    @Test
    public void testLoginWithInvalidUsers() throws InterruptedException {
        homePage.loadAnWebPage(homePage.home_page_url);
        homePage.clickElement(homePage.login_button);
        loginPage.writeElement(loginPage.email_input_field, loginPage.email);
        loginPage.writeElement(loginPage.password_input_field, "123456");
        loginPage.clickElement(loginPage.login_button);
        Assert.assertTrue(loginPage.getElement(loginPage.error_msg).isDisplayed());
        Thread.sleep(5000);
    }
    @Test
    public void testLoginWithInvalidPhoneNumber() throws InterruptedException {
        homePage.loadAnWebPage(homePage.home_page_url);
        homePage.clickElement(homePage.login_button);
        loginPage.writeElement(loginPage.email_input_field, "0195542449");
        loginPage.writeElement(loginPage.password_input_field, "123456");
        loginPage.clickElement(loginPage.login_button);
        Assert.assertTrue(loginPage.getElement(loginPage.error_msg_2).isDisplayed());
        Thread.sleep(5000);
    }

    @Test(dataProvider = "invalidUserCredentials", dataProviderClass = DataSet.class)
    public void testLoginWithInvalidCredentials(String email, String password, String error_msg, String validation_msg){
        homePage.loadAnWebPage(homePage.home_page_url);
        homePage.clickElement(homePage.login_button);
        loginPage.writeElement(loginPage.email_input_field, email);
        loginPage.writeElement(loginPage.password_input_field, password);
        loginPage.clickElement(loginPage.login_button);
        if (loginPage.getElement(loginPage.error_msg).isDisplayed()){
            Assert.assertEquals(loginPage.getElement(loginPage.error_msg).getText(), error_msg);
            Assert.assertTrue(loginPage.getElement(loginPage.login_button).isDisplayed());

    }
        else {
            Assert.assertEquals(loginPage.getElement(loginPage.error_msg_2).getText(),validation_msg);
        }
}


}





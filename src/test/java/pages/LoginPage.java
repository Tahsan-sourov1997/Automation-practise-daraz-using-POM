package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public String login_page_url = "https://pages.daraz.com.bd/#?";
    public String login_page_title = "Homepage";
    public By email_input_field = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
    public By password_input_field = By.xpath("//input[@placeholder='Please enter your password']");
    public By error_msg = By.xpath("//div[text()='Invalid account or password.']");
    public By error_msg_2 = By.xpath("//div[text()='Please enter a valid phone number.']");
    public By login_button = By.xpath("//div[@class='iweb-button-mask']");
    public String email = "tahsanhossain776@gmail.com";
    public String password = "Tahsan2127#";
}

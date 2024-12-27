package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String home_page_url = "https://www.daraz.com.bd/#?";
    public By login_button = By.xpath("//a[normalize-space()='Login']");
    public String home_page_title = "Homepage";
}

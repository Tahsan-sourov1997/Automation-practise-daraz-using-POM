package pages;

import org.openqa.selenium.By;

public class FlashSellPage extends BasePage{
    public By flash_text = By.xpath("//p[normalize-space()='Flash Sale']");
    public By category_text = By.xpath("//p[normalize-space()='Categories']");
    public By logout_path_btn = By.xpath("//span[@id='myAccountTrigger']");
    public By logout_btn = By.xpath("//a[@id='account-popup-logout']");
}

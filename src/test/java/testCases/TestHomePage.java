package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.driverSetup;

public class TestHomePage extends driverSetup {
    HomePage homepage = new HomePage();
    @Test
    public void testHomePage(){
        homepage.loadAnWebPage(homepage.home_page_url);
        System.out.println(homepage.getPageTitle());
        Assert.assertEquals(homepage.getPageTitle(), homepage.home_page_title);
    }

}

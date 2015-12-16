package zadanie6;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by student08 on 16.12.15.
 */
public class zadanieTest {

    private static HomePage homePage;
    private static ZadanieHome zadanieHome;

    private static WebDriver webDriver;

    @BeforeClass
    public static void setUp()
    {
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }


    @Test
    public void newPageTest(){


        homePage= new HomePage(webDriver);
        zadanieHome = new ZadanieHome(webDriver);

        webDriver.navigate().to("https://testingcup.pgs-soft.com/");
        homePage.clickThisLink();
        zadanieHome.loginAss("username", "password");


    }

}

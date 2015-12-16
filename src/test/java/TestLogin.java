import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Created by student08 on 15.12.15.
 */
public class TestLogin {

    private static WebDriver webDriver;

    @BeforeClass
    public static void setUp()
    {
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void testLoginPage(){
        webDriver.navigate().to("https://owa.pgs-soft.com");
        //Assert.assertEquals("Logowanie",webDriver.getTitle());

        WebElement usenNameInput = webDriver.findElement(By.id("username"));
        WebElement passwordInput = webDriver.findElement(By.id("password"));

        WebElement singInButton = webDriver.findElement(By.className("signinbutton"));

        usenNameInput.sendKeys("login");
        passwordInput.sendKeys("password");
        singInButton.click();

        //System.out.println(usenNameInput.getAttribute("value"));

        Assert.assertTrue(isElemenPresent(By.id("signInErrorDiv")));
    }

    public boolean isElemenPresent(By by)
    {
        try{
            webDriver.findElement(by);
                    return true;
        }catch (NoSuchElementException e) {
            return false;
        }
    }

    @Test
    public void testRadioButton(){
        webDriver.navigate().to("http://codeseven.github.io/toastr/demo.html");
        List<WebElement> radioButton = webDriver.findElements(By.xpath("*//*[@id='toastTypeGroup']//input[@type='radio']"));


        for(WebElement wE: radioButton) {
            wE.click();
            Assert.assertTrue(wE.isEnabled());
        }
    }


    @Test
    public void testDropdown(){
        webDriver.navigate().to("https://testingcup.pgs-soft.com/");
        webDriver.findElement(By.linkText("Zadanie 8")).click();

        WebElement typKartyWE = webDriver.findElement(By.id("task8_form_cardType"));
        Select typKarty = new Select(typKartyWE);

        WebElement monthList = webDriver.findElement(By.id("task8_form_cardInfo_month"));
        Select month = new Select(monthList);
        month.selectByIndex(2);

     //   Assert.assertEquals("American Express", typKarty.getFirstSelectedOption().getText());
        Assert.assertEquals("March", month.getFirstSelectedOption().getText());

    }

/*    @AfterClass
    public static void tearDown(){
        webDriver.close();
        webDriver.quit();
    }*/
}

package zadanie6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student08 on 15.12.15.
 */
public class ZadanieHome {
    private ZadanieHomePage zadanieHomePage;

    public ZadanieHome(WebDriver driver) {

        zadanieHomePage = new ZadanieHomePage();
        PageFactory.initElements(driver,zadanieHomePage);
    }

    public void loginAss(String loginm, String pass){
        zadanieHomePage.login.sendKeys("user");
        zadanieHomePage.password.sendKeys("pass");
        zadanieHomePage.button.click();
    }
}

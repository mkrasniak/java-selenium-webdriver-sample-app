package zadanie6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student08 on 15.12.15.
 */
public class HomePage {
    private HomePageLocators homePageLocators;

    public HomePage(WebDriver driver){
        homePageLocators=new HomePageLocators();
        PageFactory.initElements(driver,homePageLocators);
    }

    public void clickThisLink(){
        homePageLocators.zadanie6Link.click();
    }
}

package zadanie6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by student08 on 15.12.15.
 */
public class HomePageLocators {

    @FindBy(how = How.XPATH, using = "html/body/div[1]/div/div/div[2]/div[6]/a")
    public WebElement zadanie6Link;

}

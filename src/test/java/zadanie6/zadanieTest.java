package zadanie6;

import org.junit.Test;

/**
 * Created by student08 on 16.12.15.
 */
public class zadanieTest {

    private static HomePage homePage;
    private static ZadanieHome zadanieHome;


    @Test
    public void newPageTest(){


        homePage.clickThisLink();
        zadanieHome.loginAss("username", "password");

    }

}

package page.Localisation;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LocalisationPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;





    //System
    @FindBy(css = "div.btn-event > span")
    private WebElement system;
    @FindBy(css = "#lang-select")
    private WebElement clickLanguage;

    @FindBy(css = "#users-list-menu-li > a")
    private WebElement clickUser;
    @FindBy (css = "div.mgr_member")
    private WebElement assertUserInLanguage;

    @FindBy (css = "div.mlpl_emptyList > span")
    private WebElement assertFalseUserForLanguage;


    private WebElement systemLan;
    //all language
    @FindBy(css = "#lang-list > ul > li:first-child")
    private WebElement russian;
    /**all language

     1 russian;
     2 english;
     3 belorussian;
     4 czech;
     5 spain;
     6 polish;
     7 portugal;
     8 dutch;
     9 france;
     10 italian;
     11 holland;
     12 fa;
     13 china;
     14 japan;
     */

    public LocalisationPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }
    public void setSystem () {clickOn(system);clickOn(clickLanguage);}

    public void setClickRussian () {clickOn(russian);}

    public void clickToLanguage(int number) throws InterruptedException {
        List<WebElement> results =  getDriver().findElements(By.cssSelector("#lang-list"));

        for (WebElement element : results) {
            setSystem();
            element.findElement(By.cssSelector("#lang-list > ul > li:nth-of-type(" + number + ")")).click();
           // setLinksUserLanguage();
            Thread.sleep(1000);
            number++;
        }

    }

}















package page.Registration;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class RegistrationPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Registration*/

    @FindBy(css  = "#server-name-prompt > a")
    private WebElement clickEditRegistr;
    @FindBy(css = "#reg-serial")
    private WebElement inputRegistar;
    @FindBy (css = "#reg > a.button")
    private WebElement clickTheButton;

    /*AssertTrue*/
    @FindBy (css = "span.note-msg")
    private WebElement assertRegistr;
    /*AssertFalse*/
    @FindBy (css = "#wr-reg-serial > div.error > div")
    private WebElement assertRegistrEmpty;

    public RegistrationPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }
    public void setClickEditRegistr() {
        clickOn(clickEditRegistr);
    }
    public void setInputRegistar(String key)  {enter(key).into(inputRegistar);}
    public void setClickTheButton(){clickOn(clickTheButton);}
    //Assert true
    public void setAssertRegistr(String text) {
        WebElement assertRegistr   = (new WebDriverWait(getDriver(), 60))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.note-msg")));
        assertTrue(text, element(assertRegistr).isPresent());
    }
    //Assert false
    public void setAssertFalse(String textFalse) {
        assertTrue(textFalse,element(assertRegistrEmpty).isPresent());
    }
}






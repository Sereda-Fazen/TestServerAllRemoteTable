package page.H323;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class Page323 extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*H323*/

    @FindBy(css  = "#network--menu-li > ul.children-list > li:nth-of-type(4) > a")
    private WebElement clickServerH323;



    /*H323 Getekeeper*/

    @FindBy(css = "#default-host-name")
    private WebElement inputServerH323;
    @FindBy (css = "#default-login")
    private WebElement loginH323;
    @FindBy (css  = "#default-extension")
    private WebElement DialedH323;
    @FindBy (css  = "#default-pwd")
    private WebElement passH323;
    @FindBy (css  = "#default-registerstrategy")
    private WebElement clickReistrationH323;

    @FindBy (xpath  = "//*[@id='default-registerstrategy']/option[2]")
    private WebElement checkReistrationH323;

    //Save
    @FindBy (css  = "#save-sip-tel-and-default")
    private WebElement saveH3233;


    /*AssertTrue*/
    @FindBy (css = "#server-status > span:nth-of-type(2)")
    private WebElement assertH323;

    @FindBy (css  = "div.btn-arrow")
    private WebElement rebutServer;
    @FindBy (css  = "div.btn-list > ul > li:nth-of-type(2)")
    private WebElement restartServer;
    @FindBy (css  = " div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.dialog-question-form.ui-draggable.ui-dialog-buttons > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement ok;



    public Page323(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }
    //Click H323
    public void setLinkH323() {
        clickOn(clickServerH323);
    }
    //Getekeeper
    public void setServerH323()  {enter("192.168.71.27").into(inputServerH323);}
    public void setLoginH323(String text) {enter(text).into(loginH323);}
    public void setDialedH323() {enter("496").into(DialedH323);}


    public void setPassH323() {
        enter("123456").into(passH323);}
    public void setRegistrationH323() {
        clickOn(clickReistrationH323);
        clickOn(checkReistrationH323);}

    /*Save*/

    public void setSaveH323()  {clickOn(saveH3233);}

    public void setRestartH323 () throws  InterruptedException{
        clickOn(rebutServer);
        clickOn(restartServer);
        clickOn(ok);
        Thread.sleep(40000);
        assertTrue(element(assertH323).isPresent());}










}






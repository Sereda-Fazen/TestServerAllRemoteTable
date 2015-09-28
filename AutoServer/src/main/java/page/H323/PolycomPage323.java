package page.H323;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class PolycomPage323 extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Polycom*/

    @FindBy(css  = "#topNavMenu > td:first-child")
    private WebElement clickCallPolycom;



    @FindBy(css = "#dialnumber")
    private WebElement inputH323Polycom;
    @FindBy (css = "#calltype")
    private WebElement checkH323;
    @FindBy (xpath = "//*[@id='calltype']/option[2]")
    private WebElement clickH323;


    @FindBy (css  = "#dialimage")
    private WebElement call;

    /*AssertTrue*/
    @FindBy (xpath  = "//*[@id='dialimage'")
    private WebElement assertH323;


    public PolycomPage323(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }

    //Polycom
    public void setClickCall() {
        clickOn(clickCallPolycom);}
    public void setInputNumber() {
        getDriver().switchTo().frame("contentFrame");
        enter("alex@192.168.61.91").into(inputH323Polycom);}
    public void setCheckH323() {
        clickOn(checkH323);
        clickOn(clickH323);}
    public void setCall() {
        clickOn(call);}

    //Assert
    public void setAssertCall () {
        assertTrue(element(assertH323).isPresent());}








}






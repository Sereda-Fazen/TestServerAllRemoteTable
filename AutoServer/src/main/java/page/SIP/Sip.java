package page.SIP;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Sip extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Sip*/

    @FindBy(css  = "#network-sip-menu-li > a")
    private WebElement clickSip;
    @FindBy(css = "#tel-host-name")
    private WebElement inputIP;
    @FindBy (css = "#tel-login")
    private WebElement loginSip;
    @FindBy (css  = "#tel-pwd")
    private WebElement passSip;
    @FindBy (css  = "#tel-registerstrategy")
    private WebElement clickReistration;

    @FindBy (xpath  = "//*[@id='tel-registerstrategy']/option[2]")
    private WebElement checkReistrationOption;
    @FindBy (css  = "#save-sip-tel-and-default")
    private WebElement saveSip;


    /*Sip Proxy*/

    @FindBy(css = "#default-host-name")
    private WebElement inputIPProxy;
    @FindBy (css = "#default-login")
    private WebElement loginSipProxy;
    @FindBy (css  = "#default-pwd")
    private WebElement passSipProxy;
    @FindBy (css  = "#default-registerstrategy")
    private WebElement clickReistrationProxy;
    @FindBy (xpath  = "//*[@id='default-registerstrategy']/option[2]")
    private WebElement checkReistrationProxy;



    /*AssertTrue*/
    @FindBy (css = "#tel-status > span.green")
    private WebElement assertSip;

    @FindBy (css = "#default-status > span.green")
    private WebElement assertProxy;

    @FindBy (xpath = "//*[@id='default-status']/span")
    private WebElement assertSip1;

    /*Assert server*/
    @FindBy (css = "span.red")
    private WebElement assertFalseSip;


    public Sip(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }
    public void setClickSip() {
        clickOn(clickSip);
    }
    public void setIp(String serverVoip)  {enter(serverVoip).into(inputIP);}

    public void setLoginSip(String loginVoip) {enter(loginVoip).into(loginSip);}
    public void setPassSip(String passVoip) { enter(passVoip).into(passSip);}
    public void setRegistration() {
        clickOn(clickReistration);
        clickOn(checkReistrationOption);
    }

    /*Invalid case*/

    public void setSave() {
        clickOn(saveSip);
    }


    public void setAssertSip (String textIp) {
        WebElement assertSip   = (new WebDriverWait(getDriver(), 25))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#tel-status > span.green")));
                assertTrue(textIp, element(assertSip).isPresent());}
    public void setAssertLogin (String textLogin) {
        WebElement assertFalseSip   = (new WebDriverWait(getDriver(), 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.red")));
        assertTrue(textLogin, element(assertFalseSip).isPresent());}
    public void setAssertServer (String textServer) {
        WebElement assertFalseSip   = (new WebDriverWait(getDriver(), 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.red")));
        assertTrue(textServer, element(assertFalseSip).isPresent());}


   /*Подключение Sip Proxy */

    public void setIpProxy(String idProxy)  {enter(idProxy).into(inputIPProxy);}
    public void setLoginSipProxy(String login) {enter(login).into(loginSipProxy);}
    public void setPassSipProxy(String pass) { enter(pass).into(passSipProxy);}

    public void setRegistrationProxy() {
        clickOn(clickReistrationProxy);
        clickOn(checkReistrationProxy);
    }

    public void setSaveTrueSipProxy(String textSip)throws InterruptedException {
        clickOn(saveSip);
        WebElement assertProxy   = (new WebDriverWait(getDriver(), 30))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#default-status > span.green")));
        assertTrue(textSip, element(assertProxy).isPresent());






    }


}






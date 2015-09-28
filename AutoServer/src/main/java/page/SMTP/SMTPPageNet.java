package page.SMTP;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class SMTPPageNet extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*SMTP*/

    @FindBy(css  = "#network-smtp-menu-li > a")
    private WebElement clickSmtpPage;
    @FindBy(css = "#authentication-type")
    private WebElement typeAuth;
    @FindBy (xpath = "//*[@id='authentication-type']/option[2]")
    private WebElement typePass;
    @FindBy (css  = "#host")
    private WebElement hostSmtp;
    @FindBy (css  = "#port")
    private WebElement portSmtp;

    @FindBy (css  = "#login")
    private WebElement loginSmtp;
    @FindBy (css  = "#password")
    private WebElement passSmtp;

    @FindBy (css  = "#use-ssl")
    private WebElement ssl;
    @FindBy (css  = "#email")
    private WebElement emailAdminEnter;

    @FindBy (css  = "#smtp-check-connect-btn")
    private WebElement connectSmtp;



    @FindBy (css  = "#restart_notification")
    private WebElement sendAdmin;
    @FindBy (css  = "#suppress_missed_call_mail")
    private WebElement missed;
    @FindBy (css  = "#suppress_conf_invite_mail")
    private WebElement confMail;
    @FindBy (css  = "#smtp-func-block > a.button")
    private WebElement applySmtp;

    //Assert true
    @FindBy (css  = "#default-status > span.green")
    private WebElement assertSmtp;
    //AssertFalse
    @FindBy (css  = "span.red")
    private WebElement assertFalseSmtp;


    public SMTPPageNet(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }
    public void setСlickSmtpPage() {
        clickOn(clickSmtpPage);
        WebElement assertFalseSmtp   = (new WebDriverWait(getDriver(), 10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.red")));
        assertTrue(element(assertFalseSmtp).isPresent());}
    public void setСheckTypeAuth()  {clickOn(typeAuth); clickOn(typePass);}
    public void setEnterHost(String hostSMTP) {
        enter(hostSMTP).into(hostSmtp);}
    public void setEnterPort(String portSMTP) { enter(portSMTP).into(portSmtp);}
    public void setEnterLoginSMTP(String loginSMTP) {enter(loginSMTP).into(loginSmtp);}
    public void setEnterPassSMTP(String passSMTP) {enter(passSMTP).into(passSmtp);}
    public void setClickSsl() { clickOn(ssl);}
    public void setEmailAdmin(String emailAdmin) { enter(emailAdmin).into(emailAdminEnter);}
    public void setConnectSmtp() { clickOn(connectSmtp);

    }

    public void setAllChecks() {
        clickOn(sendAdmin);clickOn(missed);clickOn(confMail);
    }
    public void setApplySmtp() throws InterruptedException {clickOn(applySmtp);
    }
    public void setAssertSmtp(){
        assertTrue(element(assertSmtp).isPresent());

    }
    public void setAssertSmtpFalse(String textSmtp){
        assertTrue(textSmtp, element(assertFalseSmtp).isPresent());
    }


}






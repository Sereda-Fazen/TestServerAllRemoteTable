package page.WebSettings;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class WebSettingsPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Web Settings*/

    @FindBy(css = "#web-settings-menu-li > a")
    private WebElement clickWebSet;
    //admin
    @FindBy(css = "#admin_contacts-fio")
    private WebElement webName;
    @FindBy(css = "#admin_contacts-email")
    private WebElement webMail;
    @FindBy(css = "#admin_contacts-phone")
    private WebElement webPhone;
    @FindBy(css = "#admin_contacts > a.button")
    private WebElement linkApp;


    @FindBy(css = "#client-installer-block > div:first-child > input")
    private WebElement IpWin;
    @FindBy(css = "#client-installer-block > div:nth-of-type(2) > input")
    private WebElement IpMac;


    @FindBy(css = "div > input.text")
    private WebElement outdoorUrl;
    @FindBy(css = "#domain > a.button")
    private WebElement outdoorApply;


    @FindBy(css = "div.content-container > fieldset:nth-of-type(4) > a:nth-of-type(2)")
    private WebElement logo;


    @FindBy(css = "b > a")
    private WebElement webTrueConf;



    public WebSettingsPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }


    public void setClickWebSet() {
        clickOn(clickWebSet);
    }
    public void setWebGuest()  {
        enter("Alex").into(webName);
        enter("sereda@trueconf.ua").into(webMail);
        enter("0936631070").into(webPhone);
        clickOn(linkApp);
    }
    public void setLinkApp() {
        clickOn(IpWin);
        clickOn(IpMac);
    }
    public void setOutdoorIp() {
        enter("192.168.61.91:8888").into(outdoorUrl);
        clickOn(outdoorApply);
    }
    public void setLogo()  {
        clickOn(logo);
    }

}



























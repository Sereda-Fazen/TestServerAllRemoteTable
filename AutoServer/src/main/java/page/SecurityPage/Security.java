package page.SecurityPage;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static junit.framework.Assert.assertTrue;


public class Security extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;

    /*Панель администратора*/

    @FindBy (css  = "#web-security-menu-li > a")
    private WebElement clickLinkSecurity;
    @FindBy (css  = "#security-flag")
    private WebElement checkBox;
    @FindBy (css  = "#security-mask")
    private WebElement clearIP;
    @FindBy (css  = "#security > a.button")
    private WebElement netIP;


    /*Панель API*/

    @FindBy (css  = "#api-status-security")
    private WebElement deleteKey;
    @FindBy (css  = "#api > a.button.btn_green")
    private WebElement key;
    @FindBy (css  = "#default-registerstrategy")
    private WebElement registrationKey;
    @FindBy (css  = "#api > a:nth-of-type(2)")
    private WebElement apiUpdate;



    /*AssertTrue*/
    @FindBy (css = "span.note-msg > a")
    private WebElement assertSecurity;



    public Security(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }
    /*Панель администратора*/
    public void setLinkSecurity() {clickOn(clickLinkSecurity);
    }
    public void setCheckBox()  {clickOn(checkBox);}
    public void setClearIP() {enter("").into(clearIP);}
    public void setNetIP() { clickOn(netIP);}
    /*API*/
    public void setDeleteKey() {enter(" ").into(deleteKey);}
    public void setKey() {clickOn(key);}
    public void setApiUpdate() {clickOn(apiUpdate);}

    public void setSecurityAssert() {
        assertTrue(element(assertSecurity).isPresent());
    }

}






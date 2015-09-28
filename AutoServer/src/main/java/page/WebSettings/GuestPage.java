package page.WebSettings;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.*;

public class GuestPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Guest page*/


    //download
    //win
    @FindBy(css = "#tabs > div:nth-of-type(1) > center > div > a.btn_square")
    private WebElement dowloadWin;
    //mac
    @FindBy(css = "ul.ui-tabs-nav.ui-helper-reset.ui-helper-clearfix.ui-widget-header.ui-corner-all > li:nth-of-type(2) > a > img")
    private WebElement dowloadMac;
    @FindBy(css = "#tabs > div:nth-of-type(2) > center > div > a.btn_square > span")
    private WebElement dowloadLink;

    //android
    @FindBy(css = "ul.ui-tabs-nav.ui-helper-reset.ui-helper-clearfix.ui-widget-header.ui-corner-all > li:nth-of-type(4) > a > img")
    private WebElement dowloadAndroid;
    @FindBy(css = "tr > td:nth-of-type(4) > a.btn_square > span")
    private WebElement dowloadLink3;


    //admin page
    @FindBy(css = "#home-header > div > a")
    private WebElement clickAdmin;
    @FindBy(css = "#rawlogin")
    private WebElement inputName;
    @FindBy(css = "#rawpassword")
    private WebElement inputPass;
    @FindBy(css = "a.button")
    private WebElement clickEnter;


    //assert Admin
    @FindBy(css = "#auth-logout-menu-li > a")
    private WebElement assertAdmin;
    //false assert
    @FindBy(css = "span.error-msg")
    public WebElement assertFalseEnter;


    public GuestPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }




    public void setDownload() throws  InterruptedException {
        clickOn(dowloadWin);
        Thread.sleep(2000);}
    public void setDownloadMac() throws  InterruptedException {
        clickOn(dowloadMac);
        clickOn(dowloadLink);
        Thread.sleep(2000);}
    public void setDownloadAndr() throws  InterruptedException {
        clickOn(dowloadAndroid);
        clickOn(dowloadLink3);
        Thread.sleep(2000);
    }

   // admin valid
    public void setValid() {
        clickOn(clickAdmin);
    }
    public void setValidName(){
        enter("tc_admin").into(inputName);
    }
    public void setValidPass(){
        enter("qweASD123").into(inputPass);
    }
    public void setValidEnter() {
        clickOn(clickEnter);
    }


    // admin invalid
    public void setAdminInvalid() {
        clickOn(clickAdmin);
    }
    public void setAdminInvalidName(){
        enter("test").into(inputName);
    }
    public void setAdminInvalidPass(){
        enter("fJ4qEn5Y").into(inputPass);
    }
    public void setAdminInvalidEnter() {
        clickOn(clickEnter);
    }


    public void setAssertAdmin(String assertUser) throws InterruptedException {
        assertFalse("Неправильный ввод логина или пароля", element(assertFalseEnter).isPresent());
        assertTrue(assertUser,element(assertAdmin).isPresent());
        Thread.sleep(5000);
    }
    public void setAssertAdminFalse() throws InterruptedException {
        assertEquals(true, element(assertFalseEnter).isPresent());
        Thread.sleep(5000);
    }


}



























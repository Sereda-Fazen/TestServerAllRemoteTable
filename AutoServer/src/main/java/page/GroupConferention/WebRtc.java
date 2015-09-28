package page.GroupConferention;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;


public class WebRtc extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;


    /**
     * WebRTC
     */
    @FindBy(css = "#conferences-list-menu-li > a")
    private WebElement ClickGroup;
    @FindBy(css = "[name=\"key\"]")
    private WebElement radioButtonGroup;
    @FindBy(css = "tbody > tr:nth-of-type(2) > td:first-child > input.radio.key")
    private WebElement radioButtonGroupGuest;

    @FindBy(css = "#edit-button")
    private WebElement clickEdit;
    @FindBy(css = "div > div:nth-of-type(7) > table > tbody > tr:first-child > td:nth-of-type(2) > a")
    private WebElement clickWebRTC;
    //Assert
    @FindBy(css = "#conferenceName")
    private WebElement webRtcAssert;
    //Help
    @FindBy(css = "#showHelpBtn")
    private WebElement clickHelp;
    @FindBy(css = "[name=\"webrtc\"] > a\n")
    private WebElement clickHelpBrowser;
    @FindBy(css = "#expandPlatforms > a")
    private WebElement clickHelpOther;
    @FindBy(css = "[name=\"vcs\"] > a")
    private WebElement clickHelpVideo;
    @FindBy(css = "#hideHelpBtn")
    private WebElement returnToConference;
    @FindBy(css = "li.defaultClient.visible > a.blueBtn > span")
    private WebElement linkDownload;
    //Guest
    @FindBy(css = "#showGuestAuthForm")
    private WebElement enterGuest;
    @FindBy(xpath = "//*[@id='guestNameField']/input[2]")
    private WebElement enterGuestName;
    @FindBy(css = "#guestAuthForm > input")
    private WebElement clickEnter;
    //Assert join
    @FindBy(css = "#logoutBtn")
    private WebElement assertJoin;
    //Logout
    @FindBy(css = "#logoutBtn")
    private WebElement logout;
    @FindBy(css = "body > div:nth-of-type(3) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement exit;
    @FindBy(xpath = "//*[@id='joinBtn']/div")
    private WebElement clickJoin;

    @FindBy(css = "#webrtcDefaultControls > div:nth-of-type(2)")
    private WebElement assertJoinIn;
    //Assert Exit Guest
    @FindBy(css = "#headerAuthBtn")
    private WebElement assertExitGuest;

    @FindBy(css = "#guestAuthForm > input")
    private WebElement assertExitGuestPage;
    @FindBy(css = "#scheduled > div.time")
    private WebElement assertTime;


    //Auth user
    @FindBy(css = "#showUserAuthForm")
    private WebElement enterUser;

    @FindBy(css = "#fieldLogin")
    private WebElement inputLogin;
    @FindBy(css = "#userPasswordWrapper > input.placeholder")
    private WebElement inputPass;
    @FindBy(css = "#userAuthForm > input")
    private WebElement enterRtc;
    //Assert user RtC
    @FindBy(css = "#joinBtn > div.text")
    private WebElement assertUserRtc;


    public WebRtc(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }

    /**
     * Create new group for conference
     */
    public void setClickGroup() {
        clickOn(ClickGroup);
    }

    public void setEditGroup() throws InterruptedException {
        clickOn(radioButtonGroup);
        clickOn(clickEdit);
    }

    public void setEditGroupGuest() throws InterruptedException {
        clickOn(radioButtonGroup);
        clickOn(clickEdit);
    }

    public void setClickWerRTC() {
        clickOn(clickWebRTC);
        assertTrue(element(webRtcAssert).isPresent());
    }

    public void setHelp() {
        clickOn(clickHelp);
    }

    public void setHelpBrowser() {
        clickOn(clickHelpBrowser);
    }

    public void setHelpOther() {
        clickOn(clickHelpOther);
    }

    public void setHelpDownload() {
        clickOn(linkDownload);
    }

    public void setHelpVideo() {
        clickOn(clickHelpVideo);
    }

    public void setHelpReturn() {
        clickOn(returnToConference);
    }

    public void setEnterHowGuest(String questName) throws InterruptedException {

        clickOn(enterGuest);

        Actions quest = new Actions(getDriver());
        quest.moveToElement(enterGuestName);
        quest.click();
        quest.sendKeys(questName);
        quest.build().perform();

        Actions enter = new Actions(getDriver());
        enter.moveToElement(clickEnter);
        enter.click();
        enter.build().perform();

        Thread.sleep(2000);
    }

    public void setQuiteFromGuestUser() throws InterruptedException {
        clickOn(clickJoin);
        assertTrue(element(assertJoin).isPresent());
        Thread.sleep(1000);
        clickOn(logout);
        clickOn(exit);
    }
    public void setForExitFromGuestPage(String assertExit) {
        assertTrue(assertExit, element(assertExitGuest).isPresent());
    }

    public void setAssertRTC(String join) {
        assertTrue(join, element(assertJoinIn).isPresent());
    }
    //Auth

    public void setLogin(String loginRtc, String passRtc) {

        //clickOn(enterUser);
        Actions login = new Actions(getDriver());
        login.moveToElement(inputLogin).click();
        login.click();
        login.sendKeys(loginRtc);
        login.build().perform();

        Actions pass = new Actions(getDriver());
        pass.moveToElement(inputPass);
        pass.click();
        pass.sendKeys(passRtc);
        pass.build().perform();
        clickOn(enterRtc);
    }

    public void setEnterAuth(String enterUserRTC) {
        assertTrue(enterUserRTC, element(assertUserRtc).isPresent());
    }

    public void setExpectedResultForExitFromUser(String assertWait) throws InterruptedException {
        assertTrue(assertWait, element(assertTime).isPresent());
        Thread.sleep(1000);
        clickOn(logout);
        clickOn(exit);
    }
}











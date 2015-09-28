package page.SttingsNet;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class SettingsNetPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Settings*/

    @FindBy(css = "#network-address-menu-li > a")
    private WebElement clickSettingsNet;

    //Checkbox
    @FindBy(css = "#network_inside_all_ip")
    private WebElement clickCheckBoxNet;
    @FindBy(css = " #network_external_ip")
    private WebElement clickExternalCheckBoxNet;



    // Add
    @FindBy(css = "#add-accept-address")
    private WebElement clickAddSet;
    @FindBy(css = " #add-external-address")
    private WebElement clickAddExternalSet;


    @FindBy(css = "#host")
    private WebElement inputHost;
    @FindBy(css = "#port")
    private WebElement inputPort;
    @FindBy(css = "div.ui-dialog-buttonset > button:nth-of-type(3) > span.ui-button-text")
    private WebElement hoseSave;





    @FindBy(css = "#reset-accept-address")
    private WebElement reset;
    @FindBy(css = "#reset-external-address")
    private WebElement resetExternal;


    @FindBy(css = "#update-accept-hosts")
    private WebElement update;
    @FindBy(css = "#update-external-hosts")
    private WebElement updateExternal;


    //Restart server
    @FindBy(css = "span.note-msg > a")
    private WebElement restart;
    @FindBy(css = "div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-draggable.ui-dialog-buttons.dialog-question-form > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement doYouWantRestart;

    //Assert
    @FindBy(css = "#server-status > span:nth-of-type(2)")
    private WebElement assertServer;




    public SettingsNetPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }


    public void setSettingsNet() {
        clickOn(clickSettingsNet);
    }
    public void setCheckBox() throws InterruptedException {
        clickOn(clickCheckBoxNet);
    }
    public void setAddIp() {
        clickOn(clickAddSet);
    }
    public void setAddIpNet() {
        enter("192.168.90.1").into(inputHost);
        enter("4136").into(inputPort);
        clickOn(hoseSave);
    }

    public void setResetNet() throws InterruptedException {
        clickOn(reset);
        clickOn(clickCheckBoxNet);
    }

    public void setApply() throws InterruptedException {
        clickOn(update);
        Thread.sleep(3000);
    }
    //External
    public void setCheckBoxExternal() throws InterruptedException {
        clickOn(clickExternalCheckBoxNet);
    }
    public void setAddIpExternal() {
        clickOn(clickAddExternalSet);
    }
    public void setAddIpNetExternal() {
        enter("192.168.91.61").into(inputHost);
        enter("4307").into(inputPort);
        clickOn(hoseSave);
    }
    public void setResetNetExternal() throws InterruptedException {
        clickOn(resetExternal);
        clickOn(clickExternalCheckBoxNet);
    }
    public void setApplyExternal() throws InterruptedException {
        clickOn(updateExternal);
        Thread.sleep(3000);
    }



    public void setRestart() throws InterruptedException {
        clickOn(restart);
        clickOn(doYouWantRestart);
    }
    public void setRestartAssert()  {

        WebElement assertServer   = (new WebDriverWait(getDriver(), 25))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#server-status > span:nth-of-type(2)")));
        assertTrue(element(assertServer).isPresent());
    }




}



























package page.Settings;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class SettingsPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Settings*/

    @FindBy(css  = "#general-config-menu-li > a")
    private WebElement clickSettings;


    //Path
    @FindBy(css = "#workingdirectory-path")
    private WebElement clickPath;
    @FindBy (css = "#C\\3A\\/TrueConf_anchor")
    private WebElement clickPathFolder;
    @FindBy (css = "body > div:nth-of-type(8) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement clickSaveFolder;
    @FindBy (css = "#workingdirectory > a.button")
    private WebElement clickApply;

    @FindBy(css = "#workdirectory > input.text")
    private WebElement inputPath;



    //Reports
    @FindBy (css = "#server-debug")
    private WebElement clickReports;
    @FindBy (css = "table.general-buttons > tbody > tr:nth-of-type(2) > td:first-child > a.button")
    private WebElement clickMagazine;
    @FindBy (css = "tbody > tr:nth-of-type(2) > td:nth-of-type(2) > a.button")
    private WebElement clickUses;



    //Config
    @FindBy (css  = "#save-config")
    private WebElement clickSaveConfig;



    //App
    @FindBy (css  = "tr.TrueConf-Client > td.app-setup-url > a")
    private WebElement clickApp;
    @FindBy (css  = "tr.TrueConf-Mac-Os-X > td.app-setup-url > a")
    private WebElement clickAppMac;


    // Settings App
    @FindBy (css  = "#shared-key")
    private WebElement inputKey;


   //////////// //Runner////////
    @FindBy (css  = "#cb_maxbw")
    private WebElement checkBit;

    @FindBy (css  = "a.ui-slider-handle.ui-state-default.ui-corner-all")
    private WebElement clickRunner;


    @FindBy (css  = "div.slider.ui-slider.ui-slider-horizontal.ui-widget.ui-widget-content.ui-corner-all")
    private WebElement drop;




    @FindBy (css  = "#maxfps")
    private WebElement checkFps;
    @FindBy (xpath  = "//*[@id='maxfps']/option[2]")
    private WebElement checkNumFps;
    @FindBy (css  = "#framesize")
    private WebElement checkFramesize;
    @FindBy (xpath  = "//*[@id='framesize']/option[3]")
    private WebElement checkNumSize;












    //Save
    @FindBy (css  = "#save-application-settings")
    private WebElement clickSaveSet;



    /*Assert setting*/
    @FindBy (css = "span.note-msg")
    private WebElement saveAssert;

    // Настройки
    public SettingsPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    //Выбор папки
    public void setSettings() {
        clickOn(clickSettings);
    }
    public void setPath() throws InterruptedException {
        clickOn(clickPath);

    }
    public void setPathInput() throws InterruptedException {
        enter("C:/TrueConf").into(inputPath);

    }
    public void setPathFolder() throws InterruptedException {
        clickOn(clickPathFolder);

    }
    public void setPathSaveFolder() throws InterruptedException {
        clickOn(clickSaveFolder);

    }
    public void setPathAplly() throws InterruptedException {
        clickOn(clickApply);

    }

    // Отчеты
    public void setReports() throws  InterruptedException{
        clickOn(clickReports);

    }
    //Конфинурация
    public void setConfig() throws InterruptedException{
        clickOn(clickSaveConfig);
        Thread.sleep(5000);
    }
    public void setAppWin() throws InterruptedException {
        clickOn(clickApp);
        Thread.sleep(5000);
    }
    public void setAppMac()throws InterruptedException {
        clickOn(clickAppMac);
    }

    // Настройки приложения
    public void setSetApp() throws InterruptedException {enter("test").into(inputKey);}
    public void setCheckBit() throws InterruptedException {  clickOn(checkBit);
        clickOn(clickRunner);}
    public void setFps() throws InterruptedException {  clickOn(checkFps);
        clickOn(checkNumFps);}
    public void setFramesize() throws InterruptedException {   clickOn(checkFramesize);
        clickOn(checkNumSize);
        Thread.sleep(2000);}


    public void setSet() {
        clickOn(clickSaveSet);

    }
    public void setAssert (){
        assertTrue(element(saveAssert).isPresent());
    }



















}






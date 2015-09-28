package steps.SettingsSteps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Settings.SettingsPage;


public class SettingsSteps extends ScenarioSteps {
    SettingsPage SettingsPage;

    public SettingsSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        SettingsPage loginPage = getPages().get(SettingsPage.class);
        loginPage.open();
    }

    @Step("Клик на ссылку - <strong>Настройки</strong>" )

    public void addSettings() {
        SettingsPage.setSettings();
    }

    /*Путь к папке*/

    @Step("Выбор папки")
    public void addSettingPath() throws InterruptedException{
        addPath();
        addPathInput();
        addPath2();
        addPath3();
        addPath4();
    }
    @Step("Клик на путь")
    public void addPath() throws InterruptedException{
        SettingsPage.setPath();  }

    @Step("Ввод в путь")
    public void addPathInput () throws InterruptedException{
        SettingsPage.setPathInput();  }


    @Step("Выбор папки")
    public void addPath2() throws InterruptedException{
        SettingsPage.setPathFolder();
    }
    @Step("Сохранить папку")
    public void addPath3() throws InterruptedException{
        SettingsPage.setPathSaveFolder();
    }
    @Step("Применить")
    public void addPath4() throws InterruptedException{
        SettingsPage.setPathAplly();
    }



    /*Отчеты*/
    @Step("Клик чекбокс")
    public void addReport() throws InterruptedException {
        SettingsPage.setReports();
    }

    /*Конфинурация*/
    @Step("Конфигурации")
    public void addConfig() throws InterruptedException {
        SettingsPage.setConfig();
    }


    /*Приложения*/
    @Step("Клик TrueConf для Windows")
    public void addApp2() throws InterruptedException{
        SettingsPage.setAppWin();
    }
    @Step("Клик TrueConf для MacOS")
    public void addApp3() throws InterruptedException{
        SettingsPage.setAppMac();  }
    @Step ("Приложения")
    public void addApp () throws InterruptedException {
       // addApp2();
       // addApp3();
    }


    /*Настройки приложения*/


    @Step ("Настройки приложения")

    public void addSetApp () throws InterruptedException {
        addSetApp2();
        //addCheckBit();
        addFps();
        addFramesize();
    }

    @Step("Ввод ключа для гостевых соединений")
    public void addSetApp2() throws InterruptedException{
        SettingsPage.setSetApp();
    }
    @Step("Выбор ограничение битрейта пользователя")
    public void addCheckBit() throws InterruptedException{
        SettingsPage.setCheckBit();
    }
    @Step("Выбор FPS пользователя")
    public void addFps() throws InterruptedException{
        SettingsPage.setFps();
    }
    @Step("Выбор ограничение размера кадра в пикселях")
    public void addFramesize() throws InterruptedException{
        SettingsPage.setFramesize();
         }


    @Step ("Клик 'Сохранить'")
    public void addSet() {SettingsPage.setSet();}

    @Step ("Ожидаемый результат - <strong>Настройки сохранены</strong>")
    public void addAssert() {SettingsPage.setAssert();}




}



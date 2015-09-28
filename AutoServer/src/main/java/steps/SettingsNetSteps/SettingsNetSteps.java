package steps.SettingsNetSteps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.SttingsNet.SettingsNetPage;


public class SettingsNetSteps extends ScenarioSteps {
    SettingsNetPage SettingsPage;

    public SettingsNetSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        SettingsNetPage loginPage = getPages().get(SettingsNetPage.class);
        loginPage.open();
    }

    @Step("Клик на ссылку - <strong>Настройки сети</strong>" )

    public void addSettingsNet() {
        SettingsPage.setSettingsNet();
    }

    @Step("Внутрений  адрес'")
    public void addAcceptIp() throws InterruptedException{
        addCheckBox();
        addAddIpPort();
        addIpNet();
        addResetNet();
        addCheckBox();
        addApply();
    }



    @Step("Клик - 'Использовать все IP адреса'")
    public void addCheckBox() throws InterruptedException{
        SettingsPage.setCheckBox();

        }
    @Step("Клик - 'Добавить Ip'")
    public void addAddIpPort() throws InterruptedException{
        SettingsPage.setAddIp();
    }
    @Step("Ввод  - 'Добавить Ip адрес и порт' ")
    public void addIpNet() throws InterruptedException{
        SettingsPage.setAddIpNet();
    }
    @Step("Клик - 'Сброс Ip адрес' ")
    public void addResetNet() throws InterruptedException{
        SettingsPage.setResetNet();
    }
    @Step("Клик - 'Применить Ip адрес' ")
    public void addApply() throws InterruptedException{
        SettingsPage.setApply();
    }

    //External

    @Step("Внешний адрес'")
    public void addExternalIp() throws InterruptedException{
        addCheckBoxEternal();
        addIpNetExternal();
        addAddIpNetExternal();
        addResetNetExternal();
        addApplyExternal();
    }

    @Step("Клик - 'Указать'")
    public void addCheckBoxEternal() throws InterruptedException{
        SettingsPage.setCheckBoxExternal();
    }
    @Step("Клик - 'Добавить Ip адрес' ")
    public void addIpNetExternal() throws InterruptedException{
        SettingsPage.setAddIpExternal();
    }
    @Step("Ввод  - 'Добавить Ip адрес и порт' ")
    public void addAddIpNetExternal() {
        SettingsPage.setAddIpNetExternal();
    }
    @Step("Клик - 'Сброс Ip адрес' ")
    public void addResetNetExternal() throws InterruptedException{
        SettingsPage.setResetNetExternal();
    }
    @Step("Клик - 'Применить Ip адрес' ")
    public void addApplyExternal() throws InterruptedException{
        SettingsPage.setApplyExternal();
    }
    @Step("Клик перезагрузка сервера")
    public void addRestart() throws InterruptedException{
        SettingsPage.setRestart();
    }
    @Step ("Ожидаемый результат")
    public void addAssertIP(){
        SettingsPage.setRestartAssert();
    }

}




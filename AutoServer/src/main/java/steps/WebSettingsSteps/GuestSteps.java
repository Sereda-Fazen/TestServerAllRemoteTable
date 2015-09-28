package steps.WebSettingsSteps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.WebSettings.GuestPage;


public class GuestSteps extends ScenarioSteps {
    GuestPage Guest;

    public GuestSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void start_browser() {
        GuestPage loginPage = getPages().get(GuestPage.class);
        loginPage.open();
    }

    @Step ("Выбор загруски для ОС")
    public void addDownload() throws  InterruptedException{
        addDownload2();
        addDownload3();
        addDownload5();
    }
    @Step ("Клик на загрузку 'TrueConf Client для Windows'")
    public void addDownload2() {
    }
    @Step ("Клик на загрузку 'TrueConf Client для Mac OS'")
    public void addDownload3() {
    }
    @Step ("Клик на загрузку 'TrueConf для Android'")
    public void addDownload5() throws InterruptedException{
        Guest.setDownload();
    }

    @Step ("Клик  'Вход для администратора'")
    public void addAdmin() {
        addAdminEnter();
        addValidName();
        addValidPass();
        addAdminValidEnter();

    }
    @Step ("Ввод")
    public void addAdminEnter() {
        Guest.setValid();
    }
    @Step ("Ввод валидного логина")
    public void addValidName() {
        Guest.setValidName();
    }
    @Step ("Ввод пароля")
    public void addValidPass() {
        Guest.setValidPass();
    }
    @Step ("Клик 'Войти'")
    public void addAdminValidEnter() {
        Guest.setValidEnter();
    }


    @Step ("Ожидаемый результат")
    public void addAssertAdmin(String assertUser) throws InterruptedException{
        Guest.setAssertAdmin(assertUser);
    }
    //invalid

    @Step ("Клик  'Вход для администратора негативный тест'")
    public void addAdminWrong() {

        addAdminEnter1();
        addAdminFalse();
        addAdminPass2();
        addAdminEnterInvalid();

    }
    @Step ("Ввод ")
    public void addAdminEnter1() {
        Guest.setAdminInvalid();
    }
    @Step ("Ввод невалидного логина")
    public void addAdminFalse() {
        Guest.setAdminInvalidName();
    }
    @Step ("Ввод пароля")
    public void addAdminPass2() {
        Guest.setAdminInvalidPass();
    }
    @Step ("Клик 'Войти'")
    public void addAdminEnterInvalid() {
        Guest.setAdminInvalidEnter();
    }

    @Step ("Фактический результат")
    public void addAssertAdminFalse() throws InterruptedException{
        Guest.setAssertAdminFalse();
    }


}



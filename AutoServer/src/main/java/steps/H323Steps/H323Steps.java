package steps.H323Steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.H323.Page323;




public class H323Steps extends ScenarioSteps {
    Page323 H323;

    public H323Steps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        Page323 Н323 = getPages().get(Page323.class);
        Н323.open();
    }

    @Step("Кликул на сслыку 'H323 шлюз'" )
    public void addLinkH323() {
        H323.setLinkH323();
    }

    @Step("Заполнение полей Н323 Гейткипера")
    public void addH323Gatekeeper(String text){
        addServerH323();
        addLoginH323(text);
        addDialedH323();
        addPassH323();
        addRegistrationH323();
    }

    @Step("Ввод сервера")
    public void addServerH323(){
        H323.setServerH323();
    }

    @Step("Input H.323 ID:")
    public void addLoginH323(String text){
        H323.setLoginH323(text);
    }
    @Step("Ввод сервер 'Dialed:' ")
    public void addDialedH323(){
        H323.setDialedH323();
    }
    @Step("Ввод 'Пароль' ")
    public void addPassH323() {
        H323.setPassH323();
    }
    @Step("Выбрал  регистрацию")
    public void addRegistrationH323() {
        H323.setRegistrationH323();
    }
    @Step ("Кликнул 'Сохранить'")
    public void addSaveH323() { H323.setSaveH323();}


    @Step ("Клик перезапуска сервера")
    public void addRestartH323 () throws InterruptedException{ H323.setRestartH323() ;}




}



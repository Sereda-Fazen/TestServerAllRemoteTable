package steps.SIPSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.SIP.Sip;


public class ProxySipSteps extends ScenarioSteps {
    Sip SipPage;

    public ProxySipSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        Sip SipPage = getPages().get(Sip.class);
        SipPage.open();
    }

    @Step("Кликул на сслыку 'Sip шлюз'" )
    public void addClickSip() {
        SipPage.setClickSip();
    }

    @Step("Ввел сервер Sip Proxy ")
    public void addIpProxy(String idProxy){
        SipPage.setIpProxy(idProxy);
    }
    @Step("Ввел  'Логин'")
    public void addLoginProxy(String login){
        SipPage.setLoginSipProxy(login);
    }

    @Step("Ввел 'Пароль' ")
    public void addPassProxy(String pass) {
        SipPage.setPassSipProxy(pass);
    }

    @Step("Выбрал  регистрацию")
    public void addRegistrationProxy() {
        SipPage.setRegistrationProxy();

    }
    @Step ("Кликнул 'Сохранить'")
    public void addSaveSipProxy(String textSip) throws InterruptedException{SipPage.setSaveTrueSipProxy(textSip);}



}



package steps.SIPSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.SIP.Sip;




public class SipSteps extends ScenarioSteps {
    Sip SipPage;

    public SipSteps(Pages pages) {
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

    @Step("Ввел сервер VoIP ")
    public void addIp(String serverVoip){
        SipPage.setIp(serverVoip);
    }
    @Step("Ввел  'Логин'")
    public void addLogin(String loginVoip){
        SipPage.setLoginSip(loginVoip);
    }

    @Step("Ввел 'Пароль' ")
    public void addPass(String passVoip) {
        SipPage.setPassSip(passVoip);
    }

    @Step("Выбрал  регистрацию")
    public void addRegistration() {
        SipPage.setRegistration();

    }
    @Step ("Кликнул 'Сохранить'")
    public void addSaveSip() {SipPage.setSave();}


    @Step ()
    public void expectedAssertSipValidDate (String textIp) {SipPage.setAssertSip(textIp);}

    @Step ()
    public void expectedAssertWrongServer(String textLogin ) {SipPage.setAssertServer(textLogin);}

    @Step ()
    public void expectedAssertWrongLogin(String textServer) {SipPage.setAssertLogin(textServer);}


}



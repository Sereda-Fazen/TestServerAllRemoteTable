package steps.SMTPSteps;

import mx4j.tools.mail.SMTP;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.SMTP.SMTPPageNet;


public class SMTPSteps extends ScenarioSteps {
    SMTPPageNet SMTPPage;

    public SMTPSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        SMTPPageNet SMTPPage = getPages().get(SMTPPageNet.class);
        SMTPPage.open();
    }

    @Step()
    public void clickSmtpPage() {SMTPPage.setСlickSmtpPage();}
    @Step( )
    public void checkTypeAuth() {SMTPPage.setСheckTypeAuth();}
    @Step()
    public void enterHost(String hostSMTP){
        SMTPPage.setEnterHost(hostSMTP);
    }

    @Step()
    public void enterPort(String portSMTP){
        SMTPPage.setEnterPort(portSMTP);
    }
    @Step()
    public void enterLoginSMTP(String loginSmtp) {SMTPPage.setEnterLoginSMTP(loginSmtp);}
    @Step()
    public void enterPassSMTP(String passSmtp) {SMTPPage.setEnterPassSMTP(passSmtp);}
    @Step()
    public void clickSsl() {SMTPPage.setClickSsl();}
    @Step()
    public void enterEmailAdmin(String enterEmailAdmin) {SMTPPage.setEmailAdmin(enterEmailAdmin);}
    @Step()
    public void clickConnectedStmp() {SMTPPage.setConnectSmtp();}
    @Step()
    public void chooseAllChecks() {SMTPPage.setAllChecks();}
    @Step()
    public void clickApplySmtp() throws InterruptedException
    {SMTPPage.setApplySmtp();}
    @Step()
    public void assertSmtp() {
        SMTPPage.setAssertSmtp();
    }
    @Step()
    public void addAssertSmtp(String textSmtp) {
        SMTPPage.setAssertSmtpFalse(textSmtp);
    }

}



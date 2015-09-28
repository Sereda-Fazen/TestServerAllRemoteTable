package steps.RegistrationSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.H323.Page323;
import page.Registration.RegistrationPage;


public class RegistrationSteps extends ScenarioSteps {
    RegistrationPage Registration;

    public RegistrationSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        RegistrationPage Registration = getPages().get(RegistrationPage.class);
        Registration.open();
    }
    @Step()
    public void clickEdit() {
        Registration.setClickEditRegistr();
    }
    @Step()
    public void inputKeyForRegistration(String key){
        Registration.setInputRegistar(key);}
    @Step()
    public void clickTheButton(){
        Registration.setClickTheButton();
    }
    @Step()
    public void expectedResult(String text){
        Registration.setAssertRegistr(text);}
    @Step()
    public void expectedResultInvalidDate(String textFalse){
        Registration.setAssertFalse(textFalse);}
    }




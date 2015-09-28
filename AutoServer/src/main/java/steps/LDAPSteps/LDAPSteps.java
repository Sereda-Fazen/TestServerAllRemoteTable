package steps.LDAPSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.LDAP.LDAPPage;
import page.Registration.RegistrationPage;


public class LDAPSteps extends ScenarioSteps {
    LDAPPage LDAP;

    public LDAPSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        RegistrationPage Registration = getPages().get(RegistrationPage.class);
        Registration.open();
    }
    //LDAP
    @Step()
    public void clickLDAPPage() {
        LDAP.setClickLDAP();
    }
    @Step()
    public void clickCheckBoxLDAP(){
        LDAP.setClickCheckBoxLDAP();}

    @Step()
    public void clickEditButton(){
        LDAP.setEditLDAP();
    }
    @Step()
    public void clickCheckSecurity(){
        LDAP.setClickCheckSecurity();
    }
    //Auth
    @Step()
    public void choseManualSetting(){
        LDAP.setManualSetting();}
    @Step()
    public void inputServerLDAP(String server) {
        LDAP.setServerLDAP(server);
    }
    @Step()
    public void inputDS(String serverDs) {
        LDAP.setServerDS(serverDs);
    }
    @Step()
    public void choseTypeAuth(){
        LDAP.setAuthType();}

    @Step()
    public void inputName(String name){
        LDAP.setNameLDAP(name);
    }
    @Step()
    public void inputPass(String pass){
        LDAP.setPassLDAP(pass);
    }
    //Group
    @Step()
    public void clickOversee() {
        LDAP.setOversee();}

    @Step()
    public void checkSearchLDAP(String group){
        LDAP.setCheckGroupLDAP(group);
    }
    @Step()
    public void choseNameGroup(){
        LDAP.setNameGroup();
    }
    @Step()
    public void choseGroup(){
        LDAP.setChoseGroup();
    }
    //Apply
    @Step()
    public void enterUserGroupLDAP(String userGroup){
        LDAP.setUserGroupLDAP(userGroup);
    }

    @Step()
    public void applyClickGroup(){
        LDAP.setApplyGroup();
    }
    @Step()

    public void actualResult(String textFalse ){
        LDAP.setErrorUsers(textFalse);}
    }




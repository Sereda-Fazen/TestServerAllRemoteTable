package steps.UsersSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Users.UsersPage;


public class UsersSteps extends ScenarioSteps {
    UsersPage Users;

    public UsersSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        UsersPage Users = getPages().get(UsersPage.class);
        Users.open();}

    @Step()
    public void clickLink() {
        Users.setClickLink();
    }

    @Step()
    public void clickButtonAddUser() {
        Users.setClickAddUser();
    }

    @Step()
    public void addNewUserInTrueConf(String name) throws InterruptedException {
        inputTrueConfIDUser(name);
    }
    @Step()
    public void inputPass(String pass) throws InterruptedException{

        inputTrueConfPassUser(pass);

    }
    @Step() public void inputTrueConfIDUser(String name) {Users.setTrueConfIDUser(name);}
    @Step() public void inputTrueConfPassUser(String pass){Users.setTrueConfPassUser(pass);}

    @Step() public void clickAddButtonUser() throws InterruptedException{
        Users.setButtonUser();
    }
    @Step()
    public void inputSearchUser() {
        Users.setInputSearchUser();}
    @Step()
    public void clickUpdate() {
        Users .setUpdateUsers();}

    @Step()
    public void clickDelete() throws InterruptedException{
        Users.setDeleteUser();
    }

    @Step()
    public void actionHover () throws InterruptedException{
        Users.setHover();
    }
    @Step()
    public void clickReturn() {
        Users.setReturnUser();
    }

    @Step()
    public void clickEditUser() {
        Users.setEditUser();
    }
    @Step()
    public void editUser(String lastName) throws InterruptedException{
        clickEditUser();
       // clickDisconnectUser();
        inputLastName(lastName);
        clickSaveUser();
    }
    @Step()
    public void clickDisconnectUser() {
        Users.setDisconnectUser();
    }
    @Step()
    public void inputLastName(String lastName) {
        Users.setLastName(lastName);
    }

    @Step()
    public void clickSaveUser() throws InterruptedException{
        Users.setSaveUser();
    }

    @Step ()
    public void AssertDelete(String deleteUsers) {
        Users.setDeleteAssert(deleteUsers);}

    @Step ()
    public void ExpectedResult(String text) {
        Users.setExpectedResult(text);}

}



package page.Users;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static org.junit.Assert.assertTrue;

public class UsersPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;




    /*User*/
    @FindBy(css  = "#users-list-menu-li > a")
    private WebElement clickLinkUser;
    //Add user
    @FindBy(css = "div.content-container > a.button")
    private WebElement clickAddUser;
    @FindBy (css = "#user-create-login-name")
    private WebElement inputAddButtonUser;

    @FindBy (css  = "#user-create-password_conf")
    private WebElement inputTrueConfPassUser;
    @FindBy (css  = "tbody > tr:nth-of-type(5) > td:nth-of-type(2) > input:nth-of-type(2)")
    private WebElement inputDoublePassUser;

    //Button
    @FindBy (css  = "#user-create-func-block > a:first-child")
    private WebElement clickButtonUser;
    // Back
    @FindBy (xpath  = "//*[@id='user-create-func-block']/a[2]")
    private WebElement clickBack;



    //Search
    @FindBy (css  = "div.mlpl_searchFieldWrapper > input")
    private WebElement inputSearchUser;
    //Update
    @FindBy (css  = "#refresh-btn > img")
    private WebElement clickUpdate;
    //Edit
    @FindBy (css  = "div.mlpl_members > div:first-child > div.mgr_memberInfo > div.mgr_status > div.offline")
    private WebElement clickUserForEdit;
    @FindBy (css  = "#user-create-status")
    private WebElement checkUserForEdit;
    @FindBy (css  = "#user-create-last-name")
    private WebElement inputLastName;
    @FindBy (css  = "#disconnect-button")
    private WebElement disconnectUser;
    @FindBy (css  = "div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement youSure;
    @FindBy (css  = " #user-create-func-block > a:first-child")
    private WebElement youSaveEdit;









    //Delete
    @FindBy (css  = "div.mlpl_members > div:first-child > div.mgr_memberActionsIcon > div.mgr_iconRemove")
    private WebElement clickDelete;
    @FindBy (css  = "div.ui-dialog-buttonset > button:nth-of-type(2) > span.ui-button-text")
    private WebElement okDelete;
    @FindBy (css  = "#user-create-func-block > a:nth-of-type(2)")
    private WebElement DeleteInside;
    @FindBy (css  = "body > div:nth-of-type(7) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement InsideDeleteOk;





    @FindBy (css  = "div.mlpl_members > div:first-child > div.mgr_memberIcon > div.mgr_memberDefault")
    private WebElement moveOn;




    //DeleteAssert
    @FindBy (css  = "#header > div:first-child")
    private WebElement clickDeleteAssert;



    /*All add user Expected Result*/
    @FindBy (css = "span.note-msg")
    private WebElement assertExpectedResult;
    @FindBy (css = "div.error > div")
    private WebElement assertAgainName;




    public UsersPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }

    public void setClickLink() {
        clickOn(clickLinkUser);
    }
    public void setClickAddUser()  {clickOn(clickAddUser);}

    public void setTrueConfIDUser(String name) {enter(name).into(inputAddButtonUser);}
    public void setTrueConfPassUser(String pass)  {enter(pass).into(inputTrueConfPassUser);
        enter("123456").into(inputDoublePassUser);
    }

    public void setButtonUser() {
        clickOn(clickButtonUser);
    }
    public void setInputSearchUser() {
        enter("alex").into(inputSearchUser);}
    public void setUpdateUsers() { clickOn(clickUpdate);}
    public void setReturnUser() { clickOn(clickBack);}
    public void setEditUser() {

        clickOn(clickUserForEdit);
        clickOn(checkUserForEdit);
        }
    public void setDisconnectUser() {
        clickOn(disconnectUser);
    }
    public void setLastName(String lastName) {
        enter(lastName).into(inputLastName);}
    public void setSaveUser() throws InterruptedException{
        clickOn(youSaveEdit);
        Thread.sleep(3000);
    }

    public void setDeleteUser() {

        clickOn(clickUserForEdit);
        clickOn(DeleteInside);
        clickOn(InsideDeleteOk);

        clickOn(clickUserForEdit);
        clickOn(DeleteInside);
        clickOn(InsideDeleteOk);

    }



    public void setHover () throws InterruptedException{


        Actions delete = new Actions(getDriver());
        delete.moveToElement(moveOn).perform();
        Thread.sleep(2000);
        clickOn(clickDelete);

        clickOn(okDelete);

        Actions delete2 = new Actions(getDriver());
        delete2.moveToElement(moveOn).perform();
        Thread.sleep(2000);
        clickOn(clickDelete);

        clickOn(okDelete);

        Actions delete3 = new Actions(getDriver());
        delete3.moveToElement(moveOn).perform();
        Thread.sleep(2000);
        clickOn(clickDelete);

        clickOn(okDelete);
    }



    public void setExpectedResult(String text) {
        assertFalse("Пользователь уже существует с таким именем", element(assertAgainName).isPresent());
        assertTrue(text, element(assertExpectedResult).isPresent());
    }

    public void setDeleteAssert(String deleteAssert) {
        assertTrue(deleteAssert, element(clickDeleteAssert).isPresent());}


}






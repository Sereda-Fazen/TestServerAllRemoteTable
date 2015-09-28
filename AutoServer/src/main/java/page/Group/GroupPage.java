package page.Group;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static org.junit.Assert.assertTrue;

public class GroupPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*Group*/

    @FindBy(css  = "#group-list-menu-li > a")
    private WebElement clickGroup;
    //add group
    @FindBy(css = "#create-group-form-name")
    private WebElement nameGroup;
    @FindBy (css = "div.f-wrapper > a.button")
    private WebElement createGroup;
    @FindBy (css  = "tbody > tr:first-child > td:nth-of-type(2) > a")
    private WebElement clickEditGroup;
    @FindBy (css  = "#groupList")
    private WebElement checkGroup;
    //rename
    @FindBy (css  = "#btnRenameGroup")
    private WebElement renameGroup;
    @FindBy (css  = " #groupNameField")
    private WebElement renameInputGroup;
    @FindBy (css  = "#btnApplyRename > span.ui-button-text")
    private WebElement renameSaveGroup;
    //an adress book
    @FindBy (css  = "tbody > tr:first-child > td:nth-of-type(3) > a")
    private WebElement settingAdressBook;
    @FindBy (css  = "#group-users")
    private WebElement radioGroupUsers;
    @FindBy (css  = "div.triangle-down-ms")
    private WebElement checkGroupUsers;
    @FindBy (css  = "div.option-list.none > ul > li")
    private WebElement chooseGroupUsers;
    @FindBy (css  = " #user-create-func-block > a.button")
    private WebElement applyGroupUsers;
    // check box
    @FindBy (css  = "tbody > tr:first-child > td:nth-of-type(4) > input")
    private WebElement editAdressBook;
    @FindBy (css  = "tbody > tr:first-child > td:nth-of-type(5) > input")
    private WebElement callRing;
    @FindBy (css  = "tbody > tr:first-child > td:nth-of-type(6) > input")
    private WebElement workTogether;
    @FindBy (css  = "tbody > tr:first-child > td:nth-of-type(7) > input")
    private WebElement createGroupConferention;
    //delete group
    @FindBy (className = "key")
    private WebElement checkDelete;
    @FindBy (css  = " #groups-del")
    private WebElement deleteGroup;
    @FindBy (css  = " div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement deleteGroupOk;
    //assert group
    @FindBy (css  = "span.note-msg")
    private WebElement assertDeleteGroup;


    public GroupPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }
    public void setClickGroup() {clickOn(clickGroup);}
    //add group
    public void setNameGroup()  {enter("Group").into(nameGroup);}
    public void setCreateGroup() {clickOn(createGroup);}
    public void setClickEditGroup() {clickOn(clickEditGroup);}
    public void setCheckGroup() {clickOn(checkGroup);}
    //rename
    public void setRenameGroup()  {clickOn(renameGroup);}
    public void setRenameInputGroup() {enter("GroupTest").into(renameInputGroup);}
    public void setRenameSaveGroup() {clickOn(renameSaveGroup);}
    // Adress book
    public void setSettingAdressBook()  {clickOn(settingAdressBook);}
    public void setRadioGroupUsers() {clickOn(radioGroupUsers);}
    public void setCheckGroupUsers() { clickOn(checkGroupUsers);}
    public void setChooseGroupUsers() {clickOn(chooseGroupUsers);}
    public void setApplyGroupUsers()  {clickOn(applyGroupUsers);}
    //CheckBox
    public void setEditAdressBook() {clickOn(editAdressBook);}
    public void setCallRing() { clickOn(callRing);}
    public void setWorkTogether() {clickOn(workTogether);}
    public void setCreateGroupConferention() {clickOn(createGroupConferention);}
    //Delete
    public void setCheckDelete() {clickOn(checkDelete);}
    public void setDeleteGroup() {clickOn(deleteGroup);}
    public void setDeleteGroupOk() {clickOn(deleteGroupOk);}

    public void setAssertDeleteGroup() {

        assertTrue(element(assertDeleteGroup).isPresent());

    }





}






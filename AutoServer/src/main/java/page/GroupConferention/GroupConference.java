package page.GroupConferention;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;


public class GroupConference extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;


    /**
     * Create new group for conference
     */
    @FindBy(css  = "#conferences-list-menu-li > a")
    private WebElement ClickGroup;
    @FindBy(css = "#conferences-list > a:nth-of-type(1)")
    private WebElement ClickCreateConf;
    @FindBy (css = "div.typeList > div:first-child > div.conferenceType > div.btn")
    private WebElement NewCreateGroup;

    @FindBy (css = "div.typeList > div:nth-of-type(2) > div.conferenceType > div.btn")
    private WebElement NewCreateGroupPublic;

    @FindBy (css  = "a.leftMargin")
    private WebElement ClickConferenceMode;
    @FindBy (css  = "tbody > tr:first-child > td:first-child > div.contentPadding.confTypeSelectionSide > div.schemaEntry > div.schemaTitle")
    private WebElement CheckConferenceMode;
    @FindBy(css  = "body > div:nth-of-type(9) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:nth-of-type(2) > span.ui-button-text")
    private WebElement SaveConferenceMode;


    @FindBy (css  = "tbody > tr:first-child > td:nth-of-type(2) > input.fullBlock")
    private WebElement EnterNameConferenceGroup;

    @FindBy(css = "div > div:nth-of-type(2) > table > tbody > tr:nth-of-type(2) > td:nth-of-type(2) > a")
    private WebElement CheckHostForGroup;
    @FindBy(css = "div.tc-plugin-ui.ui-dialog-content.ui-widget-content > div.mlpl_memberList > div.mlpl_inner > div:nth-of-type(2) > div.mlpl_list > div.mlpl_innerList > div.mlpl_members > div.mgr_member")
    private WebElement CheckHostUser;

    @FindBy(css = "tbody > tr:nth-of-type(7) > td > div.leftMargin > input")
    private WebElement clickCheckboxAllow;

    @FindBy(css = "tbody > tr:nth-of-type(8) > td > div.leftMargin > input")
    private WebElement clickCheckboxAllow2;


    @FindBy (css = "span.leftMargin > span:nth-of-type(2)")
    private WebElement ChoosePeopleConference;
    //Search

    @FindBy (css = "div.searchBlock > input")
    private WebElement SearchNameUser;
    @FindBy (css = "div > div:nth-of-type(2) > div:nth-of-type(2) > div.mlpl_memberList > div.mlpl_inner > div.mlpl_searchBlock > div.mlpl_innerSearch > div.mlpl_searchFieldWrapper > input")
    private WebElement SearchNameUser2;
    @FindBy (css = "td.cpl_rightPanel > div > div:nth-of-type(2) > div:first-child > div:nth-of-type(1)")
    private WebElement SelectUsers;

    // Add users
    @FindBy (css = "div > div:nth-of-type(2) > div:nth-of-type(2) > div.mlpl_memberList > div.mlpl_inner > div:nth-of-type(2) > div.mlpl_list > div.mlpl_innerList > div.mlpl_members > div:nth-of-type(2) > div.mgr_memberIcon > div.mgr_memberDefault")
    private WebElement AddUser;
    @FindBy (css = "div > div:nth-of-type(2) > div:nth-of-type(2) > div.mlpl_memberList > div.mlpl_inner > div:nth-of-type(2) > div.mlpl_list > div.mlpl_innerList > div.mlpl_members > div:nth-of-type(3) > div.mgr_memberIcon > div.mgr_memberDefault")
    private WebElement AddUser1;
    @FindBy (css = "div.mlpl_members > div:nth-of-type(3) > div.mgr_memberActionsIcon > div.mgr_iconAdd")
    private WebElement AddUserAdd2;
    @FindBy (css = "div.mlpl_members > div:nth-of-type(2) > div.mgr_memberActionsIcon > div.mgr_iconAdd")
    private WebElement AddUserAdd;

    // Delete User fo Action
    @FindBy (css = "div.cpl_members.full > div:nth-of-type(3) > div.mgr_memberIcon > div.mgr_memberDefault")
    private WebElement HoverForDeleteUser;
    @FindBy (css = "div.cpl_members.full > div:nth-of-type(3) > div.mgr_memberActionsIcon > div.mgr_iconRemove")
    private WebElement ClickForDeleteUser;
    @FindBy (css = "div.cpl_members.full > div:nth-of-type(3) > div.mgr_memberIcon > div.mgr_memberUnknown")
    private WebElement HoverForDeleteUserForID;
    @FindBy (css = "div.mgr_memberGuest")
    private WebElement HoverForDeleteUserForMail;


    // Other Way to add users
    @FindBy (css = "p > a")
    private WebElement OtherWayToAddUser;
    // For ID users
    @FindBy (css = "td.cpl_rightPanel > div > div:nth-of-type(2) > div:first-child > div:nth-of-type(2)")
    private WebElement OtherIdUser;
    @FindBy (css = "div.sbid_searchBlock > input")
    private WebElement inputSearcIdUser;
    @FindBy (css = "div.sbid_inner > ul > li")
    private WebElement AddForIdUser;
    // For mail
    @FindBy (css = "td.cpl_rightPanel > div > div:nth-of-type(2) > div:first-child > div:nth-of-type(3)")
    private WebElement OtherMailUser;
    @FindBy (css = "div.cpl_inner > div:first-child > div.cpl_td.cpl_filed > input")
    private WebElement NameMailUser;
    @FindBy (css = "div.cpl_inner > div:nth-of-type(2) > div.cpl_td.cpl_filed > input")
    private WebElement MailUser;
    @FindBy (css = "div.grayButton.small")
    private WebElement AddMailUser;

    @FindBy (css = "body > div:nth-of-type(12) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-text-only > span.ui-button-text")
    private WebElement ApplyPeopleConference;
    //data
    @FindBy (css  = "span.leftMargin > a")
    private WebElement ChooseDataConference;
    //----//Nonreccurent
    @FindBy (css  = "div.menu > ul > li:nth-of-type(2)")
    private WebElement nonreccurent;
    @FindBy (css  = "tbody > tr:nth-of-type(3) > td.field > input.hasDatepicker")
    private WebElement clickData;
    @FindBy (css  = "tbody > tr:nth-of-type(2) > td:nth-of-type(6) > a.ui-state-default")
    private WebElement checkDay;
    @FindBy (css  = "div.ui_tpicker_hour_slider.ui-slider.ui-slider-horizontal.ui-widget.ui-widget-content.ui-corner-all > a.ui-slider-handle.ui-state-default.ui-corner-all")
    private WebElement checkHours;
    //Action hours
    @FindBy (css  = "div.ui_tpicker_hour_slider.ui-slider.ui-slider-horizontal.ui-widget.ui-widget-content.ui-corner-all")
    private WebElement actionHours;
    //Action minute
    @FindBy (css  = "div.ui_tpicker_minute_slider.ui-slider.ui-slider-horizontal.ui-widget.ui-widget-content.ui-corner-all")
    private WebElement actionMinuts;

    @FindBy (css  = "div.ui_tpicker_minute_slider.ui-slider.ui-slider-horizontal.ui-widget.ui-widget-content.ui-corner-all > a.ui-slider-handle.ui-state-default.ui-corner-all")
    private WebElement checkMinuts;
    @FindBy (css  = "button.ui-datepicker-close.ui-state-default.ui-priority-primary.ui-corner-all")
    private WebElement closeNowTime;
    //timezona
    @FindBy (css  = "tbody > tr:nth-of-type(7) > td.field > select")
    private WebElement clickTimeZona;

    //---//Every day
    @FindBy (css  = "div.menu > ul > li:nth-of-type(3)")
    private WebElement everyWeek;
    @FindBy (css  = "div.descr")
    private WebElement noWeek;

    @FindBy (css  = "ul > li:first-child > input")
    private WebElement checkMonday;
    @FindBy (css  = "div.option-list.hidden > ul > li:nth-of-type(2)")
    private WebElement checkTuesday;
    @FindBy (css  = "div.option-list.hidden > ul > li:nth-of-type(3)")
    private WebElement checkWednesday;
    @FindBy (css  = "div.option-list.hidden > ul > li:nth-of-type(4)")
    private WebElement checkThusday;

    @FindBy (css  = "tbody > tr:nth-of-type(5) > td.field > input.hasDatepicker")
    private WebElement timeForWeek;
    @FindBy (css  = "button.ui-state-default.ui-priority-secondary.ui-corner-all")
    private WebElement timeNow;
    //Save data
    @FindBy (css  = "body > div:nth-of-type(14) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:nth-of-type(2) > span.ui-button-text")
    private WebElement SaveDataConference;

    //desc
    @FindBy (css = "div > div:nth-of-type(7) > table > tbody > tr:nth-of-type(2) > td:nth-of-type(2) > a")
    private WebElement EnterDescription;

    @FindBy (css = "div.mce-edit-area.mce-panel.mce-stack-layout-item  > iframe")
    private WebElement InputDescription;
    @FindBy (css = "body > div:nth-of-type(15) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:nth-of-type(2) > span.ui-button-text")
    private WebElement SaveDescription;
    @FindBy (id = "tinymce")
    private WebElement InputDescriptionText;
    @FindBy (css = "span.grayButton.leftMargin")
    private WebElement saveGroup;
    @FindBy (css = " body > div:nth-of-type(18) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement sendMeet;

    @FindBy (css = "body > div:nth-of-type(19) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:nth-of-type(2) > span.ui-button-text")
    private WebElement clickNo;




    @FindBy (css  = "body > div:nth-of-type(15) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:nth-of-type(2) > span.ui-button-text")
    private WebElement CreateSaveConference;


    @FindBy (css = "span.grayButton.leftMargin")
    private WebElement saveGuestGroup;

    //Delete group

    @FindBy (css = "body > div:nth-of-type(18) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement clickAnswer;

    //Assert
    @FindBy (css = "[name=\"key\"]")
    private WebElement radioButtonGroup;

    @FindBy (css = "tbody > tr:first-child > td:first-child > input.radio.key")
    private WebElement readioButtonGuest;

    //Edit ana Run
    @FindBy (css = "#edit-button")
    private WebElement clickEdit;
    @FindBy (css = "#run-button")
    private WebElement runGroup;


    @FindBy (css = "#delete-button")
    private WebElement delete;
    @FindBy (css = "div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement deleteOk;
    //Assert delete
    @FindBy (css = "span.note-msg")
    private WebElement deleteConference;






    /**
     * WebRTC
     */

    public GroupConference(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }

    /**
     * Create new group for conference
     */
    public void setClickGroup() {
        clickOn(ClickGroup);}
    public void setClickCreateConf() {
        clickOn(ClickCreateConf);}
    public void setNewCreateGroup() {
        clickOn(NewCreateGroup);}

    public void setNewCreateGroupPublic() {
        clickOn(NewCreateGroupPublic);}


    public void setCheckConferenceMode() {
        clickOn(ClickConferenceMode);
        clickOn(CheckConferenceMode);
        clickOn(SaveConferenceMode);}
    public void setEnterNameConferenceGroup(String nameConference) {
        enter(nameConference).into(EnterNameConferenceGroup);}
    public void setCheckHostForGroup() {
        clickOn(CheckHostForGroup);
        clickOn(CheckHostUser);}
    public void setClickCheckboxAllow() {
        clickOn(clickCheckboxAllow);
        clickOn(clickCheckboxAllow2);
    }
    public void setChoosePeopleConference (){
        clickOn(ChoosePeopleConference);
    }
    public void setChoosePeopleForUsers1(String searchNameUser) throws InterruptedException {
        enter(searchNameUser).into(SearchNameUser);
        Thread.sleep(2000);
        clickOn(SelectUsers);
    }
    public void setChoosePeopleForUsers ( String searchNameUser1) throws InterruptedException {

        enter(searchNameUser1).into(SearchNameUser2);
        Thread.sleep(2000);
        clickOn(OtherWayToAddUser);
        SearchNameUser.clear();
        clickOn(SelectUsers);
    }

    public void setActionForUser1() throws InterruptedException{
        Actions addUser = new Actions(getDriver());
        Thread.sleep(2000);
        addUser.moveToElement(AddUser).perform();
        Thread.sleep(1000);
        clickOn(AddUserAdd);
    }
    public void setActionForUser2 () throws InterruptedException {
        Actions addUser1 = new Actions(getDriver());
        Thread.sleep(2000);
        addUser1.moveToElement(AddUser1).perform();
        Thread.sleep(1000);
        clickOn(AddUserAdd2);
    }
     public void setActionDeleteUser() throws InterruptedException{
         Actions deleteUser = new Actions(getDriver());
         deleteUser.moveToElement(HoverForDeleteUser).perform();
         Thread.sleep(1000);
         clickOn(ClickForDeleteUser);

    }
    public void setOtherWayToAddUser () {
        clickOn(OtherWayToAddUser);
    }
    public void setIdUser (String searchForIdUser) throws  InterruptedException{
        clickOn(OtherIdUser);
        enter(searchForIdUser).into(inputSearcIdUser);
        Thread.sleep(2000);
        clickOn(AddForIdUser);

        // delete ID user
        Actions deleteUser = new Actions(getDriver());
        deleteUser.moveToElement(HoverForDeleteUserForID).perform();
        Thread.sleep(2000);
        clickOn(ClickForDeleteUser);
        Thread.sleep(1000);
        clickOn(OtherWayToAddUser);
    }
    public void setMailUser(String inputForNameUser, String inputForMailUser ) throws InterruptedException{
        clickOn(OtherMailUser);
        enter(inputForNameUser).into(NameMailUser);
        enter(inputForMailUser).into(MailUser);
        clickOn(AddMailUser);
        clickOn(OtherWayToAddUser);
        //delete mail for user
        Actions deleteUser = new Actions(getDriver());
        deleteUser.moveToElement(HoverForDeleteUserForMail).perform();
        Thread.sleep(2000);
        clickOn(ClickForDeleteUser);

        clickOn(ApplyPeopleConference);

    }

    //--------------// Data
    public void setChooseDataConference() {
        clickOn(ChooseDataConference);
    }
    //Nonrecurrent
    public void setNonrecurrent() {clickOn(nonreccurent);}
    public void setDataClick() {clickOn(clickData);}
    public void setCheckData() {clickOn(checkDay);}
    public void setCheckHours() {
        clickOn(checkHours);
        Actions hours = new Actions(getDriver());
        hours.dragAndDropBy(actionHours, -10, 0).perform();

    }
    public void setCheckMinuts() {
        clickOn(checkMinuts);
        Actions minute = new Actions(getDriver());
        minute.dragAndDropBy(actionMinuts, 0, -10).perform();}

    public void setCloseTime() {clickOn(closeNowTime);}
    public void setClickRegion() throws InterruptedException{clickOn(clickTimeZona); Thread.sleep(1000);}
    //Every day
    public void setEveryWeek() {clickOn(everyWeek);}
    public void setNoWeek() {clickOn(noWeek);}
    public void setCheckMonday() {clickOn(checkMonday);clickOn(checkTuesday);clickOn(checkWednesday);clickOn(checkThusday);clickOn(noWeek);}
    public void setTimeForWeek() {clickOn(timeForWeek);}
    public void setTimeNow() {clickOn(timeNow);  clickOn(SaveDataConference);}

    public void setEnterDescription(String nameDesc) throws InterruptedException{
        clickOn(EnterDescription);

        Actions desc = new Actions(getDriver());
        desc.moveToElement(InputDescription);
        desc.click();
        desc.sendKeys(nameDesc);
        desc.build().perform();
        clickOn(InputDescription);
        Thread.sleep(2000);

    }
    public void setClickSaveConference(){
        clickOn(CreateSaveConference);

    }
    public void setClickSaveGuestGroup(){
        clickOn(saveGuestGroup);
    }
    public  void setAddGroup(String groupAdd)  throws InterruptedException{
        clickOn(saveGroup);
        //clickOn(sendMeet);
        //Thread.sleep(5000);
        //assertFalse("Ошибка отправки приглашения", element(radioButtonGroup).isPresent());
        clickOn(clickNo);
        assertTrue(groupAdd, element(radioButtonGroup).isPresent());
    }
    public  void setAddGroupGuest(String groupAdd)  throws InterruptedException{
        clickOn(saveGroup);
        assertTrue(groupAdd, element(radioButtonGroup).isPresent());
    }
    public  void setEditGroup(String editNameConference)  throws InterruptedException {
        clickOn(radioButtonGroup);
        clickOn(clickEdit);
        enter(editNameConference).into(EnterNameConferenceGroup);
        clickOn(saveGuestGroup);
        Thread.sleep(4000);
    }

    public  void setEditGroupGuest()  throws InterruptedException {
        clickOn(radioButtonGroup);
        clickOn(clickEdit);
        Thread.sleep(4000);
    }

    public  void setRunGroup()  throws InterruptedException {
        clickOn(radioButtonGroup);
        clickOn(runGroup);
        Thread.sleep(3000);
    }
    public void setDeleteGroup (String deleteGroupOk) throws InterruptedException{
        clickOn(radioButtonGroup);
        clickOn(delete);
        clickOn(deleteOk);
        Thread.sleep(4000);

        assertTrue (deleteGroupOk, element(deleteConference).isPresent());
    }








}






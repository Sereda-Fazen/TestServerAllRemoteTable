package steps.GroupConferenceSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.GroupConferention.GroupConference;


public class GroupConferenceSteps extends ScenarioSteps {
    GroupConference GroupConferenceWeb;

    public GroupConferenceSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        GroupConference GroupConferenceWeb = getPages().get(GroupConference.class);
        GroupConferenceWeb.open();
    }

    // GroupConference
    @Step()
    public void clickGroupConf() {
        GroupConferenceWeb.setClickGroup();
    }

    @Step()
    public void clickCreateConf() {GroupConferenceWeb.setClickCreateConf(); }
    @Step()
    public void newCreateGroup() {GroupConferenceWeb.setNewCreateGroup();}
    @Step()
    public void  newCreateGroupPublic() {GroupConferenceWeb.setNewCreateGroupPublic();}

    @Step()
    public void checkConferenceMode() {
        GroupConferenceWeb.setCheckConferenceMode();
    }
    @Step()
    public void enterNameConferenceGroup(String nameConference) {GroupConferenceWeb.setEnterNameConferenceGroup(nameConference);}
    @Step()
    public void checkHostForGroup() {
        GroupConferenceWeb.setCheckHostForGroup();
    }
    @Step()
    public void  clickCheckboxAllow() {
        GroupConferenceWeb.setClickCheckboxAllow();
    }


    @Step()
    public void choosePeopleConferenceAll () {
        GroupConferenceWeb.setChoosePeopleConference();
    }
    //Search
    @Step()
    public void chooseForSearch(String searchNameUser,String searchNameUser1) throws InterruptedException{
        chooseForSearchGroup(searchNameUser);
        chooseForSearchGroup1(searchNameUser1);

    }
    @Step()
    public void chooseForSearchGroup1(String searchNameUser) throws InterruptedException{
        GroupConferenceWeb.setChoosePeopleForUsers(searchNameUser);
    }
    @Step()
    public void chooseForSearchGroup(String searchNameUser1) throws InterruptedException{
        GroupConferenceWeb.setChoosePeopleForUsers1(searchNameUser1);
    }
    // Users
    @Step ()
    public void choosePeopleConference() throws InterruptedException {
        chooseUser1();
        chooseUser2();
        deleteUser2();
    }
    @Step
    public void chooseUsersForIdAndMail(String searchForIdUser,String inputForNameUser, String inputForMailUser) throws InterruptedException{
        chosePeopleID(searchForIdUser);
        chosePeopleMail(inputForNameUser, inputForMailUser);


    }
    @Step()
    public void chosePeopleID (String searchForIdUser) throws InterruptedException{
        GroupConferenceWeb.setOtherWayToAddUser();
        GroupConferenceWeb.setIdUser(searchForIdUser);
    }
    @Step()
    public void chosePeopleMail (String inputForNameUser, String inputForMailUser) throws InterruptedException{
        GroupConferenceWeb.setMailUser(inputForNameUser, inputForMailUser);

    }


    @Step ()
    public void chooseUser1() throws InterruptedException{
        GroupConferenceWeb.setActionForUser1();
    }
    @Step ()
    public void chooseUser2() throws InterruptedException{
        GroupConferenceWeb.setActionForUser2();
    }
    @Step ()
    public void deleteUser2() throws InterruptedException {
        GroupConferenceWeb.setActionDeleteUser();
    }

    @Step ()
    public void clickOtherWayToAddUser() throws InterruptedException {
        GroupConferenceWeb.setOtherWayToAddUser();
    }

    @Step ()
    public void addForID(String searchForIdUser) throws InterruptedException {
        GroupConferenceWeb.setIdUser(searchForIdUser);
    }
    @Step ()
    public void addForMail(String inputForNameUser, String inputForMailUser ) throws InterruptedException {
        GroupConferenceWeb.setMailUser(inputForNameUser, inputForMailUser);
    }
    @Step()
    public void chooseDataConference() {
        GroupConferenceWeb.setChooseDataConference();
    }
    //DATA
    @Step
    public void chooseDataForNonrecurrent() throws InterruptedException{
        GroupConferenceWeb.setNonrecurrent();
        chooseDataClick();
        chooseCheckHours();
        chooseCheckMinute();
        chooseCloseTime();
        chooseClickRegion();

    }
    @Step
    public void chooseDataForEveryDay() {
        chooseEveryWeek();
        chooseNoWeek();
        chooseCheckMonday();
        chooseTimeForWeek();
        chooseTimeNow();
        }



    //Nonrecurrent
    @Step()
    public void chooseDataClick() {GroupConferenceWeb.setDataClick();}
    @Step()
    public void chooseCheckData() {GroupConferenceWeb.setCheckData();}
    @Step()
    public void chooseCheckHours() {GroupConferenceWeb.setCheckHours();}
    @Step()
    public void chooseCheckMinute() {GroupConferenceWeb.setCheckMinuts();}
    @Step()
    public void chooseCloseTime() {GroupConferenceWeb.setCloseTime();}
    @Step()
    public void chooseClickRegion() throws InterruptedException{GroupConferenceWeb.setClickRegion();}


    //Every Day
    @Step()
    public void chooseEveryWeek() {GroupConferenceWeb.setEveryWeek();}
    @Step()
    public void chooseNoWeek() {GroupConferenceWeb.setNoWeek();}
    @Step()
    public void chooseCheckMonday() {GroupConferenceWeb.setCheckMonday();}
    @Step()
    public void chooseTimeForWeek() {GroupConferenceWeb.setTimeForWeek();}
    @Step()
    public void chooseTimeNow() {GroupConferenceWeb.setTimeNow();}



    @Step()
    public void enterDescription(String nameDesc) throws InterruptedException{
        GroupConferenceWeb.setEnterDescription(nameDesc);    }
    @Step ()
    public void clickSaveConference() {GroupConferenceWeb.setClickSaveConference();}

    @Step ()
    public void clickSaveGuestGroup() {GroupConferenceWeb.setClickSaveGuestGroup();}


    @Step ()
    public void expectedResultForGroup (String groupAdd ) throws InterruptedException{
        GroupConferenceWeb.setAddGroup(groupAdd);
    }
    @Step ()
    public void expectedResultForGroupGuest (String groupAdd ) throws InterruptedException{
        GroupConferenceWeb.setAddGroupGuest(groupAdd);
    }
    @Step ()
    public void editGroup (String editNameConference) throws  InterruptedException {
        GroupConferenceWeb.setEditGroup(editNameConference);
    }
    @Step ()
    public void editGroupGuest () throws  InterruptedException {
        GroupConferenceWeb.setEditGroupGuest();
    }


    @Step ()
    public void runGroup () throws InterruptedException{
        GroupConferenceWeb.setRunGroup();
    }
    @Step ()
    public void expectedResultDeleteGroup (String deleteGroupOk) throws  InterruptedException {
        GroupConferenceWeb.setDeleteGroup(deleteGroupOk);
    }
}



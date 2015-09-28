package steps.GroupSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Group.GroupPage;



public class GroupSteps extends ScenarioSteps {
    GroupPage Group;

    public GroupSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        GroupPage Group = getPages().get(GroupPage.class);
        Group.open();
    }

    // Group
    @Step()
    public void clickGroup() {
        Group.setClickGroup();
    }

    // Add group
    @Step()
    public void addGroup() {
        inputNameGroup();
        createGroup();
        clickEditGroup();
        checkGroup();
    }

    @Step()
    public void inputNameGroup() {
        Group.setNameGroup();
    }

    @Step()
    public void createGroup() {
        Group.setCreateGroup();
    }

    @Step()
    public void clickEditGroup() {
        Group.setClickEditGroup();
    }

    @Step()
    public void checkGroup() {
        Group.setCheckGroup();
    }

    //Rename
    @Step()
    public void editGroup() {
        renameGroup();
        renameInputGroup();
        renameSaveGroup();
    }

    @Step()
    public void renameGroup() {
        Group.setRenameGroup();
    }

    @Step()
    public void renameInputGroup() {
        Group.setRenameInputGroup();
    }

    @Step()
    public void renameSaveGroup() {
        Group.setRenameSaveGroup();
    }

    //  Adress book
    @Step()
    public void adressBook() {
        settingAdressBook();
        radioGroupUsers();
        checkGroupUsers();
        chooseGroupUsers();
        chooseGroupUsers();
        applyGroupUsers();
    }

    @Step()
    public void settingAdressBook() {
        Group.setSettingAdressBook();
    }

    @Step()
    public void radioGroupUsers() {
        Group.setRadioGroupUsers();
    }

    @Step()
    public void checkGroupUsers() {
        Group.setCheckGroupUsers();
    }

    @Step()
    public void chooseGroupUsers() {
        Group.setChooseGroupUsers();
    }

    @Step()
    public void applyGroupUsers() {
        Group.setApplyGroupUsers();
    }
    //CheckBox

    @Step()
    public void addGroupUsers() {
        editAdressBook();
        callRing();
        workTogether();
        createGroupConferention();
    }

    @Step()
    public void editAdressBook() {
        Group.setEditAdressBook();
    }

    @Step()
    public void callRing() {
        Group.setCallRing();
    }

    @Step()
    public void workTogether() {
        Group.setWorkTogether();
    }

    @Step()
    public void createGroupConferention() {
        Group.setCreateGroupConferention();
    }

    // Delete Group
    @Step()
    public void deleteGroupForUsers() {
        checkDelete();
        deleteGroup();
        deleteGroupOk();
    }
    @Step ()
    public void checkDelete() {Group.setCheckDelete();}
    @Step ()
    public void deleteGroup() {Group.setDeleteGroup();}
    @Step ()
    public void deleteGroupOk() {Group.setDeleteGroupOk();}
    //Assert Delete Group
    @Step ()
    public void expectedResultGroup() {Group.setAssertDeleteGroup();}


}



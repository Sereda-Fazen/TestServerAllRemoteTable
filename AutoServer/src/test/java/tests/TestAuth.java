package tests;


import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import utils.Application;


@Story(Application.TestAuth.Server.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads = "1")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAuth extends BeforeClass {
    @ManagedPages(defaultUrl = "http://localhost:8888/admin/general/info/")

    public Pages pages;

    @WithTag("Registration")
    @Test
    public void ATestRegistrationKeyTest() throws InterruptedException {

        String url = "http://localhost:8888/admin/reg/begin/";
        driver.navigate().to(url);

        editInput.clickEdit();
        inputKey.inputKeyForRegistration("RUBH8-Y3VW-LY9B-HFHQ");
        clickRegistrations.clickTheButton();
        assertRegistration.expectedResult("Сервер успешно зарегистрирован");
    }

    @WithTag("RegistrationEmptyKey")
    @Test
    public void ATestRegistrationEmpty() {

        String url = "http://localhost:8888/admin/reg/begin/";
        driver.navigate().to(url);

        editInput.clickEdit();
        clickRegistrations.clickTheButton();
        assertRegistrationEmpty.expectedResultInvalidDate("Неверный формат");
    }


    //@WithTag("Group Conference")

    @WithTag("SIP - valid date")
    @Test
    public void TestASettingsSipValidDate() throws InterruptedException {

        clickSip.addClickSip();
        ip.addIp("asterisk.trueconf.ua");
        login.addLogin("sereda");
        pass.addPass("riuaspeslo");
        registration.addRegistration();
        saveSip.addSaveSip();
        assertResult.expectedAssertSipValidDate("Соединение успешное");

    }
    @WithTag("SIP - invalid server ")
    @Test ()
    public void TestASettingsSipInvalidServer() throws InterruptedException {

        clickSip.addClickSip();
        ip.addIp("asterisk123");
        login.addLogin("sereda");
        pass.addPass("riuaspeslo");
        registration.addRegistration();
        saveSip.addSaveSip();
        assertServer.expectedAssertWrongServer("Неправильный сервер");

    }
    @WithTag("SIP - invalid authorization ")
    @Test ()
    public void TestASettingsSipInvalidAutorization() throws InterruptedException {

        clickSip.addClickSip();
        ip.addIp("asterisk.trueconf.ua");
        login.addLogin("test");
        pass.addPass("123456");
        registration.addRegistration();
        saveSip.addSaveSip();
        assertLogin.expectedAssertWrongLogin("Неправильный логин");
    }
    @WithTag("SIP Proxy")
    @Test ()
    public void TestASettingsServerProxy() throws InterruptedException {

        clickSip.addClickSip();
        ipProxy.addIpProxy("asterisk.trueconf.ua");
        loginProxy.addLoginProxy("sereda");
        passProxy.addPassProxy("riuaspeslo");
        registrationProxy.addRegistrationProxy();
        waitProxy.addSaveSipProxy("Соединение успешное");

        ipProxy.addIpProxy("");
        loginProxy.addLoginProxy("");
        passProxy.addPassProxy("");
        saveSip.addSaveSip();
    }

    @WithTag("Settings")
    @Test
    public void TestASettings() throws InterruptedException {

        setLanguage.checkAllLanguage(1);
        settings.addSettings();
        path.addSettingPath();
        reports.addReport();
        config.addConfig();
        app.addApp();
        setApp.addSetApp();
        saveSet.addSet();
        assertSet.addAssert();
    }
    @WithTag("Settings Net")
    @Test
    public void TestASettingsNet() throws InterruptedException {

        //Accept
        settingsIp.addSettingsNet();
        accept.addAcceptIp();
        //External
        external.addExternalIp();
        checkBoxExternal.addCheckBoxEternal();

        restart.addRestart();
    }
    @WithTag("Settings Net with checkbox")
    @Test
    public void TestASettingsNetForCheck() throws InterruptedException {

        //Accept
        settingsIp.addSettingsNet();
        accept.addCheckBox();
        accept.addApply();
        restart.addRestart();
    }
    @WithTag("Web Settings")
    @Test
    public void TestASettingsWeb() throws InterruptedException {

        clickWebSet.addClickWebSet();
        webGuest.addWebGuest();
        linkApp.addLinkApp();
        outdoorIp.addOutdoorIp();
        logo.addLogo();
    }

    @WithTag("Guest Page")
    @Test
    public void TestASettingsWebGuestPageValid() throws InterruptedException {
        String url = "http://192.168.90.16:8888/guest/";

        driver.navigate().to(url);
        download.addDownload();
        admin.addAdmin();
        assertAdmin.addAssertAdmin("Авторизация прошла успешно");

    }

    @WithTag("Form for Admin invalid date")
    @Test
    public void TestASettingsWebGuestPageInvalid() throws InterruptedException {
        String url = "http://192.168.90.16:8888/guest/";

        driver.navigate().to(url);
        adminFalse.addAdminWrong();
        assertAdmin.addAssertAdminFalse();

    }

    @WithTag("Web Security")
    @Test
    public void TestASettingsWebSecurity() throws InterruptedException {

        link.addLinkSecurity();
        api.addApi();
        //security.addSecurity();
        securityAssert.addSecurityAssert();
        Thread.sleep(1000);
    }

    @WithTag("Create group for guest")
        @Test
        public void TestCreateForWebRTCGuest() throws InterruptedException {

            String url = "http://localhost:8888/admin/conferences/list/";
            groupConf.clickGroupConf();
            createConf.clickCreateConf();
            createConf.newCreateGroupPublic();
            conferMode.checkConferenceMode();
            nameConferenceGroup.enterNameConferenceGroup("Test group for Guest");
            hostForGroup.checkHostForGroup();
            checkBoxAllow.clickCheckboxAllow();
            description.enterDescription("Test description");
            saveConference.clickSaveConference();
            assertGroup.expectedResultForGroupGuest("Группа добавлена");

            //groupConf.clickGroupConf();
            editGroupRtc.editGroupRtcGuest();
            assertWebRTC.expectedResultRtc();
            enterGuest.clickEnterHowGuest("tester");
            assertForGuest.expectedResultForGuestName("Гость присоединился");
            quiteUser.clickQuiteFromGuestUser();
            assertExit.expectedResultForExitFromGuestPage("Гость вышел из конференции");
            driver.navigate().to(url);
            assertDeleteGroup.expectedResultDeleteGroup("Группа успешно удалена");
            Thread.sleep(2000);

        }
    @Ignore
    @WithTag("Polycom+H323")
    @Test
    public void TestASettingsSendH323AndPolycom() throws InterruptedException {

        linkH323.addLinkH323();
        H323Gatekeeper.addH323Gatekeeper("alex");
        saveH323.addSaveH323();
        restartH323.addRestartH323();
        Thread.sleep(2000);

        String polycom = "http://admin:11111@192.168.62.85/";
        driver.navigate().to(polycom);
        clickCall.addClickCall();
        inputNumber.addInputNumber();
        checkH323.addCheckH323();
        call.addCall();
        assertCall.addAssertCall();
        Thread.sleep(2000);
    }

    @WithTag("Add Group for users")
    @Test
    public void TestGroupForUsers() throws InterruptedException {

        clickGroup.clickGroup();
        addGroup.addGroup();
        editGroup.editGroup();
        clickGroup.clickGroup();
        adressBook.adressBook();
        clickGroup.clickGroup();
        addGroupUsers.addGroupUsers();
        deleteGroupForUsers.deleteGroupForUsers();
        expectedResultGroup.expectedResultGroup();
        Thread.sleep(2000);
    }

    @WithTag("LDAP")

    @Test
    public void TestLDAPUsers() throws InterruptedException {

        ldap.clickLDAPPage();
        //clickCheckBox.clickCheckBoxLDAP();
        driver.navigate().to("http://localhost:8888/admin/ldap/settings/");
        checkSecurity.clickCheckSecurity();
        manualSet.choseManualSetting();
        inputServer.inputServerLDAP("192.168.90.12");
        inputDS.inputDS("DC=tst90,DC=loc");
        choseType.choseTypeAuth();
        nameLDAP.inputName("sereda@tst90.loc");
        passLDAP.inputPass("Qwerty1");

        enterUser.enterUserGroupLDAP("CN=Sereda-Group,CN=Users,DC=tst90,DC=loc");
        applyGroup.applyClickGroup();
        restart.addRestart();

        linkUsers.clickLink();

        errorAssert.actualResult("Ошибка сервера");

    }

    @WithTag("SMTP ")
    @Test
    public void TestASettingsSMTPForValid() throws InterruptedException {

        smtp.clickSmtpPage();
        typeAuth.checkTypeAuth();
        host.enterHost("mail.trueconf.com");
        port.enterPort("465");
        loginSmtp.enterLoginSMTP("sereda");
        passSmtp.enterPassSMTP("2Jp6mWTd");
        ssl.clickSsl();
        emailAdmin.enterEmailAdmin("sereda@trueconf.ua");
        connectSmtp.clickConnectedStmp();
        Thread.sleep(4000);
        allChecks.chooseAllChecks();
        applySmtp.clickApplySmtp();
        restart.addRestart();
        Thread.sleep(4000);


    }

    @WithTag("SMTP invalid date ")
    @Test
    public void TestASettingsSMTPForInvalid() throws InterruptedException {

        smtp.clickSmtpPage();
        typeAuth.checkTypeAuth();
        host.enterHost("test");
        port.enterPort("25");
        loginSmtp.enterLoginSMTP("sereda");
        passSmtp.enterPassSMTP("123456");
        ssl.clickSsl();
        emailAdmin.enterEmailAdmin("sereda@trueconf.ua");
        connectSmtp.clickConnectedStmp();
        Thread.sleep(4000);
        assertResultSmtp.addAssertSmtp("Ошибка подключения к SMTP");
    }

    @WithTag("WebRTCGroupConference")
    @Test
    public void TestCreateForUsers() throws InterruptedException {



        linkUsers.clickLink();
        clickAddUsers.clickButtonAddUser();
        trueConfDate.addNewUserInTrueConf("fazen");
        trueConfPass.inputPass("123456");
        userAdd.clickAddButtonUser();
        assertAddUser.ExpectedResult("Пользователь добавлен");
        trueConfDate.addNewUserInTrueConf("sereda");
        trueConfPass.inputPass("123456");
        userAdd.clickAddButtonUser();
        assertAddUser.ExpectedResult("Пользователь второй добавлен");
        trueConfDate.addNewUserInTrueConf("alex");
        trueConfPass.inputPass("123456");
        userAdd.clickAddButtonUser();
        assertAddUser.ExpectedResult("Пользователь третий добавлен");
        userReturn.clickReturn();
        searchUser.inputSearchUser();
        updateUsers.clickUpdate();
        editUser.editUser("sereda");
    }


    @WithTag("WebRTC Create Users")
    @Test
    public void TestCreateForUsersForWebRTC() throws InterruptedException {
        String url = "http://localhost:8888/admin/conferences/list/";
        groupConf.clickGroupConf();
        createConf.clickCreateConf();
        newCreateGroup.newCreateGroup();
        conferMode.checkConferenceMode();
        nameConferenceGroup.enterNameConferenceGroup("First test group");
        hostForGroup.checkHostForGroup();
        allUsers.choosePeopleConferenceAll();
        searchUsers.chooseForSearch("alex", "sereda");
        peopleConference.choosePeopleConference();
        peopleForIdAndMail.chooseUsersForIdAndMail("test", "fazen", "fazen7@mail.ru");
        dataConference.chooseDataConference();
        nonrecurrent.chooseDataForNonrecurrent();
        everyDay.chooseDataForEveryDay();
        description.enterDescription("Test description");
        saveConference.clickSaveConference();
        assertGroup.expectedResultForGroup("Группа добавлена");
        editGroupConference.editGroup("Second test group");
        runGroup.runGroup();

        groupConf.clickGroupConf();
        editGroupRtc.editGroupRtc();
        assertWebRTC.expectedResultRtc();
        authRTCUsers.inputLoginForRTC("sereda", "123456");
        assertRTCUsers.clickEnterExpectedResult("Пользователь авторизовался");
        assertExit.expectedResultForExitFromUser("Время до начала конференции");
        driver.navigate().to(url);
        assertDeleteGroup.expectedResultDeleteGroup("Группа успешно удалена");


    }
    @WithTag("System localisation")
    @Test
    public void TestLocalisation() throws InterruptedException {

        clickSystem.clickSystem();
        clickLanguage.clickLanguage();
        driver.navigate().to("http://localhost:8888/admin/reg/begin/");
        setLanguage.checkAllLanguage(2);
        setLanguage.checkAllLanguage(3);
        setLanguage.checkAllLanguage(4);
        setLanguage.checkAllLanguage(5);
        setLanguage.checkAllLanguage(6);
        setLanguage.checkAllLanguage(7);
        setLanguage.checkAllLanguage(8);
        setLanguage.checkAllLanguage(9);
        setLanguage.checkAllLanguage(10);
        setLanguage.checkAllLanguage(11);
        setLanguage.checkAllLanguage(12);
        setLanguage.checkAllLanguage(13);
        setLanguage.checkAllLanguage(14);

    }



    @WithTag("Delete Users")
    @Test
    public void TestLetDeleteUsersAndConference() throws InterruptedException {

        linkUsers.clickLink();
        action.actionHover();
        assertDeleteUser.AssertDelete("Пользователи удалены успешно");
    }


}













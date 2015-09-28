
package tests;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import steps.GroupConferenceSteps.GroupConferenceSteps;
import steps.GroupConferenceSteps.WebRTCSteps;
import steps.GroupSteps.GroupSteps;
import steps.H323Steps.H323Steps;
import steps.H323Steps.PolycomH323Steps;
import steps.LDAPSteps.LDAPSteps;
import steps.LocalisationSteps.LocalisationSteps;
import steps.RegistrationSteps.RegistrationSteps;
import steps.SIPSteps.ProxySipSteps;
import steps.SIPSteps.SipSteps;
import steps.SMTPSteps.SMTPSteps;
import steps.SecuritySteps.SecuritySteps;
import steps.SettingsNetSteps.SettingsNetSteps;
import steps.SettingsSteps.SettingsSteps;
import steps.UsersSteps.UsersSteps;
import steps.WebSettingsSteps.GuestSteps;
import steps.WebSettingsSteps.WebSettingsSteps;

import java.io.IOException;


/**
 * Created by rb on 19.01.15.
 */
public class BeforeClass {

    /**
     *
     */
    @Managed(uniqueSession = true, driver = "chrome")



    public WebDriver driver;

    public String IEPath = "C:\\Users\\tc_admin\\.jenkins\\jobs\\AutoTestForServer\\webDrivers\\IEDriverServer.exe";
    public String ChromePath = "C:\\Users\\tc_admin\\.jenkins\\jobs\\AutoTestForServer\\webDrivers\\chromedriver.exe";
  
    /*Registration*/

    @Steps
    public RegistrationSteps editInput;
    @Steps
    public RegistrationSteps inputKey;
    @Steps
    public RegistrationSteps clickRegistrations;
    @Steps
    public RegistrationSteps assertRegistration;
    @Steps
    public RegistrationSteps assertRegistrationEmpty;

    /*SIP*/

    @Steps
    public SipSteps clickSip;
    @Steps
    public SipSteps ip;
    @Steps
    public SipSteps login;
    @Steps
    public SipSteps pass;
    @Steps
    public SipSteps registration;
    @Steps
    public SipSteps assertResult;
    @Steps
    public SipSteps assertServer;
    @Steps
    public SipSteps assertLogin;
    @Steps
    public SipSteps saveSip;

    /*Proxy sip*/
    @Steps
    public ProxySipSteps ipProxy;
    @Steps
    public ProxySipSteps loginProxy;
    @Steps
    public ProxySipSteps passProxy;
    @Steps
    public ProxySipSteps registrationProxy;
    @Steps
    public ProxySipSteps waitProxy;


        /*Settings*/
    @Steps
    public SettingsSteps settings;
    @Steps
    public SettingsSteps path;
    @Steps
    public SettingsSteps reports;
    @Steps
    public SettingsSteps config;
    @Steps
    public SettingsSteps app;
    @Steps
    public SettingsSteps setApp;
    @Steps
    public SettingsSteps saveSet;
    @Steps
    public SettingsSteps assertSet;

    /*Settings Net*/
    @Steps
    public SettingsNetSteps settingsIp;
    @Steps
    public SettingsNetSteps accept;
    @Steps
    public SettingsNetSteps checkBox;


    @Steps
    public SettingsNetSteps external;
    @Steps
    public SettingsNetSteps checkBoxExternal;




    @Steps
    public SettingsNetSteps restart;

    /*Web Settings*/

    @Steps
    public WebSettingsSteps clickWebSet;
    @Steps
    public WebSettingsSteps webGuest;
    @Steps
    public WebSettingsSteps linkApp;
    @Steps
    public WebSettingsSteps outdoorIp;
    @Steps
    public WebSettingsSteps logo;

    /*Guest page*/


    @Steps
    public GuestSteps download;
    @Steps
    public GuestSteps admin;
    @Steps
    public GuestSteps assertAdmin;
    @Steps
    public GuestSteps adminFalse;

    /*Web Security*/


    @Steps
    public SecuritySteps link;
    @Steps
    public SecuritySteps security;
    @Steps
    public SecuritySteps api;
    @Steps
    public SecuritySteps securityAssert;

    /*Users*/
    @Steps
    public UsersSteps linkUsers;
    @Steps
    public UsersSteps clickAddUsers;
    @Steps
    public UsersSteps trueConfDate;
    @Steps
    public UsersSteps trueConfPass;
    @Steps
    public UsersSteps userAdd;
    @Steps
    public UsersSteps userReturn;
    @Steps
    public UsersSteps assertAddUser;
    @Steps
    public UsersSteps updateUsers;
    @Steps
    public UsersSteps deleteUser;
    @Steps
    public UsersSteps searchUser;
    @Steps
    public UsersSteps  assertDeleteUser;
    @Steps
    public UsersSteps editUser;
    @Steps
    public UsersSteps action;


    /* H.323 шлюз*/

    @Steps
    public H323Steps linkH323;
    @Steps
    public H323Steps H323Gatekeeper;
    @Steps
    public H323Steps saveH323;
    @Steps
    public H323Steps assertH323;
    @Steps
    public H323Steps restartH323;

    /*Polycom + H323*/

    @Steps
    public PolycomH323Steps clickCall;
    @Steps
    public PolycomH323Steps inputNumber;
    @Steps
    public PolycomH323Steps checkH323;
    @Steps
    public PolycomH323Steps call;
    @Steps
    public PolycomH323Steps assertCall;

    /*Group Users**/

    @Steps
    public GroupSteps clickGroup;
    @Steps
    public GroupSteps addGroup;
    @Steps
    public GroupSteps editGroup;
    @Steps
    public GroupSteps adressBook;
    @Steps
    public GroupSteps addGroupUsers;
    @Steps
    public GroupSteps deleteGroupForUsers;
    @Steps
    public GroupSteps expectedResultGroup;

    /*LDAP*/
    @Steps
    public LDAPSteps ldap;
    @Steps
    public LDAPSteps checkLDAP;
    @Steps
    public LDAPSteps clickCheckBox;
    @Steps
    public LDAPSteps clickEditButton;
    @Steps
    public LDAPSteps checkSecurity;
    @Steps
    public LDAPSteps manualSet;
    @Steps
    public LDAPSteps inputServer;
    @Steps
    public LDAPSteps inputDS;
    @Steps
    public LDAPSteps choseType;
    @Steps
    public LDAPSteps nameLDAP;
    @Steps
    public LDAPSteps passLDAP;
    @Steps
    public LDAPSteps clickOversee;
    @Steps
    public LDAPSteps searchGroup;
    @Steps
    public LDAPSteps nameGroup;
    @Steps
    public LDAPSteps choseGroup;

    @Steps
    public LDAPSteps enterUser;

    @Steps
    public LDAPSteps applyGroup;
    @Steps
    public LDAPSteps errorAssert;

    /*SMTP*/

    @Steps
    public SMTPSteps smtp;
    @Steps
    public SMTPSteps typeAuth;
    @Steps
    public SMTPSteps host;
    @Steps
    public SMTPSteps port;
    @Steps
    public SMTPSteps loginSmtp;
    @Steps
    public SMTPSteps passSmtp;
    @Steps
    public SMTPSteps ssl;
    @Steps
    public SMTPSteps emailAdmin;
    @Steps
    public SMTPSteps connectSmtp;
    @Steps
    public SMTPSteps allChecks;
    @Steps
    public SMTPSteps applySmtp;
    @Steps
    public SMTPSteps assertSmtp;
    @Steps
    public  SMTPSteps  assertResultSmtp;

    /*Group Conference*/

    @Steps
    public GroupConferenceSteps groupConf;
    @Steps
    public GroupConferenceSteps createConf;
    @Steps
    public GroupConferenceSteps newCreateGroup;
    @Steps
    public GroupConferenceSteps conferMode;
    @Steps
    public GroupConferenceSteps nameConferenceGroup;
    @Steps
    public GroupConferenceSteps hostForGroup;
    @Steps
    public GroupConferenceSteps  allUsers;
    @Steps
    public GroupConferenceSteps searchUsers;
    @Steps
    public GroupConferenceSteps peopleConference;
    @Steps
    public GroupConferenceSteps  peopleForIdAndMail;
    @Steps
    public GroupConferenceSteps dataConference;
    @Steps
    public GroupConferenceSteps nonrecurrent;
    @Steps
    public GroupConferenceSteps  everyDay;
    @Steps
    public GroupConferenceSteps description;
    @Steps
    public GroupConferenceSteps saveConference;
    @Steps
    public GroupConferenceSteps assertGroup;
    @Steps
    public GroupConferenceSteps editGroupConference;
    @Steps
    public GroupConferenceSteps runGroup;
    @Steps
    public GroupConferenceSteps assertDeleteGroup;

    /*WebRTC*/

       /*Group Conference*/

    @Steps
    public WebRTCSteps editGroupRtc;
    @Steps
    public WebRTCSteps assertWebRTC;
    @Steps
    public WebRTCSteps help;
    @Steps
    public WebRTCSteps enterGuest;
    @Steps
    public  WebRTCSteps assertForGuest;
    @Steps
    public WebRTCSteps quiteUser;
    @Steps
    public WebRTCSteps assertExit;
    @Steps
    public WebRTCSteps authRTCUsers;
    @Steps
    public WebRTCSteps assertRTCUsers;

    /*WebRTC for Guest*/
    @Steps GroupConferenceSteps checkBoxAllow;


      /*Localisation*/

    @Steps
    public LocalisationSteps clickSystem;
    @Steps
    public LocalisationSteps clickLanguage;
    @Steps
    public LocalisationSteps setLanguage;



    @Before
    public void myTest() throws Exception {
        System.setProperty("webdriver.ie.driver", IEPath);
        System.setProperty("webdriver.chrome.driver", ChromePath);
        settings.start_browser();
        driver.manage().window().maximize();


    }

    @After
    public void close() throws IOException {
        driver.close();
    }




    }




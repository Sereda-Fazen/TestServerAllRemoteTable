package page.LDAP;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class LDAPPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    /*LDAP*/
    @FindBy(css  = "#users-storage-menu-li > a")
    private WebElement clickLDAP;


    @FindBy(css  = "#mode")
    private WebElement clickCheckBoxLDAP;
    @FindBy(xpath = "//*[@id='content-side']/div[1]/fieldset[2]/div/div/a")
    private WebElement editLDAP;
    @FindBy(css = "#secure-connection")
    private WebElement checkSecurity;



    //Settings of Server
    @FindBy (css = "div.fl > label:nth-of-type(3) > input")
    private WebElement manualSetting;
    @FindBy(css  = "#ldap_server")
    private WebElement serverLDAP;
    @FindBy(css  = "#ldap_base_dn")
    private WebElement serverBaseDs;


    //Autenficantion
    @FindBy (css = "#auth-type")
    private WebElement authType;
    @FindBy(xpath  = "//*[@id='auth-type']/option[1]")
    private WebElement justAuth;
    @FindBy(css = " #ldap_auth_user")
    private WebElement nameLDAP;
    @FindBy (css = " #ldap_auth_password")
    private WebElement passLDAP;
    @FindBy (css = "#ldap-group-dialog")
    private WebElement oversee;
    @FindBy (css = "#ldap_base_dn")
    private WebElement basicDN;
    //Choose group
    @FindBy (id = "strpos-block")
    private WebElement searchGroup;
    @FindBy (css = "[name=\"groups\"]")
    private WebElement nameGroup;
    @FindBy (css = "#ldap-group-select")
    private WebElement choseGroup;
    //Apply
    @FindBy (css = "#ldap_group")
    private WebElement userGroupLDAP;


    @FindBy (css = "div.content-container > a:nth-of-type(1)")
    private WebElement applyGroup;
    @FindBy (css = "div.ui-dialog-buttonset > button:first-child > span.ui-button-text")
    private WebElement choseOk;

    /*AssertFalse*/
    @FindBy (css = "div.mlpl_members")
    private WebElement errorUsers;
    @FindBy (css = " body")
    private WebElement emptyUsers;

    public LDAPPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    public void setClickLDAP() {
        clickOn(clickLDAP);
    }
    public void setClickCheckBoxLDAP()  {clickOn(clickCheckBoxLDAP);}
    public void setEditLDAP() {
        clickOn(editLDAP);
    }
    public void setClickCheckSecurity(){clickOn(checkSecurity);}
    //Auth
    public void setManualSetting()  {clickOn(manualSetting);}
    public void setServerLDAP(String server)  {enter(server).into(serverLDAP);}
    public void setServerDS (String serverDs)  {enter(serverDs).into(serverBaseDs);}
    public void setAuthType(){clickOn(authType); clickOn(justAuth);}
    public void setNameLDAP(String name)  {enter(name).into(nameLDAP);}
    public void setPassLDAP(String pass)  {enter(pass).into(passLDAP);}
    //Group
    public void setOversee(){clickOn(oversee);}
    public void setCheckGroupLDAP(String group){enter(group).into(searchGroup);}
    public void setNameGroup(){clickOn(nameGroup);}
    public void setChoseGroup(){clickOn(choseGroup);}
    //Apply
    public void setUserGroupLDAP(String userGroup){enter(userGroup).into(userGroupLDAP);}

    public void setApplyGroup(){clickOn(applyGroup);}


    //Assert false
    public void setErrorUsers(String textFalse) {
        assertTrue(textFalse, element(errorUsers).isPresent());
    }

}






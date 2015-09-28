package steps.GroupConferenceSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.GroupConferention.WebRtc;


public class WebRTCSteps extends ScenarioSteps {
    WebRtc WebRrcPage;

    public WebRTCSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        WebRtc WebRrcPage = getPages().get(WebRtc.class);
        WebRrcPage.open();
    }
    // GroupConference
    @Step()
    public void clickGroupConf() {
        WebRrcPage.setClickGroup();
    }
    @Step ()
    public void editGroupRtc () throws  InterruptedException {
        WebRrcPage.setEditGroup();
    }
    @Step ()
    public void editGroupRtcGuest () throws  InterruptedException {
        WebRrcPage.setEditGroupGuest();
    }

    @Step ()
    public void expectedResultRtc () throws  InterruptedException {
        WebRrcPage.setClickWerRTC();
    }
    @Step ()
    public void clickHelp () throws  InterruptedException {
        WebRrcPage.setHelp();
        clickDownload();
        clickHelpOther();
        clickHelpBrowser();
        clickHelpVideo();
        clickHelpReturn();


    }
    @Step () public void clickDownload() {WebRrcPage.setHelpDownload();}
    @Step () public void clickHelpBrowser() {WebRrcPage.setHelpBrowser();}
    @Step () public void clickHelpOther() {WebRrcPage.setHelpOther();}
    @Step () public void clickHelpVideo() {WebRrcPage.setHelpVideo();}
    @Step () public void clickHelpReturn() {WebRrcPage.setHelpReturn();}

    @Step ()
    public void clickEnterHowGuest (String questName) throws  InterruptedException {
        WebRrcPage.setEnterHowGuest(questName);
    }
    @Step()
    public void expectedResultForGuestName(String join) {
        WebRrcPage.setAssertRTC(join);
    }
    @Step()
    public void clickQuiteFromGuestUser ()throws InterruptedException{
        WebRrcPage.setQuiteFromGuestUser();

    }
    @Step()
    public void expectedResultForExitFromGuestPage(String assertExit){
        WebRrcPage.setForExitFromGuestPage(assertExit);
    }
    @Step()
    public void expectedResultForExitFromUser(String assertWait) throws InterruptedException {
        WebRrcPage.setExpectedResultForExitFromUser(assertWait);
    }



    @Step ()
    public void inputLoginForRTC (String login, String pass) throws  InterruptedException {
        WebRrcPage.setLogin(login, pass);
    }

    @Step ()
    public void clickEnterExpectedResult (String enterUserRTC) throws  InterruptedException {
        WebRrcPage.setEnterAuth(enterUserRTC);
    }


}



package steps.LocalisationSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Localisation.LocalisationPage;


public class LocalisationSteps extends ScenarioSteps {
    LocalisationPage LocalPage;

    public LocalisationSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        LocalisationPage LocalPage = getPages().get(LocalisationPage.class);
        LocalPage.open();
    }

    // Group

    @Step()
    public void clickSystem() {LocalPage.setSystem();}
    @Step()
    public void clickLanguage() {
        clickLanguageRussian();


    }
    @Step()
    public void clickLanguageRussian() {LocalPage.setClickRussian();}



    @Step()
    public void checkAllLanguage(int number) throws InterruptedException{
        LocalPage.clickToLanguage(number);

    }



}



package steps.WebSettingsSteps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import page.WebSettings.WebSettingsPage;


public class WebSettingsSteps extends ScenarioSteps {
    WebSettingsPage WebPage;

    public WebSettingsSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void start_browser() {
        WebSettingsPage loginPage = getPages().get(WebSettingsPage.class);
        loginPage.open();
    }

    @Step("Клик - <strong> Веб настройки</strong>")
    public void addClickWebSet() throws InterruptedException{
        WebPage.setClickWebSet();
    }

    @Step("Данные для администратора")
    public void addWebGuest() throws InterruptedException {
        addWebGuest2();
        addWebGuest3();
        addWebGuest4();
    }
    @Step ("Ввод 'Имя'")
    public void addWebGuest2() {
    }
    @Step ("Ввод 'Мейла'")
    public void addWebGuest3() {
    }
    @Step ("Ввод 'Телефона'")
    public void addWebGuest4() {
        WebPage.setWebGuest();
    }



    @Step("Клик URL для прямого скачивания")
    public void addLinkApp() {
        WebPage.setLinkApp();
    }



    @Step("Ввод внешнего IP адреса")
    public void addOutdoorIp() {
        WebPage.setOutdoorIp();  }


    @Step ("Клик на Логотип по умолчанию  ")
    public void addLogo ()  {
        WebPage.setLogo();
    }











}



package steps.SecuritySteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.SecurityPage.Security;


public class SecuritySteps extends ScenarioSteps {
    Security SecurityPage;

    public SecuritySteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        Security SecurityPage = getPages().get(Security.class);
        SecurityPage.open();
    }

    //Панель администратора

    @Step ("Клик - Безопасность")
    public void addLinkSecurity() {
        SecurityPage.setLinkSecurity();
    }


    @Step("Панель безопасности")
    public void addSecurity (){

        addCheckBox();
        addClearIP();
        addNetIP();
    }


    @Step("Клик чекбокс 'Ограничить доступ к разделу по IP' ")
    public void addCheckBox(){
        SecurityPage.setCheckBox();
    }
    @Step("Удалить поле 'Подсети'")
    public void addClearIP(){
        SecurityPage.setClearIP();
    }
    @Step("Клик  'Применить'")
    public void addNetIP() {
        SecurityPage.setNetIP();
    }

    //Api
    @Step("Панель API")
    public void addApi() {
        addDeleteKey();
        addKey();
        addApiUpdate();
    }

    @Step("Удалить 'ключ' ")
    public void addDeleteKey() {
        SecurityPage.setDeleteKey();
    }

    @Step("Клик 'Сгенирировать ключ' ")
    public void addKey() {
        SecurityPage.setKey();
    }
    @Step ("Клик 'Применить'")
    public void addApiUpdate() {SecurityPage.setApiUpdate();}



    @Step ("<strong>Ожидаемый результат</strong>")
    public void addSecurityAssert () {SecurityPage.setSecurityAssert();}

}



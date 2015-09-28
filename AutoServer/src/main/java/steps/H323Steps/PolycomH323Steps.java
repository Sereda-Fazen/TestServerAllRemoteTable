package steps.H323Steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.H323.Page323;
import page.H323.PolycomPage323;


public class PolycomH323Steps extends ScenarioSteps {
    PolycomPage323 PolycomH323;

    public PolycomH323Steps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        PolycomPage323 PolycomH323 = getPages().get(PolycomPage323.class);
        PolycomH323.open();
    }

    @Step("Клик 'Заказать звонок' ")
    public void addClickCall(){
        PolycomH323.setClickCall();
    }

    @Step("Ввод номера 'h323-ID или IP:' ")
    public void addInputNumber(){
        PolycomH323.setInputNumber();
    }
    @Step("Выбор 'H323 шлюза' ")
    public void addCheckH323(){
        PolycomH323.setCheckH323();
    }
    @Step("Клик по иконке 'Звонок' ")
    public void addCall() {
        PolycomH323.setCall();}
    @Step ("<strong>Ожидаемый результат - </strong>")
    public void addAssertCall () { PolycomH323.setAssertCall();}

}



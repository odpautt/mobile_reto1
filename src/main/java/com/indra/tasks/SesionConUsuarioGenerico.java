package com.indra.tasks;

import com.indra.interactions.Scroll;
import com.indra.user_interfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.indra.enums.Direccion.ABAJO;
import static com.indra.enums.Direccion.ARRIBA;
import static com.indra.user_interfaces.LoginUI.STANDARD_USER;
import static java.time.Duration.ofSeconds;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.as;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SesionConUsuarioGenerico implements Task {
    public static Performable sesionConLasCredenciales(String usuario, String password ){
        return Task.where("{0} inicia sesion con sus credenciales #usuario",
                Llenar.elFormularioDeLogin(usuario,password),
                Click.on(LoginUI.LOGINBTN)
        );
    }


    @Step("{0} inicia sesion con el usuario generico")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginUI.USERNAME, isVisible()).forNoMoreThan(ofSeconds(20)),
                Scroll.toElement(STANDARD_USER.resolveFor(actor), as(actor).getDriver(), ABAJO, 10),
                Click.on(STANDARD_USER),
                Scroll.toElement(LoginUI.LOGINBTN.resolveFor(actor), as(actor).getDriver(), ARRIBA, 10),
                Click.on(LoginUI.LOGINBTN)
        );

    }


}

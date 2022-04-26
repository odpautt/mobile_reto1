package com.indra.tasks;

import com.indra.enums.Direccion;
import com.indra.interactions.Scroll;
import com.indra.user_interfaces.CarritoComprasUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.indra.enums.Direccion.ABAJO;
import static com.indra.user_interfaces.ProductosUI.AGREGAR_AL_CARRITO;
import static com.indra.user_interfaces.ProductosUI.MOCHILASOUCESLABS;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.as;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarArticulo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CarritoComprasUI.CARRITOCOMPRAS,isVisible()).forNoMoreThan(Duration.ofSeconds(20)),
                Scroll.toElement(MOCHILASOUCESLABS.resolveFor(actor),as(actor).getDriver(), ABAJO,10),
                Click.on(MOCHILASOUCESLABS),
                Scroll.toElement(AGREGAR_AL_CARRITO.resolveFor(actor),as(actor).getDriver(), ABAJO,5),
                Click.on(AGREGAR_AL_CARRITO)
        );

    }
}

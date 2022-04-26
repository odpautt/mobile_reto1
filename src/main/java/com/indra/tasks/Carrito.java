package com.indra.tasks;

import com.indra.user_interfaces.CarritoComprasUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Carrito {
    public static Performable hacerClick() {
        return Task.where("se hace click en el boton carrito de compras",
                Click.on(CarritoComprasUI.CARRITOCOMPRAS)
        );
    }
}

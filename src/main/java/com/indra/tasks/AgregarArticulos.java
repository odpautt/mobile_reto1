package com.indra.tasks;

import com.indra.user_interfaces.ProductosUI;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class AgregarArticulos {

    public static Performable seAgreganLosDosArticulosAlCarritoDeCompras() {
        return Task.where("se agregan los articulos",
                Click.on(ProductosUI.ARTICULO_1),
                Click.on(ProductosUI.ARTICULO_2)
        );
    }

    public static SeleccionarArticulo seleccionarArticulo(){
        return Tasks.instrumented(SeleccionarArticulo.class);
    }
}


package com.indra.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosUI {
    public static final Target TITULO_SESION = Target.the("titulo de incio de sesion")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-Zona de ca\u00EDda del carrito de compras']/android.view.ViewGroup/android.widget.TextView");

    public static final Target ARTICULO_1 = Target.the("articulo de compras 1")
            .locatedBy("(//android.view.ViewGroup[@content-desc='test-A\u00D1ADIR A CARRITO'])[1]");

    public static final Target ARTICULO_2 = Target.the("articulo de compras 2")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-AADIR A CARRITO']");
    public static final Target MOCHILASOUCESLABS = Target.the("Mochila Souces Labs")
            .locatedBy("//android.widget.TextView[@text='Mochila Sauce Labs']");
    public static final Target AGREGAR_AL_CARRITO = Target.the("boton agregar al carrito")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-A\u00D1ADIR A CARRITO']/android.widget.TextView");

}





package com.indra.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoComprasUI {

    public static final Target CARRITOCOMPRAS = Target.the("carrito de compras")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-Carrito']/android.view.ViewGroup/android.widget.ImageView");

    public static final Target CARRITOCOMPRASTITULO_ART1 = Target.the("titulo del articulo 1 en carrito de compras")
            .locatedBy("(//android.view.ViewGroup[@content-desc='test-Descripci\u00f3n'])[1]/android.widget.TextView[1]");

    public static final Target CARRITOCOMPRASTITULO_ART2 = Target.the("titulo del articulo 2 en carrito de compras")
            .locatedBy("(//android.view.ViewGroup[@content-desc='test-Descripci\u00f3n'])[2]/android.widget.TextView[1]");

    public static final Target MOCHILASOUCESLABS = Target.the("titulo del articulo")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-Descripci\u00f3n']/android.widget.TextView[1]");



}





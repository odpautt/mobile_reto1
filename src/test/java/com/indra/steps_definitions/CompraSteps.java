package com.indra.steps_definitions;

import com.indra.tasks.*;
import com.indra.user_interfaces.CarritoComprasUI;
import com.indra.user_interfaces.LoginUI;
import com.indra.user_interfaces.ProductosUI;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;

import java.time.Duration;

public class CompraSteps {

    @Managed(driver="appium")
    private AppiumDriver driver;
    private Actor orlando= Actor.named("orlando");
    @Before
    public void inicializarEscenario(){
        Stage stage = OnStage.setTheStage(new OnlineCast());
        orlando.can(BrowseTheWeb.with(driver));

    }


    @When("el inicia sesion con el usuario generico")
    public void elIniciaSesionConElUsuarioGenerico() {
        orlando.attemptsTo(Iniciar.sesionConUsuarioGenerico());
    }

    @When("agregar un articulo a la canasta de compras")
    public void agregarUnArticuloALaCanastaDeCompras() {
        orlando.attemptsTo(AgregarArticulos.seleccionarArticulo());
    }
    @Then("al hacer clic en la casta el sistema deberia mostrar el detalle del producto seleccionado")
    public void alHacerClicEnLaCastaElSistemaDeberiaMostrarElDetalleDelProductoSeleccionado() {
        orlando.attemptsTo(Carrito.hacerClick());
        orlando.attemptsTo(Ensure.that(CarritoComprasUI.CARRITOCOMPRASTITULO_ART1.waitingForNoMoreThan(Duration.ofSeconds(10))).isDisplayed());

    }

}

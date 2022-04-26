package com.indra.tasks;

import net.serenitybdd.screenplay.Tasks;


public class Iniciar {
    public static SesionConUsuarioGenerico sesionConUsuarioGenerico(){
        return Tasks.instrumented(SesionConUsuarioGenerico.class);
    }

}

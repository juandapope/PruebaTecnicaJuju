package test.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import reto.steps.InicioSesionStep;

import java.io.IOException;

public class InicioSesionStepDefinitions {

    @Steps
    InicioSesionStep inicioSesionStep;

    @Dado("el usuario ingreso a la plataforma")
    public void elUsuarioIngresoALaPlataforma() {
        inicioSesionStep.abriNavegador();
    }
    @Cuando("el usuario ingresa sus credenciales")
    public void elUsuarioIngresaSusCredenciales() throws IOException {
       inicioSesionStep.ingresarUsuario();
       inicioSesionStep.ingresarClave();
    }
    @Cuando("el usuario hace clic en el boton ingresar")
    public void elUsuarioHaceClicEnElBotonIngresar() {
        inicioSesionStep.clicAcceder();
    }

    @Cuando("el usuario visualiza el mensaje de bienvenida")
    public void elUsuarioVisualizaElMensajeDeBienvenida() {
        inicioSesionStep.seVerificaMensajeBienvenida();
    }
    @Entonces("el usuario cierra sesion")
    public void elUsuarioCierraSesion() {
        inicioSesionStep.clicSalir();
    }


    @Dado("el usuario ingreso a la plataforma juju")
    public void elUsuarioIngresoALaPlataformaJuju() {
        inicioSesionStep.abriNavegador();
    }
    @Cuando("el usuario ingresa sus credenciales de manera incorrecta")
    public void elUsuarioIngresaSusCredencialesDeManeraIncorrecta() throws IOException {
        inicioSesionStep.ingresarUsuarioFallido();
        inicioSesionStep.ingresarClaveFallido();
    }

    @Cuando("hace clic en el boton ingresar")
    public void haceClicEnElBotonIngresar() {
    inicioSesionStep.clicAcceder();
    }

    @Entonces("el usuario visualiza el mensaje de credenciales incorrectas")
    public void elUsuarioVisualizaElMensajeDeCredencialesIncorrectas() {
    inicioSesionStep.seVerificaMensajeError();
    }


}

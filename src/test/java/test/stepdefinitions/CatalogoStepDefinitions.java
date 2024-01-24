package test.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import reto.steps.CatalogoStep;
import reto.steps.InicioSesionStep;

import java.io.IOException;

public class CatalogoStepDefinitions {

    @Steps
    CatalogoStep catalogoStep;
    @Steps
    InicioSesionStep inicioSesionStep;
    @Dado("el usuario ingresó a la plataforma")
    public void elUsuarioIngresóALaPlataforma() {
        inicioSesionStep.abriNavegador();
    }

    @Cuando("el usuario ingresa credenciales")
    public void elUsuarioIngresaCredenciales() throws IOException {
        inicioSesionStep.ingresarUsuario();
        inicioSesionStep.ingresarClave();
    }

    @Cuando("el hace clic en el boton ingresar")
    public void elHaceClicEnElBotonIngresar() {
        inicioSesionStep.clicAcceder();
    }

    @Cuando("el usuario selecciona el módulo de catálogo")
    public void elUsuarioSeleccionaElMóduloDeCatálogo() {
        catalogoStep.clicEnCatalogo();
    }
    @Cuando("el usuario hace clic en la opción ver más")
    public void elUsuarioHaceClicEnLaOpciónVerMás() {
        catalogoStep.clicEnVerMas();

    }
    @Cuando("el usuario es redirigido a la página del catálogo")
    public void elUsuarioEsRedirigidoALaPáginaDelCatálogo() {
        catalogoStep.seVerificaMensajeCatalogo();
    }
    @Entonces("El usuario visualiza el catálogo")
    public void elUsuarioVisualizaElCatálogo() {
        catalogoStep.seVerificaMensajePCO();
    }

    // ---- Vista Carrusel
    @Dado("ingresó a la plataforma")
    public void ingresóALaPlataforma() throws IOException {
    inicioSesionStep.abriNavegador();
        inicioSesionStep.ingresarUsuario();
        inicioSesionStep.ingresarClave();
        inicioSesionStep.clicAcceder();
    }
    @Cuando("selecciona el módulo de catálogo")
    public void seleccionaElMóduloDeCatálogo() {
        catalogoStep.clicEnCatalogo();
    }
    @Cuando("el usuario es redirigido a la página de incentivos")
    public void elUsuarioEsRedirigidoALaPáginaDeIncentivos() {
    catalogoStep.seVerificaMensajeIncentivos();
    }
    @Entonces("el usuario visualiza la información de los productos destacados")
    public void elUsuarioVisualizaLaInformaciónDeLosProductosDestacados() {
    catalogoStep.seVerificaMensajeProductosDestacados();
    }

}

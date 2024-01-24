package reto.steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import reto.pageobjects.InicioSesionPageObject;
import reto.utils.Datos;
import reto.utils.Espera;

import java.io.IOException;

public class InicioSesionStep {

    Datos datos = new Datos();

    Espera espera = new Espera();
    InicioSesionPageObject inicioSesionPageObject = new InicioSesionPageObject();

    private static final String HOJA_EXCEL = "info";
    private static final String RUTA_EXCEL = "datos.xlsx";

    private static final String HOJA_EXCEL_2 = "error";


    @Step
    public void abriNavegador(){
        WebDriverManager.chromedriver().setup();
        inicioSesionPageObject.openUrl("https://automationcompany-qa.jujutests.com/pages/login");
    }

    @Step
    public void ingresarUsuario () throws IOException {
        espera.espera(3);
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.getTxtUsuario()).sendKeys(datos.
                leerDatoExcel(HOJA_EXCEL,RUTA_EXCEL,1,0));
    }

    @Step
    public void ingresarClave () throws IOException {
        //espera.espera(5);
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.getTxtClave()).sendKeys(datos.
                leerDatoExcel(HOJA_EXCEL,RUTA_EXCEL,1,1));
    }

    @Step
    public void ingresarUsuarioFallido () throws IOException {
        espera.espera(5);
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.getTxtUsuario()).sendKeys(datos.
                leerDatoExcel(HOJA_EXCEL_2,RUTA_EXCEL,1,0));
    }

    @Step
    public void ingresarClaveFallido () throws IOException {
        espera.espera(5);
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.getTxtClave()).sendKeys(datos.
                leerDatoExcel(HOJA_EXCEL_2,RUTA_EXCEL,1,1));
    }

    @Step
    public void clicAcceder () {
        espera.espera(5);
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.
                getBtnEntrar()).click();
        espera.espera(5);
    }

    @Step
    public void seVerificaMensajeBienvenida(){
        String texto = inicioSesionPageObject.getTxtBienvenida().replaceAll("\\s+", "");
        Assert.assertEquals("Hola,User", texto);
        System.out.println("Funciona, si lo reconoce");
        espera.espera(5);
    }

    @Step
    public void seVerificaMensajeError(){
        String texto = inicioSesionPageObject.getTxtMensajeError();
        Assert.assertEquals("Usuario o contraseña incorrectos.", texto);
        System.out.println("Funciona, fallo");
        espera.espera(15);
    }

    @Step
    public void clicSalir () {
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.
                getBtnSalir()).click();
        System.out.println("Salio");
        espera.espera(5);
    }
}

package reto.steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import reto.pageobjects.CatalogoPageObject;
import reto.pageobjects.InicioSesionPageObject;
import reto.utils.Datos;
import reto.utils.Espera;

import java.io.IOException;

public class CatalogoStep {

    Espera espera = new Espera();

    CatalogoPageObject catalogoPageObject = new CatalogoPageObject();
    @Step
    public void clicEnCatalogo(){
        espera.espera(5);
        catalogoPageObject.getDriver().findElement(catalogoPageObject.
                getBtnCatalogo()).click();
    }

    @Step
    public void clicEnVerMas(){
        espera.espera(5);
        catalogoPageObject.getDriver().findElement(catalogoPageObject.
                getBtnVerMas()).click();
    }

    @Step
    public void seVerificaMensajeCatalogo(){
        espera.espera(5);
        String texto = catalogoPageObject.getTxtCatalogo();
        Assert.assertEquals("Catálogo", texto);
        System.out.println("Funciona, si lo reconoce");
    }

    @Step
    public void seVerificaMensajePCO(){
        espera.espera(5);
        String texto = catalogoPageObject.getTxtPCO();
        Assert.assertEquals("Product of the day: 122 - PCO", texto);
        System.out.println("Funciona, si lo reconoce");
    }

    @Step
    public void seVerificaMensajeIncentivos(){
        espera.espera(5);
        String texto = catalogoPageObject.getTxtIncentivos();
        Assert.assertEquals("AutomationTest - Cat...", texto);
        System.out.println("Funciona, si lo reconoce");
    }

    @Step
    public void seVerificaMensajeProductosDestacados(){
        espera.espera(5);
        String texto = catalogoPageObject.getTxtProductosDestacados();
        Assert.assertEquals("Productos destacados", texto);
        System.out.println("Funciona, si lo reconoce");
    }
}


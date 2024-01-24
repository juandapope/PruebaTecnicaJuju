package reto.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InicioSesionPageObject extends PageObject {

    By txtUsuario = By.id("userName");
    By txtClave = By.id("password");
    By btnEntrar = By.xpath("//*[contains(text(), 'Entrar')]");
    By btnSalir = By.xpath("//*[@id=\"wrapMenuMain\"]/div[2]/div[1]/div/div/div/div/img");
    By mensajeError = By.xpath("/html/body/ngb-modal-window/div/div/jjwl-alert/div[2]/p[1]");

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnEntrar() {
        return btnEntrar;
    }

    public String getTxtBienvenida() {
        WebElement element = getDriver().findElement(By.xpath("//*[@id='ddl-profile-menu']/p"));
        return element.getText();
    }

    public By getBtnSalir() {
        return btnSalir;
    }

    public String getTxtMensajeError() {
        WebElement element = getDriver().findElement(By.xpath("/html/body/ngb-modal-window/div/div/jjwl-alert/div[2]/p[1]"));
        return element.getText();
    }
}

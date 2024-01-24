package reto.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CatalogoPageObject extends PageObject {

    By btnCatalogo = By.xpath("//*[contains(text(), 'Catálogo')][1]");
    By btnVerMas = By.xpath("//*[contains(text(), 'Ver más')][1]");


    public By getBtnCatalogo() {
        return btnCatalogo;
    }

    public By getBtnVerMas() {
        return btnVerMas;
    }

    public String getTxtCatalogo() {
        WebElement element = getDriver().findElement(By.xpath("//h2[contains(text(), 'Catálogo')]"));
        return element.getText();
    }

    public String getTxtPCO() {
        WebElement element = getDriver().findElement(By.xpath("//*[contains(text(), ' Product of the day: 122 - PCO ')]"));
        return element.getText();
    }

    public String getTxtIncentivos() {
        WebElement element = getDriver().findElement(By.xpath("//span[contains(text(), 'AutomationTest - Cat...')][1]"));
        return element.getText();
    }

    public String getTxtProductosDestacados() {
        WebElement element = getDriver().findElement(By.xpath("//h2[contains(text(), 'Productos destacados ')]"));
        return element.getText();
    }
}

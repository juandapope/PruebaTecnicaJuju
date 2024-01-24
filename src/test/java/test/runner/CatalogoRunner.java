package test.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Catalogo.feature",
        glue = "test/stepdefinitions",
        tags = "@VistaCarrusel",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CatalogoRunner {
}

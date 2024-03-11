package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"steps"},
        dryRun = false,                                 // Exibição de log
        monochrome = true                              // Detalhes do log
)

public class Runner {

}
package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// caminho das features
		features = "src/test/resources/features",
		// packge dos steps
		glue = "steps",
		// tags que deseja executar
		tags = "@desafio",
		// validar se existe gherkin sem steps
		dryRun = false,
		// pretty formatacao do console para aparecer igual ao cucumber
		// html é o status report no formato html
		plugin = { "pretty", "html:target/report.html" },
		// tirar os caracteres especiais do console
		monochrome = true

)

public class Executa {

}

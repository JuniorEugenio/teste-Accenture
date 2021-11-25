package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	
	protected static WebDriver driver;

	/**
	 * Este metodo abre o navegador chrome e firefox, deve ser fornecido o site que deseja para abertura
	 * 
	 * @author José Luiz Eugênio 
	 * @param site
	 */

	public void abrirNavegador(String navegador, String site) {
		try {
			if (navegador.equalsIgnoreCase("CHROME")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (navegador.equalsIgnoreCase("FIREFOX")) {
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else { 
				System.out.println("Opção inválida");
			}
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("-------------- Erro ao abrir Navegador---------" + e.getMessage());
			System.out.println("-------------- causa do erro ------------------" + e.getCause());
		}

	}

	 public void fecharNavegador() {
		  try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("--------erro ao fechar navegador" + e.getMessage());
			System.err.println("--------causa do erro" + e.getCause());
		}
	  }


}

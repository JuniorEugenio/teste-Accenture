package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Browsers;
import pages.Insurance;
import pages.Metodos;

public class TricentisTeste {

	Browsers browsers = new Browsers();
	Insurance truck = new Insurance();
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	@Given("acessar o site da tricentis sampleapp {string}")
	public void acessar_o_site_da_tricentis_sampleapp(String site) {
		browsers.abrirNavegador("chrome", site);

	}

	@Given("clico no menu {string}")
	public void clico_no_menu(String menu) {

	}

	@When("preencher dados do veiculo")
	public void preencher_dados_do_veiculo() {
		truck.dadosVeiculo("BMW", "Scooter", "1500", "100", "11/28/2020", "5", "3", "Gas", "250", "450", "50000",
				"30000");
	}

	@When("preencher dados do seguro")
	public void preencher_dados_do_seguro() {
		truck.dadosSeguro("Kleber", "Moledo", "04/14/1983", "Brazil", "1423658", "Unemployed");
	}

	@When("preencher dados do produto")
	public void preencher_dados_do_produto() {
		truck.dadosProduto("12/12/2022", "5.000.000,00", "Bonus 3", "Full Coverage", "No");
	}

	@When("selecionar opcao pagamento")
	public void selecionar_opcao_pagamento() {
		truck.dadosPreco();
	}

	@When("envio a cotacao")
	public void envio_a_cotacao() {
		truck.enviarCotacao("testeaccenture@test.com", "Test2", "Tesstt@121", "Tesstt@121",
				"Teste accenture finalizado com sucesso");

	}

	@Then("valido a mensagem de envio de e-mail com sucesso")
	public void valido_a_mensagem_de_envio_de_e_mail_com_sucesso() {
		metodos.validarTexto(elementos.getSendEmail(), "Sending e-mail success!");
		metodos.fecharNavegador();

	}

}
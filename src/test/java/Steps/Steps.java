package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String url) throws Throwable {
		m.executarNavegador(url, "Abrindo navegador");
	}

	@Given("^selecine o botao abra sua conta$")
	public void selecine_o_botao_abra_sua_conta() throws Throwable {
		m.click(e.getBtnAbrirConta(), "Selecionando o botao abra sua conta");
	}

	@When("^o usuario preencher o formulario$")
	public void o_usuario_preencher_o_formulario() throws Throwable {
		m.preencher(e.getCampoNome(), "teste teste", "Preenchendo campo nome");
		m.preencher(e.getCampoCelular(), "11111111111", "Preenchendo campo celular");
		m.preencher(e.getCampoEmail(), "teste@tste.com.br", "Preenchendo campo email");
		m.preencher(e.getCampoCPF(), "16222849091", "Preenchendo campo CPF");
		m.preencher(e.getCampoDataNascimento(), "03021976", "Preenchendo campo data de nascimento");
		 m.pausa(2000, "Pausa para carregar botao autorizo termos");
		m.click(e.getBtnAutorizoTermos(), "Selecionando botao autorizo termos");

	}

	@When("^selecionar o botao autorizo termos$")
	public void selecionar_o_botao_autorizo_os_termos_politicos() throws Throwable {
		m.click(e.getBtnAutorizoTermos(), "Selecionar botao autorizo termos");
	}

	@When("^selecionar o botao contianuar $")
	public void selecionar_o_botao_quero_abra_sua_conta() throws Throwable {
		m.click(e.getBtnContinuar(), "Selecionando botao continuar para abrir conta");
	}

	@Then("^valido o texto prontinho recebemos seus dados$")
	public void valido_o_texto_prontinho_recebemos_seus_dados() throws Throwable {

	}

}

package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.cssSelector(
			"#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)");
	private By campoNome = By.id("nome");
	private By campoCelular = By.id("celular");
	private By campoEmail = By.id("email");
	private By campoCPF = By.id("cpf");
	private By campoDataNascimento = By.id("dataNascimento");
	private By btnAutorizoTermos = By.cssSelector(
			"body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label");
	private By btnContinuar = By.cssSelector(
			"body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > div.d-none.d-md-block > button");
	private By textoProntinho = By.cssSelector(
			"body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center.sent > div > p");

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoCelular() {
		return campoCelular;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoCPF() {
		return campoCPF;
	}

	public By getCampoDataNascimento() {
		return campoDataNascimento;
	}

	public By getBtnAutorizoTermos() {
		return btnAutorizoTermos;
	}

	public By getBtnContinuar() {
		return btnContinuar;
	}

	public By getTextoProntinho() {
		return textoProntinho;
	}

}

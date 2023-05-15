package Elementos;

import org.openqa.selenium.By;

public class Elementos {

private By btnAbrasuaconta = By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)");
private By campoNome = By.id("nome");
private By campoTelefone = By.id("celular");
private By campoEmail = By.id("Email");
private By campoCpf = By.id("cpf");
private By campodataNascimento = By.id("dataNascimento");
private By checkbox = By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label");
private By btncontinuar = By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > div.d-none.d-md-block > button");
public By getBtnAbrasuaconta() {
	return btnAbrasuaconta;
}
public By getCampoNome() {
	return campoNome;
}
public By getCampoTelefone() {
	return campoTelefone;
}
public By getCampoEmail() {
	return campoEmail;
}
public By getCampoCpf() {
	return campoCpf;
}
public By getCampodataNascimento() {
	return campodataNascimento;
}
public By getCheckbox() {
	return checkbox;
}
public By getBtncontinuar() {
	return btncontinuar;
}

}

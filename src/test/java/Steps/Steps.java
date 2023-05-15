package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	Metodos a = new Metodos();
   	Elementos e = new Elementos ();
	
	@Given("^que acesse o banco inter \"([^\"]*)\"$")
	public void que_acesse_o_banco_inter(String url) throws Throwable {
	   a.abrirnavegador(url); 

	}

	@Given("^selecione o botao abra sua conta$")
	public void selecione_o_botao_abra_sua_conta() throws Throwable {
	 a.pausa(5000);
	 a.click(e.getBtnAbrasuaconta());  
	}

	@When("^preencher o formulario$")
	public void preencher_o_formulario() throws Throwable {
		a.pausa(5000);
	   a.preencher(e.getCampoNome(),"teste flash");
	   a.preencher(e.getCampoTelefone(), "11111111111");
	   a.preencher(e.getCampoEmail(), "teste@123.com.br");
	   a.preencher(e.getCampodataNascimento(), "10040220");
	   a.preencher(e.getCampoCpf(), "83719960048");
	   

	}

	@When("^selelecionar o botao checkebox$")
	public void selelecionar_o_botao_checkebox() throws Throwable {
	  a.click(e.getCheckbox());
	}

	@When("^selecionar o botao continuar$")
	public void selecionar_o_botao_continuar() throws Throwable {
	    a.click(e.getBtnAbrasuaconta());
	}

	@Then("^sera exibido o textgo falta pouco$")
	public void sera_exibido_o_textgo_falta_pouco() throws Throwable {
	    
	}


}

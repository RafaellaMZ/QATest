package tests;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Given("that is in {string}")
	public void that_is_in(String appUrl) {
		metodos.abrirNavegador(appUrl, "Abrindo o navegador");
	}

	@When("click on the buttons described one, two and four")
	public void click_on_the_buttons_described_one_two_and_four() {
		metodos.clicar(el.getButtonOne());
		metodos.clicar(el.getButtonTwo());
		metodos.clicar(el.getButtonLink());
	}

	@Then("validate their absence")
	public void validate_their_absence() {
		metodos.validarAusencia(el.getButtonOne());
		metodos.validarAusencia(el.getButtonTwo());
		metodos.validarAusencia(el.getButtonLink());
		metodos.fecharNavegador("Encerrando teste do cenário 1");
	}

	@When("click on buttons one, two and four on the panel")
	public void click_on_buttons_one_two_and_four_on_the_panel() throws InterruptedException {
		//Não é possível completar este teste no campo indicado, pois a linha de HTML se encontra duplicada
		
	}

	@Then("validate their absence again")
	public void validate_their_absence_again() {
		metodos.fecharNavegador("Encerrando teste do cenário 2");
	}

	@When("fill in YourFirstName field")
	public void fill_in_your_first_name_field() {
		metodos.escrever("Teste", el.getCampoFirst());

	}

	@When("click on the button called one")
	public void click_on_the_button_called_one() {
		metodos.clicar(el.getButtonOne());
	}

	@When("check the option OptionThree")
	public void check_the_option_option_three() {
		metodos.clicar(el.getCheckBox());
	}

	@When("select the option ExampleTwo inside the select box")
	public void select_the_option_example_two_inside_the_select_box() {
		metodos.clicar(el.getList());
		metodos.clicar(el.getExampleTwo());
	}

	@Then("validate the Selenium Webdriver s image")
	public void validate_the_selenium_webdriver_s_image() throws IOException {
		metodos.screenShot("Imagem do Selenium");
		metodos.fecharNavegador("Encerrando teste do cenário 3");
	}

}

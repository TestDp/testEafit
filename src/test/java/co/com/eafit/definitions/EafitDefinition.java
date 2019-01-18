package co.com.eafit.definitions;


import co.com.eafit.steps.EafitSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EafitDefinition {

	@Steps
	EafitSteps eafitSteps;
	
	@Given(value = "que Yeison quiere acceder a Metis")
	public void AccederMatis() throws Exception {
		eafitSteps.CargarUrl();
	}
	
	@When("en escribe el usuario \"([^\"]*)\" y la clave \"([^\"]*)\"$")
	public void enEscribeElUsuarioYLaClave(String usuario, String clave) throws Exception {
		
	}
	
	
	@Then("^el ve el mensaje de \"([^\"]*)\"$")
	public void elVeElMensajeDe(String tituloPantalla) throws Exception {
	
	}
}

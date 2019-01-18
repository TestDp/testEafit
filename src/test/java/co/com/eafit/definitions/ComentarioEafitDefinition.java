package co.com.eafit.definitions;

import co.com.eafit.steps.ComentarioEafitSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ComentarioEafitDefinition {
	
	@Steps
	ComentarioEafitSteps comentarioEafitSteps;
	
	@Given("^que Yeison quiere escribir un comentario a la Universidad EAFIT$")
	public void queYeisonQuiereEscribirUnComentarioALaUniversidadEAFIT() throws Exception {
		comentarioEafitSteps.AbrirUlr();
	}


	@When("^el envia el comentario$")
	public void elEnviaElComentario(DataTable dtTable) throws Exception {
		comentarioEafitSteps.diligenciarComentario(dtTable);
	}

	@Then("^el visualiza el pantalla el mensaje Muchas gracias por su comentario\\.$")
	public void elVisualizaElPantallaElMensajeMuchasGraciasPorSuComentario(String mensajeRespuesta) throws Exception {
		comentarioEafitSteps.visualizarMensajeExitoso(mensajeRespuesta);
	}
}

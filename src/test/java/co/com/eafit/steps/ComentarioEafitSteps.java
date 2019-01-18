package co.com.eafit.steps;

import co.com.eafit.pageobject.ComentarioEafitPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class ComentarioEafitSteps {

	ComentarioEafitPage comentarioEafitPage;
	
	@Step
	public void AbrirUlr() {
		comentarioEafitPage.open();		
	}

	@Step
	public void diligenciarComentario(DataTable dtTable) {
		comentarioEafitPage.ingresarDatosComentario(dtTable);	
	}
	
	
	@Step
	public void visualizarMensajeExitoso(String mensajeExitoso) {
		comentarioEafitPage.mensajeComentarioExitoso(mensajeExitoso);	
	}
	

}

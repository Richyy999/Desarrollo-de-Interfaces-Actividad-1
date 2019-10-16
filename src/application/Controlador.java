package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Pane;

public class Controlador {

	@FXML
	private Pane pan;

	@FXML
	public void setBlur() {
		pan.setEffect(new GaussianBlur(5));
	}

	@FXML
	public void cerrar() {
		System.exit(0);
	}
	
	@FXML
	public void quitarBlur() {
		pan.setEffect(null);
	}
}

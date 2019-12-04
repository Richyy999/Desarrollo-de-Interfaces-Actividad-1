package application;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controlador {
	/**
	 * Panel
	 */
	@FXML
	private Pane pan;

	/**
	 * Se ejecuta en la creacion de la vista y añade un efecto blur
	 */
	@FXML
	public void initialize() {
		pan.setEffect(new GaussianBlur(100));
	}

	/**
	 * Añade un blur de 5
	 */
	@FXML
	public void setBlur() {
		pan.setEffect(new GaussianBlur(5));
	}

	/**
	 * Cierra la aplicación
	 */
	@FXML
	public void cerrar() {
		System.exit(0);
	}

	/**
	 * Elimina el efecto blur
	 */
	@FXML
	public void quitarBlur() {
		pan.setEffect(null);
	}

	/**
	 * Cambia el color de fondo en ventana de forma aleatoria
	 */
	@FXML
	public void cambiarColor() {
		int color = (int) (Math.random() * 10);
		switch (color) {
		case 0:
			pan.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 1:
			pan.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 2:
			pan.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 3:
			pan.setBackground(new Background(new BackgroundFill(Color.HONEYDEW, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 4:
			pan.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 5:
			pan.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 6:
			pan.setBackground(new Background(new BackgroundFill(Color.BEIGE, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 7:
			pan.setBackground(new Background(new BackgroundFill(Color.BLUEVIOLET, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 8:
			pan.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 9:
			pan.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		default:
			break;
		}
	}
}

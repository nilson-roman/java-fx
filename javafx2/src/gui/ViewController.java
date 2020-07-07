package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

	// usar a notação @FXML para criar um atributo
	// correspondente a controle da tela
	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		System.out.println("Click");
	}
}

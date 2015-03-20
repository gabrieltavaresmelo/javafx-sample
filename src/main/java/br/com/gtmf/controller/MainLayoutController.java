package br.com.gtmf.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainLayoutController {

	// Widgets
    @FXML 
    private TextField tf_input;
	
	/**
	 * Inicializa a classe controller. 
	 * Eh chamado automaticamente depois do fxml ter sido carregado 
	 */
	@FXML
	private void initialize() {
		System.out.println("Carrega dados Iniciais");
	}

	
	// ---------------------------------------------------
	// -- 
	// -- 	Metodos dos Eventos dos componentes da tela
	// --
	// ---------------------------------------------------

	
	@FXML
	private void handleExit() {
		finish();
	}
	
	@FXML
	public void handleOk() {
		String input = tf_input.getText();
		
		System.out.println("Valor: " + input);
	}


	/**
	 * Encerra a aplicacao
	 */
	public void finish() {		
		System.exit(0);
	}
	
}
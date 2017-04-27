package br.com.SistemaVendas.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class menuADM {
	
	public void init() throws Exception{
		Scene tela = new Scene(FXMLLoader.load(getClass().getResource("telaPrincipal.fxml")));
		Stage primaryStage = new Stage();
		primaryStage.setScene(tela);
		primaryStage.setTitle("Novo Funcionário");
		primaryStage.show();
	}

}

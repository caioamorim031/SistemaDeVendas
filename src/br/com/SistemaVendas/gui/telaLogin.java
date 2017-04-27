package br.com.SistemaVendas.gui;

import br.com.SistemaVendas.controller.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class telaLogin extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		ArquivoController init = new ArquivoController();
		init.init();
    	primaryStage.initStyle(StageStyle.UNDECORATED);
		Scene tela = new Scene(FXMLLoader.load(getClass().getResource("/br/com/SistemaVendas/controller/TelaLogin.fxml")));
		primaryStage.setScene(tela);
		primaryStage.setTitle("Sistema de Vendas");
		Image icon = new Image(getClass().getResourceAsStream("/img/logo.png"));
		primaryStage.getIcons().add(icon);
		primaryStage.show();
	}

}

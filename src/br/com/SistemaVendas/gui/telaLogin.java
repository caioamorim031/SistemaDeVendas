package br.com.SistemaVendas.gui;

import br.com.SistemaVendas.controller.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class telaLogin extends Application {
	
	ControllerVendedor controllerVen = new ControllerVendedor();
	ArquivoController init = new ArquivoController();
	
	
    @FXML
    private Button OK;
    
    @FXML
    private Button quit;

    @FXML
    private TextField username;
    
    @FXML
    private PasswordField senha; 

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
    	primaryStage.initStyle(StageStyle.UNDECORATED);
		Scene tela = new Scene(FXMLLoader.load(getClass().getResource("TelaLogin.fxml")));
		primaryStage.setScene(tela);
		primaryStage.setTitle("Sistema de Vendas");
		Image icon = new Image(getClass().getResourceAsStream("/img/logo.png"));
		primaryStage.getIcons().add(icon);
		primaryStage.show();
		init.init();
	}
	
	@FXML
	void login(ActionEvent evento) throws Exception{
		if(controllerVen.valirdarLogin(username.getText(), senha.getText()) == true){
			menuADM tela = new menuADM();
			tela.init();
		}
		else{
			/*tratar caso login não seja executado*/
			System.out.println("ERRO");
		}
	}
	
	 @FXML
	   void setLimit(ActionEvent evento){
	   		if(username.getText().length()>6){
	   			username.setText(username.getText().substring(0, 6));
	   		}
	    }
	    
	   @FXML
	    void closeProgram(ActionEvent evento){
	    	Runtime.getRuntime().exit(0);
	    }

}

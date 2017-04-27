package br.com.SistemaVendas.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class loginController {


    @FXML
    private Button OK;
    
    @FXML
    private Button quit;

    @FXML
    private TextField username;

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
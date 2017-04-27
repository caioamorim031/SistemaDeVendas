package br.com.SistemaVendas.controller;

import br.com.SistemaVendas.model.Vendedor;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ControllerVendedor {

	Vendedor funcionario = new Vendedor();
	
	@FXML
	private TextField nome;
	
	@FXML
	private TextField sobrenome;
	
	@FXML
	private TextField endereco;
	
	@FXML
	private TextField salario;
	
	@FXML
	private TextField login;
	
	@FXML
	private PasswordField senha;
	
	@FXML
	private RadioButton admin;
	
	@FXML
	private Button addBtn;
	
}

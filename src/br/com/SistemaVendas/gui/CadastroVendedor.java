package br.com.SistemaVendas.gui;

import br.com.SistemaVendas.controller.ControllerVendedor;
import br.com.SistemaVendas.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class CadastroVendedor {
	
	Vendedor vend = new Vendedor();
	ControllerVendedor contVende = new ControllerVendedor();
	
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

	void aposClick(ActionEvent evento){
		
		String salarioString = salario.getText();
		double salario = Double.parseDouble(salarioString);
		
		vend.setNome(nome.getText());
		vend.setEndereco(endereco.getText());
		vend.setSalarioM(salario);
		
		if(admin.isSelected()){
			vend.setTipo(1);
			contVende.novoFuncionario(vend);
		}
		else{
			vend.setTipo(0);
			contVende.novoFuncionario(vend);
		}
		
	}
}

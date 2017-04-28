package br.com.SistemaVendas.gui;

import br.com.SistemaVendas.controller.ControllerVendedor;
import br.com.SistemaVendas.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastroVendedor {
	
	Vendedor vend = new Vendedor();
	private ControllerVendedor contVende = new ControllerVendedor();
	Stage primaryStage = new Stage();
	
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
	
	@FXML
	void aposClick(ActionEvent evento){
		String salarioString = salario.getText();
		double salario = Double.parseDouble(salarioString);
		
		vend.setNome(nome.getText());
		vend.setEndereco(endereco.getText());
		vend.setSalarioM(salario);
		vend.setNomeUsuario(login.getText());
		vend.setSenha(senha.getText());
		
		if(admin.isSelected()){
			vend.setTipo(1);
			if(contVende.novoFuncionario(vend)==true){
				primaryStage.close();
				System.out.println("GRAVADO");
			}else{
				//USUARIO JÁ EXISTE
				System.out.println("ERRO");
			}
		}
		else{
			vend.setTipo(0);
			if(contVende.novoFuncionario(vend)==true){
				primaryStage.close();
				System.out.println("GRAVADO");
			}else{
				//USUARIO JÁ EXISTE
				System.out.println("ERRO");
			}
		}
	}
	public void init() throws Exception{
		Scene tela = new Scene(FXMLLoader.load(getClass().getResource("addVendedor.fxml")));
		primaryStage.setScene(tela);
		primaryStage.setTitle("Novo Funcionário");
		primaryStage.show();
	}
}

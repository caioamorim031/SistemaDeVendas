package br.com.SistemaVendas.controller;

<<<<<<< HEAD
import java.util.ArrayList;
import br.com.SistemaVendas.model.Vendedor;

public class ControllerVendedor {
	
	ArrayList<Vendedor> vendedores;
	
	public ControllerVendedor(){
		vendedores = new ArrayList<Vendedor>();
	}
	
	public void novoFuncionario(Vendedor vend){
		if(vendedores.contains(vend)==false){
			vendedores.add(vend);
		}
		else
			System.out.println("Funcionáio já cadastrado.");
	}
	
	public void removerVendedor(String nomeVendedor){
		for(int i = 0;i<vendedores.size();i++){
			if(vendedores.get(i).getNomeUsuario().equalsIgnoreCase(nomeVendedor)){
				vendedores.remove(i);
				return;
			}
		}
		System.out.println("Vendedor Não Encontrado!");
	}

=======
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
	
>>>>>>> origin/master
}

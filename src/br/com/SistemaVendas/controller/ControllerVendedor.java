package br.com.SistemaVendas.controller;

import java.util.ArrayList;
import br.com.SistemaVendas.model.Vendedor;
import br.com.SistemaVendas.model.Vendedor;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ControllerVendedor {

	Vendedor funcionario = new Vendedor();
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

	public boolean valirdarLogin(String userName,String senha){
		for(int i = 0;i<vendedores.size();i++){
			if(vendedores.get(i).getNomeUsuario().equals(userName)){
				if(vendedores.get(i).getSenha().equals(senha)){
					return true;
				}
				else
					return false;
			}
		}
		return false;
	}

}
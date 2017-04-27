package br.com.SistemaVendas.controller;

import java.util.ArrayList;
import br.com.SistemaVendas.model.Vendedor;

public class ControllerVendedor {

	Vendedor funcionario = new Vendedor();
	ArrayList<Vendedor> vendedores;	
	
	public ControllerVendedor(){
		vendedores = new ArrayList<Vendedor>();
	}
	
	public boolean novoFuncionario(Vendedor vend){
		if(vendedores.contains(vend)==false){
			vendedores.add(vend);
			System.out.println("GRAVADO");
			return true;
		}
		else
			return false;
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
				else return false;
			}
		}
		return false;
	}

}
package br.com.SistemaVendas.controller;

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

}

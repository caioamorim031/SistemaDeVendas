package br.com.SistemaVendas.controller;

import br.com.SistemaVendas.repositorio.RepositorioVendedor;

import java.util.ArrayList;
import br.com.SistemaVendas.model.Vendedor;

public class ControllerVendedor {

	RepositorioVendedor repositorio = new RepositorioVendedor();
	
	Vendedor funcionario = new Vendedor();
	static ArrayList<Vendedor> vendedores= new ArrayList<Vendedor>();
	
	public boolean novoFuncionario(Vendedor vend){
		if(vendedores.contains(vend)==false){
			vendedores.add(vend);
			return true;
		}
		else
			return false;
	}
	
	public boolean removerVendedor(String nomeVendedor){
		for(int i = 0;i<vendedores.size();i++){
			if(vendedores.get(i).getNomeUsuario().equalsIgnoreCase(nomeVendedor)){
				vendedores.remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean valirdarLogin(String userName,String senha){
		System.out.println(vendedores.size());
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

	public Vendedor returnVendedor(String Username){
		for(int i = 0;i<vendedores.size();i++){
			if(vendedores.get(i).getNomeUsuario().equals(Username))
				return vendedores.get(i);
		}
		return null;
	}
	
	public boolean validarUserName(String userName){
		for(int i = 0;i<vendedores.size();i++){
			if(vendedores.get(i).getNomeUsuario().equals(userName)==true){
				return true;
			}
		}
		return false;
	}
	public void salvar(){
		for(int i=0;i<vendedores.size();i++){
			Vendedor tmp = vendedores.get(i);
			repositorio.salvarDados(tmp, tmp.getNome());
		}
	}
	public void lerVendedores(){
		try {
			vendedores = repositorio.lerDados(vendedores);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
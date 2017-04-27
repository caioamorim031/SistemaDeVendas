package br.com.SistemaVendas.controller;

import java.util.ArrayList;
import br.com.SistemaVendas.model.Usuario;

public class ControllerUsuario {
	
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void novoUsuario(Usuario usu){
		if(usuarios.contains(usu)==true){
			System.out.println("USUÁRIO JÁ CADASTRADO.");
		}
		else{
			usuarios.add(usu);
		}
	}
	
	/*implementar o remover*/

}

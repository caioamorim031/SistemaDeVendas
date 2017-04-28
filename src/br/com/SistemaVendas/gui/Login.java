package br.com.SistemaVendas.gui;

import java.io.IOException;
import java.util.Scanner;
import br.com.SistemaVendas.controller.ArquivoController;
import br.com.SistemaVendas.controller.ControllerVendedor;
import br.com.SistemaVendas.model.Vendedor;

public class Login {

	public static void main(String[] args) throws IOException {
		
		inicializarSistema();
	}
	
	static void inicializarSistema() throws IOException{
		ArquivoController arquivo = new ArquivoController();
		if(arquivo.init()==true){
			solicitarInformacao();
		}
		else
			showlogin();
		
	}
	
	public static void solicitarInformacao(){
		Scanner leitor = new Scanner(System.in);
		Vendedor vendedor = new Vendedor();
		ControllerVendedor controller = new ControllerVendedor();
		String aux;
		
		System.out.print("Arquivo Criado");
		System.out.println("\tSolicitação de Primeiro usuario");
		
		System.out.print("Entre com o nome: ");
		vendedor.setNome(leitor.nextLine());
		
		System.out.print("\nEndereço: ");
		vendedor.setEndereco(leitor.nextLine());
		
		System.out.print("\nSalário: ");
		vendedor.setSalarioM(leitor.nextDouble());
		
		System.out.print("\nUserName: ");
		vendedor.setNomeUsuario(leitor.next());
		
		System.out.print("\nSenha: ");
		vendedor.setSenha(leitor.next());
		
		System.out.print("Administrador? S/N - ");
		aux = leitor.next();
		aux = aux.toLowerCase();
		while(aux!="s" || aux!="n"){
				System.out.print("\nEntre com uma informação válida. S/N - ");
				aux = leitor.next();
				aux = aux.toLowerCase();
		}
		if(aux == "s")
			vendedor.setTipo(1);
		else
			vendedor.setTipo(0);
		controller.novoFuncionario(vendedor);
	}

	public static void showlogin(){
		Scanner leitor = new Scanner(System.in);
		ControllerVendedor controller = new ControllerVendedor();
		MenuPrincipal menu = new MenuPrincipal();
		String username,senha;
		boolean retorno;
		
		System.out.println("\tLOGIN");
		System.out.print("UserName: ");
		username = leitor.next();
		
		System.out.print("\nSenha: ");
		senha = leitor.next();
		
		do{
			retorno =controller.valirdarLogin(username, senha); 
			if(retorno==true){
				menu.menuFuncionario(controller.returnVendedor(username));
			}
			else
				System.out.println("UserName e/ou Senha não conferem.");
		}while(retorno==false);
		
	}
}

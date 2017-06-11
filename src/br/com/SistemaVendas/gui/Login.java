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
		showlogin();
	}
	
	public static void solicitarInformacao() throws IOException{
		Scanner leitor = new Scanner(System.in);
		Vendedor vendedor = new Vendedor();
		ControllerVendedor controller = new ControllerVendedor();
		char aux;

		System.out.print("Entre com o nome: ");
		vendedor.setNome(leitor.nextLine());
		
		System.out.print("Endereço: ");
		vendedor.setEndereco(leitor.nextLine());
		
		System.out.print("Salário: ");
		vendedor.setSalarioM(leitor.nextDouble());
		
		System.out.print("UserName: ");
		vendedor.setNomeUsuario(leitor.next());
		if(controller.validarUserName(vendedor.getNomeUsuario())==true){
			System.out.println("NOME DE USUÁRIO JÁ CADASTRADO!\n\n\n\n\n");
		}
		else{
			System.out.print("Senha: ");
			vendedor.setSenha(leitor.next());
			
			System.out.print("Administrador? S/N - ");
			aux = (char)System.in.read();
			while(aux!='s' && aux!='S' && aux!='n' && aux!='N'){
				System.out.print("Insira uma opção válida! S/N -  ");
				aux = (char)System.in.read();
			}
			if(aux == 's' || aux == 'S'){
				vendedor.setTipo(1);
			}
			else
				vendedor.setTipo(0);
			
			if(controller.novoFuncionario(vendedor)==true){
				System.out.println("\t\tCADASTRO REALIZADO!\n\n\n\n\n");
			}
			
			else{
				System.out.println("\t\tCADASTRO NÃO REALIZADO!\n\n\n\n\n");
			}
		}
	}

	public static void showlogin() throws IOException{
		Scanner leitor = new Scanner(System.in);
		ControllerVendedor controller = new ControllerVendedor();
		MenuPrincipal menu = new MenuPrincipal();
		String username,senha;
		boolean retorno;
		
		do{
			System.out.println("\tLOGIN");
			System.out.print("UserName: ");
			username = leitor.next();
			
			System.out.print("Senha: ");
			senha = leitor.next();
			
			retorno =controller.valirdarLogin(username, senha); 
			if(retorno==true){
				menu.menuFuncionario(controller.returnVendedor(username));
			}
			else
				System.out.println("UserName e/ou Senha não conferem.");
		}while(retorno==false);
		
	}
}

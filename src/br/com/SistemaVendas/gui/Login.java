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
		
		System.out.print("Arquivo Criado\n");
		System.out.println("\tSolicita��o de Primeiro usuario");
		
		System.out.print("Entre com o nome: ");
		vendedor.setNome(leitor.nextLine());
		
		System.out.print("\nEndere�o: ");
		vendedor.setEndereco(leitor.nextLine());
		
		System.out.print("\nSal�rio: ");
		vendedor.setSalarioM(leitor.nextDouble());
		
		System.out.print("\nUserName: ");
		vendedor.setNomeUsuario(leitor.next());
		
		System.out.print("\nSenha: ");
		vendedor.setSenha(leitor.next());
		
		System.out.print("Administrador? S/N - ");
		aux = (char)System.in.read();
		while(aux!='s' && aux!='S' && aux!='n' && aux!='N'){
			System.out.print("Insira uma op��o v�lida! S/N -  ");
			aux = (char)System.in.read();
		}
		if(aux == 's' || aux == 'S'){
			vendedor.setTipo(1);
		}
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
		
		do{
			System.out.println("\tLOGIN");
			System.out.print("UserName: ");
			username = leitor.next();
			
			System.out.print("\nSenha: ");
			senha = leitor.next();
			
			retorno =controller.valirdarLogin(username, senha); 
			if(retorno==true){
				menu.menuFuncionario(controller.returnVendedor(username));
			}
			else
				System.out.println("UserName e/ou Senha n�o conferem.");
		}while(retorno==false);
		
	}
}

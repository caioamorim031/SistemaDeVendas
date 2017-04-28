package br.com.SistemaVendas.gui;

import java.util.Scanner;

import br.com.SistemaVendas.model.Vendedor;

public class MenuPrincipal {
	
	public void menuFuncionario(Vendedor vend){
		Scanner leitor = new Scanner(System.in);
		int op;
		do{
			if(vend.getTipo()==1){
				System.out.println("1 - Novo Funcionario");
				System.out.println("2 - Novo Produto");
				System.out.println("3 - Remover Funcionario");
			}
			System.out.println("4 - Novo Pedido");
			System.out.println("5 - Detalhes do Estoque");
			System.out.println("6 - Listar Pedidos em aberto");
			System.out.println("7 - Sair");
			op = leitor.nextInt();
			
		}while(op!=7);
	}
	
}

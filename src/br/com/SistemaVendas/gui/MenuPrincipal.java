package br.com.SistemaVendas.gui;

import java.util.Scanner;

import br.com.SistemaVendas.model.Vendedor;

public class MenuPrincipal {
	private Scanner leitor = new Scanner(System.in);
	
	public void menuFuncionario(Vendedor vend){
		
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
			if(vend.getTipo()==1){
				checkValor(1, 7, op);
			}else checkValor(4, 7, op);
		}while(op!=7);
	}
	
	private void checkValor(int min, int max, int valorDigitado){
		while(valorDigitado > max || valorDigitado < min){
			System.out.println("Digite novamente: ");
			valorDigitado = leitor.nextInt();
		}
	}
}

package br.com.SistemaVendas.gui;

import java.io.IOException;
import java.util.Scanner;
import br.com.SistemaVendas.controller.ControllerProduto;
import br.com.SistemaVendas.controller.ControllerVendedor;
import br.com.SistemaVendas.model.ItemPedido;
import br.com.SistemaVendas.model.Pedido;
import br.com.SistemaVendas.model.Produto;
import br.com.SistemaVendas.model.Vendedor;

public class MenuPrincipal {
	private Scanner leitor = new Scanner(System.in);
	
	public void menuFuncionario(Vendedor vend) throws IOException{
		Login login = new Login();
		String userName;
		ControllerVendedor controllerVendedor = new ControllerVendedor();
		ControllerProduto controllerProduto = new ControllerProduto();
		Scanner leitor = new Scanner(System.in);
		int op;
		do{
			if(vend.getTipo()==1){
				System.out.println("MENU DO FUNCIONÁRIO\n");
				System.out.println("1 - Novo Funcionario");
				System.out.println("2 - Novo Produto");
				System.out.println("3 - Remover Funcionario");
			}
			System.out.println("4 - Novo Pedido");
			System.out.println("5 - Detalhes do Estoque");
			System.out.println("6 - Listar Pedidos");
			System.out.println("7 - Sair");
			op = leitor.nextInt();
			
			if(vend.getTipo()==1){
				checkValor(1, 7, op);
			}
			else 
				checkValor(4, 7, op);
			
			switch(op){
			case 1:
				login.solicitarInformacao();
				break;
			case 2:
				dadosProduto();
				break;
			case 3:
				System.out.print("Entre com o UserName do Funcionario: ");
				userName = leitor.next();
				if(vend.getNomeUsuario().equals(userName)==true){
					System.out.println("FAÇA LOGOFF PARA EXCLUIR SUA CONTA\n\n\n\n");
				}
				else{
					if(controllerVendedor.removerVendedor(userName)!=true)
						System.out.println("VENDEDOR NÃO ENCONTRADO!\n\n\n\n\n");
					else
						System.out.println("VENDEDOR REMOVIDO\n\n\n\n\n");
				}
				break;
			case 4:
				dadosPedido(vend);
				break;
			case 5:
				controllerProduto.listarTodos();
				break;
			case 6:
				break;
			case 7:
				controllerVendedor.salvar();
				break;
				default:
					break;
			}
		}while(op!=7);
	}
	
	private void checkValor(int min, int max, int valorDigitado){
		while(valorDigitado > max || valorDigitado < min){
			System.out.println("Digite novamente: ");
			valorDigitado = leitor.nextInt();
		}
	}
		
	private void dadosProduto(){
		ControllerProduto controllerproduto = new ControllerProduto();
		Produto produto = new Produto();
		Scanner leitor = new Scanner(System.in);
		
		produto.setCodProduto(controllerproduto.sizeProdutos()+1);
		
		System.out.print("Nome: ");
		produto.setNome(leitor.nextLine());
		
		System.out.println("Preço: ");
		produto.setPreco(leitor.nextFloat());
		leitor.nextLine();
		
		System.out.println("Descrição: ");
		produto.setDescricao(leitor.nextLine());
		
		System.out.println("Quantidade em Estoque: ");
		produto.setQtdEstoque(leitor.nextInt());
		
		controllerproduto.novoProduto(produto);
	}

	private void dadosPedido(Vendedor vend){
		int auxPedido,op,controle = 0;
		ControllerProduto produto = new ControllerProduto();
		ItemPedido itemPedido = new ItemPedido();
		Pedido pedido = new Pedido(vend);
		double aux=0;
		
		do{
			System.out.println("\t\tNOVO PEDIDO\n");
			System.out.println("Codigo do produto: ");
			auxPedido = leitor.nextInt();
			while(produto.pesquisarCod(auxPedido)==false){
				System.out.println("Verifique o Código informado: ");
				auxPedido = leitor.nextInt();
			}
			itemPedido.setCodProduto(auxPedido);
			System.out.println("Quantidade:");
			itemPedido.setQtd(leitor.nextInt());
			itemPedido.setUnitario(produto.valorUnitario(auxPedido));
			itemPedido.setTotal(itemPedido.getQtd()*itemPedido.getUnitario());
			pedido.setItemPedido(itemPedido, controle);
			controle++;
			aux = aux + itemPedido.getTotal();
			
			System.out.println("Adicionar mais Produtos? 1 - Sim/ 2 - Não: ");
			op = leitor.nextInt();
			while(op!= 1 && op != 2){
				System.out.println("Entre com uma opção válida: ");
				op = leitor.nextInt();
			}
		}while(op!=2);
		pedido.setValorPedido(aux);
	}
	
}

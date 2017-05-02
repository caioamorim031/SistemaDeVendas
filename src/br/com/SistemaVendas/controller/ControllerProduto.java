package br.com.SistemaVendas.controller;

import java.util.ArrayList;
import br.com.SistemaVendas.model.Produto;

public class ControllerProduto {
	
	static ArrayList<Produto> produtos;
	
	public ControllerProduto(){
		produtos = new ArrayList<Produto>();
	}
	
	public void novoProduto(Produto pro){
		produtos.add(pro);
	}
	
	public void removerProduto(Produto Pro){
		if(produtos.contains(Pro)==true){
			produtos.remove(Pro);
			System.out.println("PRODUTO REMOVIDO");
		}
		else{
			System.out.println("Produto não encontrado. Verificar nome informado");
		}
	}
	
	public void dadosProduto(String nomeProduto){
		for(int i = 0;i<produtos.size();i++){
			if(produtos.get(i).getNome().equalsIgnoreCase(nomeProduto) == true){
				produtos.get(i).toString();
				return;
			}
		}
		System.out.println("PRODUTO NÃO ENCONTRADO!");
	}
	
	public void listarTodos(){
		if(produtos.size()==0){
			System.out.println("NÃO EXISTEM PRODUTOS CADASTRADOS!");
		}
		else{
			System.out.println("RELATÓRIO DE PRODUTOS EM ESTOQUE");
			for(int i = 0;i<produtos.size();i++){
				System.out.println((i+1)+" - " + produtos.get(i).getNome() + " - Estoque: " + produtos.get(i).getQtdEstoque());
			}
			System.out.println("\n\n\n\n\n");
		}
	}
	
	public int sizeProdutos(){
		return produtos.size();
	}

	public boolean pesquisarCod(int auxProduto){
		for(int i = 0;i<produtos.size();i++){
			if(produtos.get(i).getCodProduto()==auxProduto)
				return true;
		}
		return false;
	}
	
	public double valorUnitario(int auxProduto){
		for(int i = 0;i<produtos.size();i++){
			if(produtos.get(i).getCodProduto()==auxProduto)
				return produtos.get(i).getPreco();
		}
		return -1;
	}
	
}

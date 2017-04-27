package br.com.SistemaVendas.controller;

import java.util.ArrayList;
import br.com.SistemaVendas.model.Produto;

public class ControllerProduto {
	
	ArrayList<Produto> produtos;
	
	public ControllerProduto(){
		produtos = new ArrayList<Produto>();
	}
	
	public void novoProduto(Produto pro){
		if(produtos.contains(pro)){
			System.out.println("PRODUTO JÁ CADASTRADO.");
		}
		else{
			produtos.add(pro);
		}
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
		for(int i = 0; i<produtos.size();i++){
			produtos.get(i).toString();
		}
	}
	
}

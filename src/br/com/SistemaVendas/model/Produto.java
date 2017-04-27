package br.com.SistemaVendas.model;

public class Produto {
	
	private String nome;
	private String descricao;
	private double preco;
	private int qtdEstoque;
	
	public String toString(){
		return "Nome do Produto: " + this.getNome() + 
				"\nPreço: " + this.getPreco() + "\tQuantidade em estoque: " + this.getQtdEstoque()+
				"\nDescrição: " + this.getDescricao();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

}

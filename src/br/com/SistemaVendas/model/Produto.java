package br.com.SistemaVendas.model;

public class Produto {
	
	private int codProduto;
	private String nome;
	private String descricao;
	private float preco;
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
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	
}

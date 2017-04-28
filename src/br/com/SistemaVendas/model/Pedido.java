package br.com.SistemaVendas.model;

public class Pedido {
	
	private int codPedido;
	private Produto produto;
	private Vendedor vendedor;
	private double valorFinal;
	
	public int getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
}

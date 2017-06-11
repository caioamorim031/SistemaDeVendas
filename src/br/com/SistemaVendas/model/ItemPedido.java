package br.com.SistemaVendas.model;

import java.io.Serializable;

public class ItemPedido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int codProduto;
	private double total;
	private int qtd;

	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
}

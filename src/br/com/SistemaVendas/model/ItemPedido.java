package br.com.SistemaVendas.model;

public class ItemPedido {
	
	private int codProduto;
	private double unitario;
	private double total;
	private int qtd;
	
	
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public double getUnitario() {
		return unitario;
	}
	public void setUnitario(double unitario) {
		this.unitario = unitario;
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

package br.com.SistemaVendas.model;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	
	private Vendedor vendedor;
	private Date dataPedido;
	private ArrayList<ItemPedido> produtos = new ArrayList<ItemPedido>();
	private double valorPedido;
	
	public Pedido(Vendedor vend){
		this.setVendedor(vend);
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public ArrayList<ItemPedido> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<ItemPedido> produtos) {
		this.produtos = produtos;
	}
	public double getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}
	
	public void setItemPedido(ItemPedido item,int posicao){
		this.produtos.set(posicao, item);
	}
	
	public ItemPedido getItemPedido(int posicao){
		return this.produtos.get(posicao);
	}

}

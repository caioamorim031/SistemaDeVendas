package br.com.SistemaVendas.controller;

import java.util.ArrayList;
import br.com.SistemaVendas.model.ItemPedido;
import br.com.SistemaVendas.model.Pedido;

public class ControllerPedido {
	
	static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	public void novoPedido(Pedido pedido){
		pedidos.add(pedido);
	}
	
	public void novoItemPedido(ItemPedido item){
		/*terminar método*/
	}
}

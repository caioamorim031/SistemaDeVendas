package br.com.SistemaVendas.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import br.com.SistemaVendas.model.ItemPedido;
import br.com.SistemaVendas.model.Pedido;
import br.com.SistemaVendas.repositorio.RepositorioPedido;

public class ControllerPedido {
	
	static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	RepositorioPedido repositorio = new RepositorioPedido();
	
	public void novoPedido(Pedido pedido){
		pedidos.add(pedido);
	}
	
	public void novoItemPedido(ItemPedido item){
		/*terminar método*/
	}
	public void salvar(){
		for(int i=0;i<pedidos.size();i++){
			Pedido tmp = pedidos.get(i);
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			String data = df.format(tmp.getDataPedido());
			//repositorio.salvarDados(tmp, data);
		}
	}
	public void lerPedidos(){
		try {
			//repositorio.lerDados(pedidos);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

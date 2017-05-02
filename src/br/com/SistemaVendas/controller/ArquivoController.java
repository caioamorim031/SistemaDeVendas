package br.com.SistemaVendas.controller;

import java.io.File;
import java.io.IOException;

public class ArquivoController {
	private File arqVend = new File("Vendedores");
	private File arqProd = new File("Produtos");
	private File arqPedidos = new File("Pedidos");
	public boolean init() throws IOException{
		if(!arqVend.exists()){
			arqVend.mkdirs();
			arqProd.mkdirs();
			arqPedidos.mkdirs();
			return true;
		}else{
			ControllerVendedor control = new ControllerVendedor();
			ControllerProduto controlP = new ControllerProduto();
			ControllerPedido controlPed = new ControllerPedido();
			control.lerVendedores();
			controlP.lerProdutos();
			controlPed.lerPedidos();
			return false;	
		}
	}
}

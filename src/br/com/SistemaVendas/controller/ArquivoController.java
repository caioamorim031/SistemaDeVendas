package br.com.SistemaVendas.controller;

import java.io.File;
import java.io.IOException;

public class ArquivoController {
	private File arq = new File("Vendedores");
	public boolean init() throws IOException{
		if(!arq.exists()){
			arq.mkdirs();
			return true;
		}else{
			ControllerVendedor control = new ControllerVendedor();
			control.lerVendedores();
			return false;	
		}
		
	}
}

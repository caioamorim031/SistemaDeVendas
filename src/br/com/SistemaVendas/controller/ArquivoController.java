package br.com.SistemaVendas.controller;

import java.io.File;
import java.io.IOException;

import br.com.SistemaVendas.gui.CadastroVendedor;

public class ArquivoController {

	CadastroVendedor cad = new CadastroVendedor();
	private File arq = new File("BD.txt");
	
	public void init() throws Exception{
		if(!arq.exists()){
			try {
				arq.createNewFile();
				cad.init();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

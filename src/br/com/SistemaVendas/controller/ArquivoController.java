package br.com.SistemaVendas.controller;

import java.io.File;
import java.io.IOException;

public class ArquivoController {

	private File arq = new File("BD.txt");
	
	public void init(){
		if(!arq.exists()){
			try {
				arq.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

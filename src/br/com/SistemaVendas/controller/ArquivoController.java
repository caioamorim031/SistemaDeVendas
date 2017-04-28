package br.com.SistemaVendas.controller;

import java.io.File;
import java.io.IOException;

public class ArquivoController {

	private File arq = new File("BD.bin");
	public boolean init() throws IOException{
		if(!arq.exists()){
			arq.createNewFile();
			return true;
		}
		return false;
	}
}

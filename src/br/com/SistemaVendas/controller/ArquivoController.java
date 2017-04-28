package br.com.SistemaVendas.controller;

import java.io.File;
import java.io.IOException;

import br.com.SistemaVendas.gui.CadastroVendedor;

public class ArquivoController {

<<<<<<< HEAD
	private File arq = new File("BD.bin");
	public boolean init() throws IOException{
		if(!arq.exists()){
			arq.createNewFile();
			return true;
=======
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
>>>>>>> origin/master
		}
		return false;
	}
}

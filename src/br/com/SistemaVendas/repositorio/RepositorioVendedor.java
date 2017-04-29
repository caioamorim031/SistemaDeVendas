package br.com.SistemaVendas.repositorio;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.SistemaVendas.model.Vendedor;

public class RepositorioVendedor {
	
	private ObjectOutputStream arquivo;

	void salvarDados(ArrayList<Vendedor> vendedores){
			try {
				arquivo = new ObjectOutputStream(new FileOutputStream("RepositorioVendedores.txt"));
				arquivo.writeObject(vendedores);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
   public ArrayList<Vendedor> lerDados(ArrayList<Vendedor> vendedores){
	   
	   ObjectInputStream arquivo;
	   
	try {
		arquivo = new ObjectInputStream(new FileInputStream("RepositorioVendedores.txt"));
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return vendedores;
}
}

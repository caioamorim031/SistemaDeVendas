package br.com.SistemaVendas.repositorio;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import br.com.SistemaVendas.model.Vendedor;

public class RepositorioVendedor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private ObjectOutputStream arquivo;
	private Vendedor tmp;
	private File diretorio = new File("C:/Users/Caio/Documents/GitHub/SistemaDeVendas/Vendedores/");

	public void salvarDados(Vendedor vendedor, String nomeVendedor){
					try {
						arquivo = new ObjectOutputStream((new FileOutputStream("C:/Users/Caio/Documents/GitHub/SistemaDeVendas/Vendedores/" + (nomeVendedor + ".txt"))));
						arquivo.writeObject(vendedor);
						arquivo.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}			
	}
   public ArrayList<Vendedor> lerDados(ArrayList<Vendedor> vendedores) throws ClassNotFoundException{
	   File arquivos[] = diretorio.listFiles();
	   ObjectInputStream arquivo;
	try {
		for(int i=0; i<arquivos.length;i++){
			File tmpArq = arquivos[i];
			System.out.println(arquivos[i].getName());
			
			    arquivo = new ObjectInputStream(new FileInputStream(tmpArq));
				tmp = (Vendedor) arquivo.readObject();
				System.out.println(tmp.getSenha());
				vendedores.add(tmp);
				arquivo.close();
			
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return vendedores;
}
}

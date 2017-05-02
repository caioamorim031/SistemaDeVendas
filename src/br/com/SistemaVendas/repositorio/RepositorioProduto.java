package br.com.SistemaVendas.repositorio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import br.com.SistemaVendas.model.Produto;

public class RepositorioProduto implements Serializable {

	private static final long serialVersionUID = 1L;
	private ObjectOutputStream arquivo;

	private File diretorio = new File("C:/Users/Caio/Documents/GitHub/SistemaDeVendas/Produtos/");

	public void salvarDados(Produto produto, String nomeProduto) {
		try {
			arquivo = new ObjectOutputStream(new FileOutputStream("C:/Users/Caio/Documents/GitHub/SistemaDeVendas/Produtos/" + (nomeProduto + ".bin")));
			arquivo.writeObject(produto);
			arquivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void lerDados(ArrayList<Produto> produtos) throws ClassNotFoundException {
		File arquivos[] = diretorio.listFiles();
		ObjectInputStream arquivo;
		try {
			for (int i = 0; i < arquivos.length; i++) {
				Produto tmp = new Produto();
				System.out.println(arquivos[i].getName());
				File tmpArq = arquivos[i];
				arquivo = new ObjectInputStream(new FileInputStream(tmpArq));
				tmp = (Produto) arquivo.readObject();
				produtos.add(tmp);
				arquivo.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

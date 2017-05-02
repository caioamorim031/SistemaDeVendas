package br.com.SistemaVendas.repositorio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import br.com.SistemaVendas.model.Pedido;

public class RepositorioPedido implements Serializable {

	private static final long serialVersionUID = 1L;
	private ObjectOutputStream arquivo;

	private File diretorio = new File("C:/Users/Caio/Documents/GitHub/SistemaDeVendas/Pedidos/");

	public void salvarDados(Pedido pedido, String dataPedido) {
		try {
			arquivo = new ObjectOutputStream(new FileOutputStream("C:/Users/Caio/Documents/GitHub/SistemaDeVendas/Pedidos/" + (dataPedido + ".bin")));
			arquivo.writeObject(pedido);
			arquivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void lerDados(ArrayList<Pedido> pedidos) throws ClassNotFoundException {
		File arquivos[] = diretorio.listFiles();
		ObjectInputStream arquivo;
		try {
			for (int i = 0; i < arquivos.length; i++) {
				Pedido tmp;
				File tmpArq = arquivos[i];
				arquivo = new ObjectInputStream(new FileInputStream(tmpArq));
				tmp = (Pedido) arquivo.readObject();
				pedidos.add(tmp);
				arquivo.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

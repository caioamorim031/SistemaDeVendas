package br.com.SistemaVendas.repositorio;

import br.com.SistemaVendas.model.Vendedor;

public interface IRepositorioVendedor {

	public void novoVendedor(Vendedor Vend);
	public Vendedor seekVendedor(String nome);
	
}

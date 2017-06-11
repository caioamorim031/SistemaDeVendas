package br.com.SistemaVendas.model;

import java.io.Serializable;

public class Vendedor extends Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String endereco;
	private double salarioM;
	private int tipo;

 	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getSalarioM() {
		return salarioM;
	}
	public void setSalarioM(double salarioM) {
		this.salarioM = salarioM;
	}
}

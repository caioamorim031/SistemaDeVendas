package br.com.SistemaVendas.model;

public class Vendedor extends Usuario {

	private String nome;
	private String endereco;
	private double salarioM;
	
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

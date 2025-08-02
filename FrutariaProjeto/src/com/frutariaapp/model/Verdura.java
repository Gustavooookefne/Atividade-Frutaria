package com.frutariaapp.model;

public class Verdura extends Produto {
	
	private String tipo;
	
	public Verdura () {
		super();
		this.tipo = "";
	}
	
	public Verdura (String nome, double preco, int quantidade, String tipo) {
		super(nome, preco, quantidade);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void mostrarDados() {
		dados();
		System.out.println("Tipo de verdura" + tipo);
	}
	
	@Override
	public String toString() {
		return "Nome" + nome + "Preço" + preco + "Quantidade" + quantidade + "Tipo" + tipo;
	}

}

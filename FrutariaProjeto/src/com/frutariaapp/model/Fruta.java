package com.frutariaapp.model;

public class Fruta extends Produto {
	
	private double peso;
	
	public Fruta () {
		super();
		double peso = 0.0;
	}
	
	public Fruta (String nome, double preco, int quantidade, double peso) {
		super(nome, preco, quantidade);
		this.peso = peso;
	}
		
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void mostrarDados() {
		dados();
		System.out.println("Peso da Fruta: " + peso);
	}

	
    @Override
    public String toString() {
        return super.toString() + " | Peso: " + peso;
    }

	public void setNome(Produto cadastroProduto) {
		// TODO Auto-generated method stub
		
	}
    
}
package com.frutariaapp;

import com.frutariaapp.view.Atendente;
import com.frutariaapp.service.Estoque;

public class FrutariaApp {

	public static void main(String[] args) {
		
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		int opcaoMenu = 0;
		
		do {
			opcaoMenu = atendente.menuPrincipal();
			estoque.GerenciarEstoque(opcaoMenu, atendente);
		}while(opcaoMenu != 0);
		
		atendente.encerrarPrograma();
	
	}

}

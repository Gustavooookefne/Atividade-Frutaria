package com.frutariaapp.view;

import java.util.Scanner;
import com.frutariaapp.model.*;  

public class Atendente {

    private Scanner input;
    
    public Atendente() {
        input = new Scanner(System.in);
    }
    
  
    public int menuPrincipal() {
        System.out.println("=========================");
        System.out.println("        Frutaria         ");
        System.out.println("=========================");
        System.out.println("1- Cadastrar Produto");
        System.out.println("2- Listar Produto");
        System.out.println("3- Excluir Produto");
        System.out.println("0- Sair");
        System.out.println("=========================");
        
        int opcao = input.nextInt();
        input.nextLine();  
        
        return opcao;
    }
    
    public int subMenu() {
    	System.out.println("=========================");
        System.out.println("        Frutaria         ");
        System.out.println("=========================");
        System.out.println("1 - Cadastrar Frutas");
        System.out.println("2 - Cadastrar Verduras");
        System.out.println("3 - Sair");
        System.out.println("=========================");
        
        int opcaoEscolhas = input.nextInt();
        input.nextLine();
        	
        	return opcaoEscolhas;
        }
    
    // PARTE DE CADASTRAR PRODUTOS //
  
    public String cadastroProduto() {
    System.out.println("Nome: ");
    String produto = input.next();

        return produto;
    }
    
    public double cadastrarPreco() {
    	System.out.println("Preco: ");
    	double preco = input.nextDouble();
    	
    	return preco;
    }
    
    public int cadastrarQuantidade() {
    	System.out.println("Quantidade: ");
    	int quantidade = input.nextInt();
    	
		return quantidade;


    }
    
    public double cadastrarPeso() {
    	System.out.println("Peso: ");
    	double peso = input.nextDouble();
    	
    	return peso;
    }
    
    public String cadastrarTipo() {
    	System.out.println("");
    	String tipo = input.next();
    	
    	return tipo;
    }
    
    public void listarFrutas(Fruta fruta) {
    	System.out.println("+-----------------------+");
    	System.out.println("Nome: " + fruta.getNome());
    	System.out.println("Quantidade: " + fruta.getQuantidade() );
    	System.out.println("Preço: " + fruta.getPreco());
    	System.out.println("Peso: " + fruta.getPeso());
    	System.out.println("+-----------------------+");
    
    }
    
    public void listarVerduras(Verdura verdura) {
    	System.out.println("+-----------------------+");
    	System.out.println("Nome: " + verdura.getNome());
    	System.out.println("Quantidade" + verdura.getQuantidade());
    	System.out.println("Preço" + verdura.getPreco());
    	System.out.println("Tipo: " + verdura.getTipo());
    	System.out.println("+-----------------------+");
    }
    
    public String removerProduto() {
        System.out.println("Digite o nome do produto que você deseja remover: ");
        return input.nextLine();
    }

    
    public void visualizarProdutoRemovido(String nome) {
        System.out.println("O produto " + nome + " foi removido.");
    }

 
    public void mensagemNaoEncontrada() {
        System.out.println("Produto não encontrado.");
    }

    
    public void encerrarPrograma() {
        System.out.println("Encerrando o Programa...");
    }

    
    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }


	public int submenuListagem() {
		// TODO Auto-generated method stub
		return 0;
	}
}

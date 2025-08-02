package com.frutariaapp.service;

import java.util.List;
import java.util.ArrayList;

import com.frutariaapp.view.Atendente;
import com.frutariaapp.model.Produto;
import com.frutariaapp.model.Fruta;
import com.frutariaapp.model.Verdura;

public class Estoque {
    
    private List<Produto>listaProduto;
    
    public Estoque() {
        listaProduto = new ArrayList<>();
    }
    
    public void GerenciarEstoque(int opcaoMenu, Atendente atendente) {
        switch(opcaoMenu) {
        case 1 -> {
            int opcaoProduto = atendente.subMenu();
            
            if(opcaoProduto == 1) {
                Fruta fruta = new Fruta();
                fruta.setNome(atendente.cadastroProduto());
                fruta.setPreco(atendente.cadastrarPreco());
                fruta.setQuantidade(atendente.cadastrarQuantidade());
                fruta.setPeso(atendente.cadastrarPeso());
                listaProduto.add(fruta);
            } else if (opcaoProduto == 2) {
                Verdura verdura = new Verdura();
                verdura.setNome(atendente.cadastroProduto());
                verdura.setPreco(atendente.cadastrarPreco());
                verdura.setQuantidade(atendente.cadastrarQuantidade());
                verdura.setTipo(atendente.cadastrarTipo());
                listaProduto.add(verdura);
            }
            
            break;
        }
        
        
        case 2 -> {
            int opcaoListagem = atendente.submenuListagem();

            switch (opcaoListagem) {
                case 1:
                    for (Produto produtoFruta : listaProduto) {
                        if (produtoFruta instanceof Fruta) { 
                            atendente.listarFrutas((Fruta) produtoFruta);
                        }
                    }
                    break;

                case 2: 
                    for (Produto produtoVerdura : listaProduto) {
                        if (produtoVerdura instanceof Verdura) { 
                            atendente.listarVerduras((Verdura) produtoVerdura); 
                        }
                    }
                    break;

                case 3: 
                    if (listaProduto.isEmpty()) {
                        System.out.println("Não há produtos cadastrados.");
                    } else {
                        for (Produto produtoGeral : listaProduto) {
                            if (produtoGeral instanceof Fruta) {
                                atendente.listarFrutas((Fruta) produtoGeral); 
                            } else if (produtoGeral instanceof Verdura) {
                                atendente.listarVerduras((Verdura) produtoGeral);
                            }
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            break;
        }
           
        case 3 -> {
            String nome = atendente.removerProduto();
            boolean removido = false;
            
            for(int indice = 0; indice < listaProduto.size(); indice++ ) {
                if(listaProduto.get(indice).getNome().equalsIgnoreCase(nome)) {
                    listaProduto.remove(indice);
                    removido = true;
                    break;
                }
            }
                
            if(removido) {
                atendente.visualizarProdutoRemovido(nome);
            } else {
                atendente.mensagemNaoEncontrada();
            }
        }
        
        default -> {
            opcaoMenu = atendente.menuPrincipal();
        }
    }    
}
    
     public List<Produto> getListaProduto() {
            return listaProduto;

     }
}
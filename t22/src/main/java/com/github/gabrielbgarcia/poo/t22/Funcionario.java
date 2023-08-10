package com.github.gabrielbgarcia.poo.t22;

import java.util.Set;
import java.util.HashSet;

public class Funcionario {
    private Escala escalas;
    private Set<Venda> vendas;

    public Funcionario(){
        this.vendas = new HashSet<Venda>();
    }

    public void realizarVenda(){
        this.vendas.add(new Venda());
        System.out.println("eu")
    }
}

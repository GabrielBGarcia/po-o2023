package com.github.GabrielBGarcia.poo.t19.Ponto;

public class Ponto {
    private Cor cor;
    private Ponto ponto;

    public Ponto(){
        this.cor = new Cor();
        this.ponto = new Ponto();
    }

    public Cor retornarCor(){
        return this.cor;
    }
        public Ponto retornarPonto(){
        return this.ponto;
    }
}

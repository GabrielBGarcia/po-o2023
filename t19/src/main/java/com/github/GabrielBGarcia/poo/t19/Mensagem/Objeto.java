package com.github.GabrielBGarcia.poo.t19.mensagem;

public class Objeto {
    
    public void printarMensagemDeObjeto(Objeto novoObjeto){
        novoObjeto.printarMensagemDeObjeto2(novoObjeto);
    }
    
    public void printarMensagem(){
    }

    public void printarMensagemDeObjeto2(Objeto novoObjeto){
        novoObjeto.printarMensagem();
    }
}

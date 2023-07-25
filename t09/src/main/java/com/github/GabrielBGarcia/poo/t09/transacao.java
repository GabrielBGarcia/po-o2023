package java.com.github.GabrielBGarcia.poo.t09;

class Cliente{
    private Transacao[] transacoes;
}

class Transacao{
    private Cliente cliente;
    private Fornecedor fornecedor; 
}

class Fornecedor{
    private Transacao[] transacoes;
}


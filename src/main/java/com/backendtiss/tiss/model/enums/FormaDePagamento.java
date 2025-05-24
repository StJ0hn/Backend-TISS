package com.backendtiss.tiss.model.enums;

import lombok.Getter;

@Getter
public enum FormaDePagamento {
    DINHEIRO(1),
    CHEQUE(2),
    CARTAO_CREDITO(3),
    CARTAO_DEBITO(4),
    TRANSFERENCIA_BANCARIA(5),
    BOLETO_BANCARIO(6),
    OUTROS(7);

    private final int codigo;

    FormaDePagamento(int codigo) {
        this.codigo = codigo;
    }
}

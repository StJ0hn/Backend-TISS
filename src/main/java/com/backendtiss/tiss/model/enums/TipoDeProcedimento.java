package com.backendtiss.tiss.model.enums;

import lombok.Getter;

@Getter
public enum TipoDeProcedimento {
    PROCEDIMENTO_PRINCIPAL(1),
    PROCEDIMENTO_COMPLEMENTAR(2),
    PROCEDIMENTO_APOIO(3),
    PROCEDIMENTO_DIAGNOSTICO(4),
    PROCEDIMENTO_TERAPEUTICO(5),
    OUTROS(6);

    private final int codigo;

    TipoDeProcedimento(int codigo) {
        this.codigo = codigo;
    }
}

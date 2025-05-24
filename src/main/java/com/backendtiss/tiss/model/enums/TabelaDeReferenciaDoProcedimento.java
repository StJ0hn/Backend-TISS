package com.backendtiss.tiss.model.enums;

import lombok.Getter;

@Getter
public enum TabelaDeReferenciaDoProcedimento {
    TABELA_PROPRIA_OPERADORAS("00"),
    TUSS("22"),
    TABELA_PROPRIA_PACOTES_OPERADORAS_90("90"),
    TABELA_PROPRIA_PACOTES_OPERADORAS_98("98");

    private final String codigo;

    TabelaDeReferenciaDoProcedimento(String codigo) {
        this.codigo = codigo;
    }
}

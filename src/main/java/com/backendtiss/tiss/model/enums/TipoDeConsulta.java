package com.backendtiss.tiss.model.enums;

import lombok.Getter;

@Getter
public enum TipoDeConsulta {
    PRIMEIRA_CONSULTA(1),
    CONSULTA_REVISAO(2),
    CONSULTA_ACOMPANHAMENTO(3);

    private final int codigo;

    TipoDeConsulta(int codigo) {
        this.codigo = codigo;
    }
}

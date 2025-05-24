package com.backendtiss.tiss.model.enums;

import lombok.Getter;

@Getter
public enum CausaDaOcorrencia {
    ACIDENTE_TRABALHO(1),
    ACIDENTE_TRANSITO(2),
    OUTROS_ACIDENTES(3),
    OUTRAS_CAUSAS(9);

    private final int codigo;

    CausaDaOcorrencia(int codigo) {
        this.codigo = codigo;
    }
}

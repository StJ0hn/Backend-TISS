package com.backendtiss.tiss.model.enums;

import lombok.Getter;

@Getter
public enum TipoDaInternacao {
    CLINICA(1),
    CIRURGICA(2),
    OBSTETRICA(3),
    PEDIATRICA(4),
    PSIQUIATRICA(5);

    private final int codigo;

    TipoDaInternacao(int codigo) {
        this.codigo = codigo;
    }
}

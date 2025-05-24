package com.backendtiss.tiss.model.enums;

import lombok.Getter;

@Getter
public enum RegimeDaInternacao {
    HOSPITALAR(1),
    HOSPITAL_DIA(2),
    DOMICILIAR(3),
    INTERNACAO_PSIQUIATRICA(4);

    private final int codigo;

    RegimeDaInternacao(int codigo) {
        this.codigo = codigo;
    }
}

package com.backendtiss.tiss.model.enums;

import lombok.Getter;

@Getter
public enum Categoria {
    CONSULTA(1),
    EXAME(2),
    PROCEDIMENTO_CIRURGICO(3),
    INTERNACAO(4),
    TERAPIA(5),
    OUTROS(6);

    private final int codigo;

    Categoria(int codigo) {
        this.codigo = codigo;
    }
}

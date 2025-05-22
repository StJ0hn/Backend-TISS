package com.backendtiss.tiss.model.enums;

public enum Teste {
    John(1),
    Pedro(2),
    Ricardo(3);

    private final int pessoa;

    Teste(int pessoa) {
        this.pessoa = pessoa;
    }

    public int getPessoa() {
        return pessoa;
    }
}

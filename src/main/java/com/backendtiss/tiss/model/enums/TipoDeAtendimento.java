package com.backendtiss.tiss.model.enums;

import lombok.Getter;

@Getter
public enum TipoDeAtendimento {
    URGENCIA_EMERGENCIA(1),
    ELETIVO(2),
    ACOMPANHAMENTO(3),
    REVISAO(4),
    CONSULTA(5),
    TERAPIA(6),
    DIAGNOSTICO(7),
    PROCEDIMENTO_CIRURGICO(8),
    INTERNACAO(9),
    ALTA_COMPLEXIDADE(10),
    MEDIA_COMPLEXIDADE(11),
    BAIXA_COMPLEXIDADE(12),
    PROMOCAO_SAUDE(13),
    PREVENCAO_DOENCAS(14),
    REABILITACAO(15),
    CUIDADOS_PALIATIVOS(16),
    SAUDE_MENTAL(17),
    DOMICILIAR(18),
    HOSPITAL_DIA(19),
    AMBULATORIAL(20);

    private final int codigo;

    TipoDeAtendimento(int codigo) {
        this.codigo = codigo;
    }
}

package com.backendtiss.tiss.model.dtos.SpESadtDTOs;

import com.backendtiss.tiss.model.enums.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpESadtResponseDTO {
    private UUID id;
    private String registroAns;
    private String numeroDaGuia;
    private String numeroDaCarteiraDoPlano;
    private String nomeDoBeneficiario;
    private Boolean indicadorDeAtendimentoARecemNascido;
    private String indicacaoClinica;
    private String codigoDoProcedimento;
    private String descricao;
    private String motivoDeCancelamento;
    private Integer quantidadesDeProcedimentosAutorizados;
    private Integer gastosExtrasComMedicos;
    private Integer gastosExtrasComFarmacos;
    private Integer valorTotalGeralDoProcedimento;
    private TipoDeAtendimento tipoDeAtendimento;
    private CausaDaOcorrencia causaDaOcorrencia;
    private TipoDeConsulta tipoDeConsulta;
    private TabelaDeReferenciaDoProcedimento tabelaDeReferenciaDoProcedimento;
    private Boolean casoEmergencia;
    private LocalDate dataDeRealizacaoDoProcedimento;
    private LocalDate dataDaSolicitacao;
    private LocalTime horarioFinalDaEmergencia;
    private LocalTime horarioInicialDaEmergencia;
    private UUID pacienteId;
    private UUID medicoId;
    private UUID convenioId;
}
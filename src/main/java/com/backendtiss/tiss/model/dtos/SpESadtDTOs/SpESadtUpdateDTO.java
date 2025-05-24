package com.backendtiss.tiss.model.dtos.SpESadtDTOs;

import com.backendtiss.tiss.model.enums.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.util.UUID;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpESadtUpdateDTO {
    @NotNull @Size(min = 6, max = 6)
    private String registroAns;
    @NotNull @Size(max = 20)
    private String numeroDaGuia;
    @NotNull @Size(max = 20)
    private String numeroDaCarteiraDoPlano;
    @NotNull @Size(max = 70)
    private String nomeDoBeneficiario;
    @NotNull
    private Boolean indicadorDeAtendimentoARecemNascido;
    @Size(max = 500)
    private String indicacaoClinica;
    @Size(max = 10)
    private String codigoDoProcedimento;
    @Size(max = 150)
    private String descricao;
    private String motivoDeCancelamento;
    @Positive
    private Integer quantidadesDeProcedimentosAutorizados;
    @PositiveOrZero
    private Integer gastosExtrasComMedicos;
    @PositiveOrZero
    private Integer gastosExtrasComFarmacos;
    @PositiveOrZero
    private Integer valorTotalGeralDoProcedimento;
    @NotNull
    private TipoDeAtendimento tipoDeAtendimento;
    @NotNull
    private CausaDaOcorrencia causaDaOcorrencia;
    @NotNull
    private TipoDeConsulta tipoDeConsulta;
    @NotNull
    private TabelaDeReferenciaDoProcedimento tabelaDeReferenciaDoProcedimento;
    private Boolean casoEmergencia;
    private LocalDate dataDeRealizacaoDoProcedimento;
    private LocalDate dataDaSolicitacao;
    private LocalTime horarioFinalDaEmergencia;
    private LocalTime horarioInicialDaEmergencia;
    @NotNull
    private UUID pacienteId;
    @NotNull
    private UUID medicoId;
    @NotNull
    private UUID convenioId;
}

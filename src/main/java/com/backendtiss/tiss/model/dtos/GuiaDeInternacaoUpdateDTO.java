package com.backendtiss.tiss.model.dtos;

import com.backendtiss.tiss.model.enums.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GuiaDeInternacaoUpdateDTO {
    @NotNull @Size(min = 6, max = 6)
    private String registroAns;
    @NotNull @Size(max = 20)
    private String numeroGuia;
    @NotNull
    private LocalDate dataDeAutorizacao;
    @NotNull @Size(max = 20)
    private String numeroDaCarteiraDoPlano;
    @NotNull @Size(max = 14)
    private String codigoOperadora;
    @NotNull @Size(max = 70)
    private String nomeDoProfissionalSolicitante;
    @NotNull @Size(max = 15)
    private String numeroConselho;
    @NotNull @Size(max = 2)
    private String ufConselho;
    @NotNull @Size(max = 6)
    private String cboS;
    @NotNull @Size(max = 14)
    private String cnpjInstituicao;
    @NotNull @Size(max = 70)
    private String nomeInstituicao;
    @NotNull
    private LocalDate dataInternacao;
    @NotNull
    private String motivoDoAtendimento;
    @NotNull
    private RegimeDaInternacao regimeDaInternacao;
    @NotNull @Positive
    private Integer quantidadeDeDiariasSolicitadas;
    @NotNull
    private TipoDaInternacao tipoDaInternacao;
    @NotNull
    private String indicacaoClinicaAInternacao;
    @Size(max = 10)
    private String codigoDoProcedimento;
    @Size(max = 150)
    private String descricaoProcedimento;
    @Positive
    private Integer quantidadeDoProcedimento;
    @Positive
    private Integer quantidadeProcedimentosLiberados;
    private LocalDate dataDeSolicitacao;
    private Boolean assinaturaResponsavelBeneficiario;
    private Boolean assinaturaDoResponsavelPelaAutorizacao;
    private Boolean assinaturaDoProfissionalSolicitante;
    private Boolean recemNascido;
    @NotNull
    private UUID pacienteId;
    @NotNull
    private UUID medicoId;
    @NotNull
    private UUID convenioId;
}

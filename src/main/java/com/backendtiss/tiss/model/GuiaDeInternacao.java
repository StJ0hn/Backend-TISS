package com.backendtiss.tiss.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;
import java.time.LocalDate;

@Entity
@Table(name = "guia_de_internacao")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GuiaDeInternacao {
    @Id
    private UUID id;
    @Column(nullable = false, length = 6)
    private String registroAns;
    @Column(nullable = false, unique = true, length = 20)
    private String numeroGuia;
    @Column(nullable = false)
    private LocalDate dataDeAutorizacao;
    @Column(nullable = false, length = 20)
    private String numeroDaCarteiraDoPlano;
    @Column(nullable = false, length = 14)
    private String codigoOperadora;
    @Column(nullable = false, length = 70)
    private String nomeDoProfissionalSolicitante;
    @Column(nullable = false, length = 15)
    private String numeroConselho;
    @Column(nullable = false, length = 2)
    private String ufConselho;
    @Column(nullable = false, length = 6)
    private String cboS;
    @Column(nullable = false, length = 14)
    private String cnpjInstituicao;
    @Column(nullable = false, length = 70)
    private String nomeInstituicao;
    @Column(nullable = false)
    private LocalDate dataInternacao;
    @Column(nullable = false)
    private String motivoDoAtendimento;
    @Column(nullable = false)
    private String regimeDaInternacao;
    @Column(nullable = false)
    private Integer quantidadeDeDiariasSolicitadas;
    @Column(nullable = false)
    private String tipoDaInternacao;
    @Column(nullable = false)
    private String indicacaoClinicaAInternacao;
    private String codigoDoProcedimento;
    private String descricaoProcedimento;
    private Integer quantidadeDoProcedimento;
    private Integer quantidadeProcedimentosLiberados;
    private LocalDate dataDeSolicitacao;
    private Boolean assinaturaResponsavelBeneficiario;
    private Boolean assinaturaDoResponsavelPelaAutorizacao;
    private Boolean assinaturaDoProfissionalSolicitante;
    private Boolean recemNascido;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Medico medico;
    @ManyToOne
    @JoinColumn(nullable = false)
    private CadastroDoConvenio convenio;
}
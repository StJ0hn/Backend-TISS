package com.backendtiss.tiss.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "sp_e_sadt")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpESadt {
    @Id
    private UUID id;
    @Column(nullable = false, length = 6)
    private String registroAns;
    @Column(nullable = false, unique = true, length = 20)
    private String numeroDaGuia;
    @Column(nullable = false, length = 20)
    private String numeroDaCarteiraDoPlano;
    @Column(nullable = false, length = 70)
    private String nomeDoBeneficiario;
    @Column(nullable = false)
    private Boolean indicadorDeAtendimentoARecemNascido;
    private LocalDate dataDaSolicitação;
    @Column(length = 500)
    private String indicacaoClinica;
    private String tabelaDeReferenciaDoProcedimento;
    private String codigoDoProcedimento;
    private String descricao;
    private Integer quantidadesDeProcedimentosAutorizados;
    private String tipoDeAtendimento;
    private String causaDaOcorrencia;
    private String tipoDeConsulta;
    private String motivoDeCancelamento;
    private LocalDate dataDeRealizacaoDoProcedimento;
    private Boolean casoEmergencia;
    private LocalTime horarioInicialDaEmergencia;
    private LocalTime horarioFinalDaEmergencia;
    private Integer gastosExtrasComMedicos;
    private Integer gastosExtrasComFarmacos;
    private Integer valorTotalGeralDoProcedimento;
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

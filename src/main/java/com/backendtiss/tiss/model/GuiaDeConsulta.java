package com.backendtiss.tiss.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "guia_de_consulta")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GuiaDeConsulta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 14)
    private String registroDaClinica;

    @Column(nullable = false, unique = true)
    private Long numeroDaGuia;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Medico medico;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Convenio convenio;
}
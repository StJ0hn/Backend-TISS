package com.backendtiss.tiss.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;
import java.time.LocalDate;

@Entity
@Table(name = "medico")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(nullable = false, length = 70)
    private String nomeCompleto;

    @Column(nullable = false)
    private LocalDate dataDeNascimento;

    @Column(nullable = false, unique = true, length = 9)
    private String crm;

    @Column(nullable = false, length = 2)
    private String estado;

    @Column(length = 255)
    private String documentoComFoto;

    @Column(nullable = false, length = 6)
    private String cboS;

    @Column(nullable = false, unique = true)
    private String email;
}
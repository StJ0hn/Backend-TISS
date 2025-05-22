package com.backendtiss.tiss.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;
import java.time.LocalDate;

@Entity
@Table(name = "paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Paciente {
    @Id
    private UUID id;
    @Column(nullable = false, unique = true, length = 14)
    private String cpf;
    @Column(nullable = false, length = 70)
    private String nomeCompleto;
    @Column(nullable = false)
    private LocalDate dataDeNascimento;
    @Column(nullable = false, length = 15)
    private String numeroDeTelefone;
    @Lob
    private String documentoComFoto;
    private String nomeSocial;
    private String email;
}
package com.backendtiss.tiss.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "cadastro_do_convenio")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CadastroDoConvenio {
    @Id
    private UUID id;
    @Column(nullable = false, unique = true, length = 14)
    private String cnpjClinica;
    @Column(nullable = false, length = 70)
    private String nomePlanoDeSaude;
    @Column(nullable = false, unique = true, length = 7)
    private String numeroCnes;
}
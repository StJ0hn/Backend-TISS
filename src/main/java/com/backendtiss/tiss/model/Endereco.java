package com.backendtiss.tiss.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "endereco")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Endereco {
    @Id
    private UUID id;
    @Column(nullable = false, length = 9)
    private String cep;
    @Column(nullable = false, length = 70)
    private String rua;
    @Column(nullable = false)
    private Integer numeroDaResidencia;
    @Column(length = 60)
    private String complemento;
}
package com.backendtiss.tiss.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Endereco {
    @Column(nullable = false, length = 9)
    private String cep;

    @Column(nullable = false, length = 70)
    private String rua;

    @Column(nullable = false)
    private Integer numeroDaResidencia;

    @Column(length = 60)
    private String complemento;
}
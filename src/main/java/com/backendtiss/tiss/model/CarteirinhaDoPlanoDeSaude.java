package com.backendtiss.tiss.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class CarteirinhaDoPlanoDeSaude {
    @Column(nullable = false, unique = true, length = 20)
    private String numero;

    @Column(nullable = false)
    private LocalDate dataDeValidade;

    @Column(nullable = false)
    private LocalDate dataDeAdesao;
}
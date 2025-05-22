package com.backendtiss.tiss.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;
import java.time.LocalDate;

@Entity
@Table(name = "carteirinha_do_plano_de_saude")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarteirinhaDoPlanoDeSaude {
    @Id
    private UUID id;
    @Column(nullable = false, unique = true, length = 20)
    private String numero;
    @Column(nullable = false)
    private LocalDate dataDeValidade;
    @Column(nullable = false)
    private LocalDate dataDeAdesao;
}
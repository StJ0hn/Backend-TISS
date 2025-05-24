package com.backendtiss.tiss.model.dtos;

import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicoUpdateDTO {
    @NotNull @Size(max = 14)
    private String cpf;
    @NotNull @Size(max = 70)
    private String nomeCompleto;
    @NotNull
    private LocalDate dataDeNascimento;
    @NotNull @Size(max = 15)
    private String crm;
    @NotNull @Size(max = 2)
    private String estado;
    private String documentoComFoto;
    @NotNull @Size(max = 6)
    private String cboS;
    private String email;
}

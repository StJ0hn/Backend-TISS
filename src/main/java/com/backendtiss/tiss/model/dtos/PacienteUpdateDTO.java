package com.backendtiss.tiss.model.dtos;

import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PacienteUpdateDTO {
    @NotNull @Size(max = 14)
    private String cpf;
    @NotNull @Size(max = 70)
    private String nomeCompleto;
    @NotNull
    private LocalDate dataDeNascimento;
    @NotNull @Size(max = 15)
    private String numeroDeTelefone;
    private String documentoComFoto;
    private String nomeSocial;
    private String email;
}

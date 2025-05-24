package com.backendtiss.tiss.model.dtos;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConvenioUpdateDTO {
    @NotNull @Size(max = 14)
    private String cnpjClinica;
    @NotNull @Size(max = 70)
    private String nomePlanoDeSaude;
    @NotNull @Size(max = 7)
    private String numeroCnes;
}

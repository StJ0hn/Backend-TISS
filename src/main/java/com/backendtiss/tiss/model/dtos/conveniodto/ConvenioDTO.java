package com.backendtiss.tiss.model.dtos.conveniodto;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ConvenioDTO {

    @Pattern(regexp = "^\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}$")
    private String cnpjClinica;

    @Size(max = 70)
    private String nomePlanoDeSaude;

    @Pattern(regexp = "^\\d{7}$")
    private String numeroCnes;
}

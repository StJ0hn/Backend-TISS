package com.backendtiss.tiss.model.dtos.enderecoDTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EnderecoDTO {

    @NotNull
    @Pattern(regexp = "^\\d{5}-\\d{3}$", message = "CEP deve estar no formato 00000-000")
    private String cep;

    @NotNull
    @Size(min = 2, max = 70)
    private String rua;

    @NotNull
    @Min(value = 1, message = "Número da residência deve ser positivo")
    private Integer numeroDaResidencia;

    @Size(max = 60)
    private String complemento;
}

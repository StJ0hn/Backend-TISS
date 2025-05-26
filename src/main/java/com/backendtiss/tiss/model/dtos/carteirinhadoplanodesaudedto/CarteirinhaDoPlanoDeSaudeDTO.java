package com.backendtiss.tiss.model.dtos.carteirinhadoplanodesaudedto;

import jakarta.validation.constraints.NotNull;
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
public class CarteirinhaDoPlanoDeSaudeDTO {

    @NotNull
    @Size(min = 5, max = 20)
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "Número deve conter apenas letras e números")
    private String numero;

    @NotNull
    @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$", message = "Data deve estar no formato dd/MM/yyyy")
    private String dataDeValidade;

    @NotNull
    @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$", message = "Data deve estar no formato dd/MM/yyyy")
    private String dataDeAdesao;
}

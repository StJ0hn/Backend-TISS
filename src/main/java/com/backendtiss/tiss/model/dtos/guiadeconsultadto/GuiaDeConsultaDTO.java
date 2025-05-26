package com.backendtiss.tiss.model.dtos.guiadeconsultadto;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GuiaDeConsultaDTO {

    @Pattern(regexp = "^\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}$") // cnpj
    private String registroDaClinica;

    @NotNull
    private Long numeroDaGuia;

    @NotNull
    private UUID pacienteId;

    @NotNull
    private UUID medicoId;

    @NotNull
    private UUID convenioId;
}

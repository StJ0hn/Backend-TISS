package com.backendtiss.tiss.model.dtos;

import jakarta.validation.constraints.*;
import lombok.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GuiaDeConsultaUpdateDTO {
    @NotNull @Size(min = 14, max = 14)
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

package com.backendtiss.tiss.model.dtos.medicodto;

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
public class MedicoDTO {
    @Pattern(regexp = "^[A-Za-zÀ-ÖØ-öø-ÿ ]{2,70}$")
    private String nomeCompleto;

    @Pattern(regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$")
    private String cpf;

    @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$")
    private String dataDeNascimento; //TODO: validar data com localdate

    @Pattern(regexp = "^\\d{4,6}$")
    private String crm;

    @Pattern(regexp = "^(AC|AL|AP|AM|BA|CE|DF|ES|GO|MA|MT|MS|MG|PA|PB|PR|PE|PI|RJ|RN|RS|RO|RR|SC|SP|SE|TO)$")
    private String estado;

    @Pattern(regexp = "^\\d{6}$")
    private String cboS;

    @Size(max = 255)
    @Pattern(regexp = "^$|^(https?://).+$", message = "Deve ser uma URL válida ou vazio")
    private String documentoComFoto;
}

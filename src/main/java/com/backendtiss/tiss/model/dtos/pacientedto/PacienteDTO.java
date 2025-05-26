package com.backendtiss.tiss.model.dtos.pacientedto;

import com.backendtiss.tiss.model.dtos.carteirinhadoplanodesaudedto.CarteirinhaDoPlanoDeSaudeDTO;
import com.backendtiss.tiss.model.dtos.enderecoDTO.EnderecoDTO;
import jakarta.validation.constraints.Email;
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
public class PacienteDTO {
    @Pattern(regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$")
    private String cpf;

    @Pattern(regexp = "^[A-Za-zÀ-ÖØ-öø-ÿ ]{2,70}$")
    private String nomeCompleto;

    @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$")
    private String dataDeNascimento; //TODO: validar data com localdate

    @Pattern(regexp = "^\\d{10,11}$")
    private String numeroDeTelefone;

    @Size(max = 255)
    @Pattern(regexp = "^$|^(https?://).+$", message = "Deve ser uma URL válida ou vazio")
    private String documentoComFoto;

    @Size(max = 70)
    private String nomeSocial;

    @Email(message = "Email inválido")
    @Size(max = 100)
    private String email;

    private CarteirinhaDoPlanoDeSaudeDTO carteirinhaDoPlanoDeSaude;

    private EnderecoDTO endereco;
}

package com.backendtiss.tiss.service;

import com.backendtiss.tiss.model.Paciente;
import com.backendtiss.tiss.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public List<Paciente> getAll() {
        return pacienteRepository.findAll();
    }

    public Paciente getById(UUID id) {
        return pacienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado com ID: " + id));
    }

    public Paciente create(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    //TODO: refazer essa lógica, refqatorando em uma funcão e usando dto
    public Paciente update(UUID id, Paciente pacienteAtualizado) {
        Paciente paciente = getById(id);

        paciente.setCpf(pacienteAtualizado.getCpf());
        paciente.setNomeCompleto(pacienteAtualizado.getNomeCompleto());
        paciente.setDataDeNascimento(pacienteAtualizado.getDataDeNascimento());
        paciente.setNumeroDeTelefone(pacienteAtualizado.getNumeroDeTelefone());
        paciente.setDocumentoComFoto(pacienteAtualizado.getDocumentoComFoto());
        paciente.setNomeSocial(pacienteAtualizado.getNomeSocial());
        paciente.setEmail(pacienteAtualizado.getEmail());
        paciente.setCarteirinhaDoPlanoDeSaude(pacienteAtualizado.getCarteirinhaDoPlanoDeSaude());
        paciente.setEndereco(pacienteAtualizado.getEndereco());

        return pacienteRepository.save(paciente);
    }

    public void delete(UUID id) {
        Paciente paciente = getById(id);
        pacienteRepository.delete(paciente);
    }
}

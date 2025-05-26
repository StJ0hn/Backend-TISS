package com.backendtiss.tiss.service;

import com.backendtiss.tiss.model.Medico;
import com.backendtiss.tiss.repository.MedicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MedicoService {

    private final MedicoRepository medicoRepository;

    public List<Medico> getAll() {
        return medicoRepository.findAll();
    }

    public Medico getById(UUID id) {
        return medicoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Medico não encontrado com ID: " + id));
    }

    public Medico save(Medico medico) {
        return medicoRepository.save(medico);
    }


    //TODO: refazer essa lógica, refqatorando em uma funcão e usando dto
    public Medico update(UUID id, Medico medicoAtualizado) {
        Medico medico = getById(id);

        medico.setCpf(medicoAtualizado.getCpf());
        medico.setNomeCompleto(medicoAtualizado.getNomeCompleto());
        medico.setDataDeNascimento(medicoAtualizado.getDataDeNascimento());
        medico.setCrm(medicoAtualizado.getCrm());
        medico.setEstado(medicoAtualizado.getEstado());
        medico.setDocumentoComFoto(medicoAtualizado.getDocumentoComFoto());
        medico.setCboS(medicoAtualizado.getCboS());
        medico.setEmail(medicoAtualizado.getEmail());

        return medicoRepository.save(medico);
    }

    public void delete(UUID id) {
        Medico medico = getById(id);
        medicoRepository.delete(medico);
    }
}

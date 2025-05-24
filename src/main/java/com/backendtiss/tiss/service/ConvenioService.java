package com.backendtiss.tiss.service;

import com.backendtiss.tiss.exceptions.NotFoundException;
import com.backendtiss.tiss.model.Convenio;
import com.backendtiss.tiss.repository.ConvenioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ConvenioService {

    private final ConvenioRepository convenioRepository;

    @Transactional
    public Convenio create(Convenio convenio) {
        return convenioRepository.save(convenio);
    }

    public List<Convenio> getAll() {
        return convenioRepository.findAll();
    }

    public Convenio getById(UUID id) {
        return convenioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Convênio não encontrado com ID: " + id));
    }

    @Transactional
    public Convenio update(UUID id, Convenio updatedConvenio) {
        Convenio existingConvenio = convenioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Convênio não encontrado com ID: " + id));

        updateEntityFields(existingConvenio, updatedConvenio);

        return convenioRepository.save(existingConvenio);
    }

    @Transactional
    public void delete(UUID id) {
        Convenio convenio = convenioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Convênio não encontrado com ID: " + id));
        convenioRepository.delete(convenio);
    }

    private void updateEntityFields(Convenio existing, Convenio updated) {
        if (updated.getCnpjClinica() != null) existing.setCnpjClinica(updated.getCnpjClinica());
        if (updated.getNomePlanoDeSaude() != null) existing.setNomePlanoDeSaude(updated.getNomePlanoDeSaude());
        if (updated.getNumeroCnes() != null) existing.setNumeroCnes(updated.getNumeroCnes());
    }
}

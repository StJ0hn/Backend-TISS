package com.backendtiss.tiss.service;

import com.backendtiss.tiss.exceptions.NotFoundException;
import com.backendtiss.tiss.model.GuiaDeConsulta;
import com.backendtiss.tiss.repository.GuiaDeConsultaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GuiaDeConsultaService {

    private final GuiaDeConsultaRepository guiaDeConsultaRepository;

    @Transactional
    public GuiaDeConsulta create(GuiaDeConsulta guiaDeConsulta) {
        return guiaDeConsultaRepository.save(guiaDeConsulta);
    }

    public List<GuiaDeConsulta> getAll() {
        return guiaDeConsultaRepository.findAll();
    }

    public GuiaDeConsulta getById(UUID id) {
        return guiaDeConsultaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Guia de Consulta não encontrada com ID: " + id));
    }

    @Transactional
    public GuiaDeConsulta update(UUID id, GuiaDeConsulta updatedGuia) {
        GuiaDeConsulta existingGuia = guiaDeConsultaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Guia de Consulta não encontrada com ID: " + id));

        updateEntityFields(existingGuia, updatedGuia);

        return guiaDeConsultaRepository.save(existingGuia);
    }

    @Transactional
    public void delete(UUID id) {
        GuiaDeConsulta guia = guiaDeConsultaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Guia de Consulta não encontrada com ID: " + id));
        guiaDeConsultaRepository.delete(guia);
    }

    //TODO: refazer essa lógica, refqatorando em uma funcão e usando dto
    private void updateEntityFields(GuiaDeConsulta existing, GuiaDeConsulta updated) {
        if (updated.getRegistroDaClinica() != null) {
            existing.setRegistroDaClinica(updated.getRegistroDaClinica());
        }
        if (updated.getNumeroDaGuia() != null) {
            existing.setNumeroDaGuia(updated.getNumeroDaGuia());
        }
        if (updated.getPaciente() != null) {
            existing.setPaciente(updated.getPaciente());
        }
        if (updated.getMedico() != null) {
            existing.setMedico(updated.getMedico());
        }
        if (updated.getConvenio() != null) {
            existing.setConvenio(updated.getConvenio());
        }
    }
}

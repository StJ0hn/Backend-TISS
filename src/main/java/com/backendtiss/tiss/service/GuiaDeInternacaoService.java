package com.backendtiss.tiss.service;

import com.backendtiss.tiss.model.GuiaDeInternacao;
import com.backendtiss.tiss.repository.GuiaDeInternacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GuiaDeInternacaoService {

    private final GuiaDeInternacaoRepository guiaDeInternacaoRepository;

    public List<GuiaDeInternacao> getAll() {
        return guiaDeInternacaoRepository.findAll();
    }

    public GuiaDeInternacao getById(UUID id) {
        return guiaDeInternacaoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Guia de Internação não encontrada com ID: " + id));
    }

    public GuiaDeInternacao create(GuiaDeInternacao guia) {
        return guiaDeInternacaoRepository.save(guia);
    }


    //TODO: refazer essa lógica, refqatorando em uma funcão e usando dto
    public GuiaDeInternacao update(UUID id, GuiaDeInternacao guiaAtualizada) {
        GuiaDeInternacao guia = getById(id);

        guia.setRegistroAns(guiaAtualizada.getRegistroAns());
        guia.setNumeroGuia(guiaAtualizada.getNumeroGuia());
        guia.setDataDeAutorizacao(guiaAtualizada.getDataDeAutorizacao());
        guia.setNumeroDaCarteiraDoPlano(guiaAtualizada.getNumeroDaCarteiraDoPlano());
        guia.setCodigoOperadora(guiaAtualizada.getCodigoOperadora());
        guia.setNomeDoProfissionalSolicitante(guiaAtualizada.getNomeDoProfissionalSolicitante());
        guia.setNumeroConselho(guiaAtualizada.getNumeroConselho());
        guia.setUfConselho(guiaAtualizada.getUfConselho());
        guia.setCboS(guiaAtualizada.getCboS());
        guia.setCnpjInstituicao(guiaAtualizada.getCnpjInstituicao());
        guia.setNomeInstituicao(guiaAtualizada.getNomeInstituicao());
        guia.setDataInternacao(guiaAtualizada.getDataInternacao());
        guia.setMotivoDoAtendimento(guiaAtualizada.getMotivoDoAtendimento());
        guia.setRegimeDaInternacao(guiaAtualizada.getRegimeDaInternacao());
        guia.setQuantidadeDeDiariasSolicitadas(guiaAtualizada.getQuantidadeDeDiariasSolicitadas());
        guia.setTipoDaInternacao(guiaAtualizada.getTipoDaInternacao());
        guia.setIndicacaoClinicaAInternacao(guiaAtualizada.getIndicacaoClinicaAInternacao());
        guia.setCodigoDoProcedimento(guiaAtualizada.getCodigoDoProcedimento());
        guia.setDescricaoProcedimento(guiaAtualizada.getDescricaoProcedimento());
        guia.setQuantidadeDoProcedimento(guiaAtualizada.getQuantidadeDoProcedimento());
        guia.setQuantidadeProcedimentosLiberados(guiaAtualizada.getQuantidadeProcedimentosLiberados());
        guia.setDataDeSolicitacao(guiaAtualizada.getDataDeSolicitacao());
        guia.setAssinaturaResponsavelBeneficiario(guiaAtualizada.getAssinaturaResponsavelBeneficiario());
        guia.setAssinaturaDoResponsavelPelaAutorizacao(guiaAtualizada.getAssinaturaDoResponsavelPelaAutorizacao());
        guia.setAssinaturaDoProfissionalSolicitante(guiaAtualizada.getAssinaturaDoProfissionalSolicitante());
        guia.setRecemNascido(guiaAtualizada.getRecemNascido());
        guia.setPaciente(guiaAtualizada.getPaciente());
        guia.setMedico(guiaAtualizada.getMedico());
        guia.setConvenio(guiaAtualizada.getConvenio());

        return guiaDeInternacaoRepository.save(guia);
    }

    public void delete(UUID id) {
        GuiaDeInternacao guia = getById(id);
        guiaDeInternacaoRepository.delete(guia);
    }
}

package com.backendtiss.tiss.service;

import com.backendtiss.tiss.exceptions.NotFoundException;
import com.backendtiss.tiss.model.dtos.SpESadtDTOs.SpESadtDTO;
import com.backendtiss.tiss.model.dtos.SpESadtDTOs.SpESadtResponseDTO;
import com.backendtiss.tiss.model.*;
import com.backendtiss.tiss.repository.*;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SpESadtService {

    private final SpESadtRepository spESadtRepository;
    private final PacienteRepository pacienteRepository;
    private final MedicoRepository medicoRepository;
    private final ConvenioRepository convenioRepository;

    @Transactional
    public SpESadtResponseDTO create(SpESadtDTO dto) {
        if (spESadtRepository.existsByNumeroDaGuia(dto.getNumeroDaGuia())) {
            throw new IllegalArgumentException("Número da guia já cadastrado");
        }

        Paciente paciente = getPacienteById(dto.getPacienteId());
        Medico medico = getMedicoById(dto.getMedicoId());
        Convenio convenio = getConvenioById(dto.getConvenioId());

        SpESadt spESadt = buildEntityFromDTO(dto, paciente, medico, convenio);
        SpESadt saveEntity = spESadtRepository.save(spESadt);
        return toResponseDTO(saveEntity);
    }

    public SpESadtResponseDTO getById(UUID id) {
        return toResponseDTO((spESadtRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("SpESadt não encontrado com ID: " + id))));
    }

    public List<SpESadtResponseDTO> getAll() {
        return spESadtRepository.findAll().stream()
                .map(this::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    public SpESadtResponseDTO update(UUID id, SpESadtDTO dto) {
        SpESadt spESadt = (SpESadt) spESadtRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("SpESadt não encontrado com ID: " + id));

        if (dto.getNumeroDaGuia() != null &&
                !dto.getNumeroDaGuia().equals(spESadt.getNumeroDaGuia()) &&
                spESadtRepository.existsByNumeroDaGuia(dto.getNumeroDaGuia())) {
            throw new IllegalArgumentException("Novo número da guia já está em uso");
        }

        updateEntityFields(spESadt, dto);

        if (dto.getPacienteId() != null) {
            spESadt.setPaciente(getPacienteById(dto.getPacienteId()));
        }
        if (dto.getMedicoId() != null) {
            spESadt.setMedico(getMedicoById(dto.getMedicoId()));
        }
        if (dto.getConvenioId() != null) {
            spESadt.setConvenio(getConvenioById(dto.getConvenioId()));
        }

        return toResponseDTO(spESadtRepository.save(spESadt));
    }

    @Transactional
    public void delete(UUID id) {
        SpESadt spESadt = spESadtRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("SpESadt não encontrado com ID: " + id));
        spESadtRepository.delete(spESadt);
    }

    private SpESadtResponseDTO toResponseDTO(SpESadt spESadt) {
        return SpESadtResponseDTO.builder()
                .id(spESadt.getId())
                .registroAns(spESadt.getRegistroAns())
                .numeroDaGuia(spESadt.getNumeroDaGuia())
                .numeroDaCarteiraDoPlano(spESadt.getNumeroDaCarteiraDoPlano())
                .nomeDoBeneficiario(spESadt.getNomeDoBeneficiario())
                .indicadorDeAtendimentoARecemNascido(spESadt.getIndicadorDeAtendimentoARecemNascido())
                .indicacaoClinica(spESadt.getIndicacaoClinica())
                .codigoDoProcedimento(spESadt.getCodigoDoProcedimento())
                .descricao(spESadt.getDescricao())
                .motivoDeCancelamento(spESadt.getMotivoDeCancelamento())
                .quantidadesDeProcedimentosAutorizados(spESadt.getQuantidadesDeProcedimentosAutorizados())
                .gastosExtrasComMedicos(spESadt.getGastosExtrasComMedicos())
                .gastosExtrasComFarmacos(spESadt.getGastosExtrasComFarmacos())
                .valorTotalGeralDoProcedimento(spESadt.getValorTotalGeralDoProcedimento())
                .tipoDeAtendimento(spESadt.getTipoDeAtendimento())
                .causaDaOcorrencia(spESadt.getCausaDaOcorrencia())
                .tipoDeConsulta(spESadt.getTipoDeConsulta())
                .tabelaDeReferenciaDoProcedimento(spESadt.getTabelaDeReferenciaDoProcedimento())
                .casoEmergencia(spESadt.getCasoEmergencia())
                .dataDeRealizacaoDoProcedimento(spESadt.getDataDeRealizacaoDoProcedimento())
                .dataDaSolicitacao(spESadt.getDataDaSolicitacao())
                .horarioFinalDaEmergencia(spESadt.getHorarioFinalDaEmergencia())
                .horarioInicialDaEmergencia(spESadt.getHorarioInicialDaEmergencia())
                .build();
    }

    private SpESadt buildEntityFromDTO(SpESadtDTO dto, Paciente paciente, Medico medico, Convenio convenio) {
        return SpESadt.builder()
                .registroAns(dto.getRegistroAns())
                .numeroDaGuia(dto.getNumeroDaGuia())
                .numeroDaCarteiraDoPlano(dto.getNumeroDaCarteiraDoPlano())
                .nomeDoBeneficiario(dto.getNomeDoBeneficiario())
                .indicadorDeAtendimentoARecemNascido(dto.getIndicadorDeAtendimentoARecemNascido())
                .indicacaoClinica(dto.getIndicacaoClinica())
                .codigoDoProcedimento(dto.getCodigoDoProcedimento())
                .descricao(dto.getDescricao())
                .motivoDeCancelamento(dto.getMotivoDeCancelamento())
                .quantidadesDeProcedimentosAutorizados(dto.getQuantidadesDeProcedimentosAutorizados())
                .gastosExtrasComMedicos(dto.getGastosExtrasComMedicos())
                .gastosExtrasComFarmacos(dto.getGastosExtrasComFarmacos())
                .valorTotalGeralDoProcedimento(dto.getValorTotalGeralDoProcedimento())
                .tipoDeAtendimento(dto.getTipoDeAtendimento())
                .causaDaOcorrencia(dto.getCausaDaOcorrencia())
                .tipoDeConsulta(dto.getTipoDeConsulta())
                .tabelaDeReferenciaDoProcedimento(dto.getTabelaDeReferenciaDoProcedimento())
                .casoEmergencia(dto.getCasoEmergencia())
                .dataDeRealizacaoDoProcedimento(dto.getDataDeRealizacaoDoProcedimento())
                .dataDaSolicitacao(dto.getDataDaSolicitacao())
                .horarioFinalDaEmergencia(dto.getHorarioFinalDaEmergencia())
                .horarioInicialDaEmergencia(dto.getHorarioInicialDaEmergencia())
                .paciente(paciente)
                .medico(medico)
                .convenio(convenio)
                .build();
    }

    private void updateEntityFields(SpESadt spESadt, SpESadtDTO dto) {
        if (dto.getRegistroAns() != null) spESadt.setRegistroAns(dto.getRegistroAns());
        if (dto.getNumeroDaGuia() != null) spESadt.setNumeroDaGuia(dto.getNumeroDaGuia());
        if (dto.getNumeroDaCarteiraDoPlano() != null) spESadt.setNumeroDaCarteiraDoPlano(dto.getNumeroDaCarteiraDoPlano());
        if (dto.getNomeDoBeneficiario() != null) spESadt.setNomeDoBeneficiario(dto.getNomeDoBeneficiario());
        if (dto.getIndicadorDeAtendimentoARecemNascido() != null) spESadt.setIndicadorDeAtendimentoARecemNascido(dto.getIndicadorDeAtendimentoARecemNascido());
        if (dto.getIndicacaoClinica() != null) spESadt.setIndicacaoClinica(dto.getIndicacaoClinica());
        if (dto.getCodigoDoProcedimento() != null) spESadt.setCodigoDoProcedimento(dto.getCodigoDoProcedimento());
        if (dto.getDescricao() != null) spESadt.setDescricao(dto.getDescricao());
        if (dto.getMotivoDeCancelamento() != null) spESadt.setMotivoDeCancelamento(dto.getMotivoDeCancelamento());
        if (dto.getQuantidadesDeProcedimentosAutorizados() != null) spESadt.setQuantidadesDeProcedimentosAutorizados(dto.getQuantidadesDeProcedimentosAutorizados());
        if (dto.getGastosExtrasComMedicos() != null) spESadt.setGastosExtrasComMedicos(dto.getGastosExtrasComMedicos());
        if (dto.getGastosExtrasComFarmacos() != null) spESadt.setGastosExtrasComFarmacos(dto.getGastosExtrasComFarmacos());
        if (dto.getValorTotalGeralDoProcedimento() != null) spESadt.setValorTotalGeralDoProcedimento(dto.getValorTotalGeralDoProcedimento());
        if (dto.getTipoDeAtendimento() != null) spESadt.setTipoDeAtendimento(dto.getTipoDeAtendimento());
        if (dto.getCausaDaOcorrencia() != null) spESadt.setCausaDaOcorrencia(dto.getCausaDaOcorrencia());
        if (dto.getTipoDeConsulta() != null) spESadt.setTipoDeConsulta(dto.getTipoDeConsulta());
        if (dto.getTabelaDeReferenciaDoProcedimento() != null) spESadt.setTabelaDeReferenciaDoProcedimento(dto.getTabelaDeReferenciaDoProcedimento());
        if (dto.getCasoEmergencia() != null) spESadt.setCasoEmergencia(dto.getCasoEmergencia());
        if (dto.getDataDeRealizacaoDoProcedimento() != null) spESadt.setDataDeRealizacaoDoProcedimento(dto.getDataDeRealizacaoDoProcedimento());
        if (dto.getDataDaSolicitacao() != null) spESadt.setDataDaSolicitacao(dto.getDataDaSolicitacao());
        if (dto.getHorarioFinalDaEmergencia() != null) spESadt.setHorarioFinalDaEmergencia(dto.getHorarioFinalDaEmergencia());
        if (dto.getHorarioInicialDaEmergencia() != null) spESadt.setHorarioInicialDaEmergencia(dto.getHorarioInicialDaEmergencia());
    }

    private Paciente getPacienteById(UUID id) {
        return pacienteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Paciente não encontrado com ID: " + id));
    }

    private Medico getMedicoById(UUID id) {
        return medicoRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Médico não encontrado com ID: " + id));
    }

    private Convenio getConvenioById(UUID id) {
        return convenioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Convênio não encontrado com ID: " + id));
    }
}

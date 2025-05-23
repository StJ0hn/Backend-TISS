package com.backendtiss.tiss.repository;

import com.backendtiss.tiss.model.GuiaDeInternacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GuiaDeInternacaoRepository extends JpaRepository<GuiaDeInternacao, UUID> {
}

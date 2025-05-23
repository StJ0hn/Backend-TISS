package com.backendtiss.tiss.repository;

import com.backendtiss.tiss.model.GuiaDeConsulta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GuiaDeConsultaRepository extends JpaRepository<GuiaDeConsulta, UUID> {
}

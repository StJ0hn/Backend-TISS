package com.backendtiss.tiss.repository;

import com.backendtiss.tiss.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PecienteRepository extends JpaRepository<Paciente, UUID> {
}

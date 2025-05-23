package com.backendtiss.tiss.repository;

import com.backendtiss.tiss.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MedicoRepository extends JpaRepository<Medico, UUID> {
}

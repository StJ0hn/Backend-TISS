package com.backendtiss.tiss.repository;

import com.backendtiss.tiss.model.Convenio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConvenioRepository extends JpaRepository<Convenio, UUID> {
}

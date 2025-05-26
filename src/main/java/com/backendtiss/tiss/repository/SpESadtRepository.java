package com.backendtiss.tiss.repository;

import com.backendtiss.tiss.model.SpESadt;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpESadtRepository extends JpaRepository<SpESadt, UUID> {
    boolean existsByNumeroDaGuia(@NotNull @Size(max = 20) String numeroDaGuia);
}

package com.backendtiss.tiss.repository;

import com.backendtiss.tiss.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Integer> {
}

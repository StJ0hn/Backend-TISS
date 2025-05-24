/*
package com.backendtiss.tiss.controller;

import com.backendtiss.tiss.model.dtos.SpESadtDTOs.SpESadtDTO;
import com.backendtiss.tiss.model.dtos.SpESadtDTOs.SpESadtResponseDTO;
import com.backendtiss.tiss.service.SpESadtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/guias-de-spsadt")
public class SpESadtController {

    @Autowired
    private SpESadtService spESadtService;

    @GetMapping
    public List<SpESadtResponseDTO> getAll() {
        return spESadtService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SpESadtResponseDTO> getById(@PathVariable UUID id) {
        return ResponseEntity.ok(spESadtService.getById(id));
    }

    @PostMapping
    public SpESadtResponseDTO create(@RequestBody SpESadtDTO guia) {
        return spESadtService.create(guia);
    }

    @PutMapping("/{id}")
    public SpESadtResponseDTO update(@PathVariable UUID id, @RequestBody SpESadtDTO guia) {
        return spESadtService.update(id, guia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        spESadtService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
*/
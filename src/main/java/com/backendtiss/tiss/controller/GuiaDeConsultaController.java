package com.backendtiss.tiss.controller;

import com.backendtiss.tiss.model.GuiaDeConsulta;
import com.backendtiss.tiss.service.GuiaDeConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/guias-de-consulta")
public class GuiaDeConsultaController {

    @Autowired
    private GuiaDeConsultaService guiaDeConsultaService;

    @GetMapping
    public List<GuiaDeConsulta> getAll() {
        return guiaDeConsultaService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GuiaDeConsulta> getById(@PathVariable UUID id) {
        return ResponseEntity.ok(guiaDeConsultaService.getById(id));
    }

    @PostMapping
    public GuiaDeConsulta create(@RequestBody GuiaDeConsulta guia) {
        return guiaDeConsultaService.create(guia);
    }

    @PutMapping("/{id}")
    public GuiaDeConsulta update(@PathVariable UUID id, @RequestBody GuiaDeConsulta guia) {
        return guiaDeConsultaService.update(id, guia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        guiaDeConsultaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

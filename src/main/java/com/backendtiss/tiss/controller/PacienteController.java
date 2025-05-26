package com.backendtiss.tiss.controller;

import com.backendtiss.tiss.model.Paciente;
import com.backendtiss.tiss.service.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pacientes")
@RequiredArgsConstructor
public class PacienteController {

    private final PacienteService pacienteService;

    @GetMapping
    public List<Paciente> getAll() {
        return pacienteService.getAll();
    }

    @GetMapping("/{id}")
    public Paciente getById(@PathVariable UUID id) {
        return pacienteService.getById(id);
    }

    @PostMapping
    public Paciente create(@RequestBody Paciente paciente) {
        return pacienteService.create(paciente);
    }

    @PutMapping("/{id}")
    public Paciente update(@PathVariable UUID id, @RequestBody Paciente paciente) {
        return pacienteService.update(id, paciente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        pacienteService.delete(id);
    }
}

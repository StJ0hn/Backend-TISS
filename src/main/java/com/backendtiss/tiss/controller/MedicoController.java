package com.backendtiss.tiss.controller;

import com.backendtiss.tiss.model.Medico;
import com.backendtiss.tiss.service.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/medicos")
@RequiredArgsConstructor
public class MedicoController {

    private final MedicoService medicoService;

    @GetMapping
    public List<Medico> getAll() {
        return medicoService.getAll();
    }

    @GetMapping("/{id}")
    public Medico getById(@PathVariable UUID id) {
        return medicoService.getById(id);
    }

    @PostMapping
    public Medico save(@RequestBody Medico medico) {
        return medicoService.save(medico);
    }

    @PutMapping("/{id}")
    public Medico update(@PathVariable UUID id, @RequestBody Medico medico) {
        return medicoService.update(id, medico);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        medicoService.delete(id);
    }
}

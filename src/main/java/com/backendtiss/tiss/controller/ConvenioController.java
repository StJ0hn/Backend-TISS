package com.backendtiss.tiss.controller;

import com.backendtiss.tiss.model.Convenio;
import com.backendtiss.tiss.service.ConvenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/convenios")
public class ConvenioController {

    @Autowired
    private ConvenioService convenioService;

    @GetMapping
    public List<Convenio> getAll() {
        return convenioService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Convenio> getById(@PathVariable UUID id) {
        return convenioService.getById(id);
    }

    @PostMapping
    public Convenio create(@RequestBody Convenio convenio) {
        return convenioService.create(convenio);
    }

    @PutMapping("/{id}")
    public Convenio update(@PathVariable UUID id, @RequestBody Convenio convenio) {
        return convenioService.update(id, convenio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        convenioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}


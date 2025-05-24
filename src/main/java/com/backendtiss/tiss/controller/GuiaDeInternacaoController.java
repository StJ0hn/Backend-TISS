/*
package com.backendtiss.tiss.controller;

import com.backendtiss.tiss.model.GuiaDeInternacao;
import com.backendtiss.tiss.service.GuiaDeInternacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/guias")
@RequiredArgsConstructor
public class GuiaDeInternacaoController {

    private final GuiaDeInternacaoService guiaDeInternacaoService;

    @GetMapping
    public List<GuiaDeInternacao> getAll() {
        return guiaDeInternacaoService.getAll();
    }

    @GetMapping("/{id}")
    public GuiaDeInternacao getById(@PathVariable UUID id) {
        return guiaDeInternacaoService.getById(id);
    }

    @PostMapping
    public GuiaDeInternacao create(@RequestBody GuiaDeInternacao guia) {
        return guiaDeInternacaoService.create(guia);
    }

    @PutMapping("/{id}")
    public GuiaDeInternacao update(@PathVariable UUID id, @RequestBody GuiaDeInternacao guia) {
        return guiaDeInternacaoService.update(id, guia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        guiaDeInternacaoService.delete(id);
    }
}
*/
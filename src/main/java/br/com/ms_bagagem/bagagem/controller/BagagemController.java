package br.com.ms_bagagem.bagagem.controller;

import br.com.ms_bagagem.bagagem.dto.BagagemRequestDTO;
import br.com.ms_bagagem.bagagem.model.Bagagem;
import br.com.ms_bagagem.bagagem.service.BagagemService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bagagens")
public class BagagemController {

    private final BagagemService service;

    public BagagemController(BagagemService service) {
        this.service = service;
    }

    // RF23
    @PostMapping
    public Bagagem registrar(@RequestBody @Valid BagagemRequestDTO dto) {
        return service.registrarBagagem(dto);
    }

    // RF25
    @GetMapping("/{codigo}")
    public Bagagem rastrear(@PathVariable String codigo) {
        return service.rastrear(codigo);
    }

    // RF25
    @PutMapping("/{codigo}/localizacao")
    public Bagagem atualizarLocalizacao(
            @PathVariable String codigo,
            @RequestParam String localizacao) {

        return service.atualizarLocalizacao(codigo, localizacao);
    }

    // RF26
    @PutMapping("/{codigo}/extravio")
    public Bagagem extravio(@PathVariable String codigo) {
        return service.registrarExtravio(codigo);
    }
}
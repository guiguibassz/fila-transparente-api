package br.com.filatransparente.controller;

import br.com.filatransparente.domain.UnidadeSaude;
import br.com.filatransparente.repository.UnidadeSaudeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unidades")

public class UnidadeSaudeController {

    private final UnidadeSaudeRepository repository;

    public UnidadeSaudeController(UnidadeSaudeRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UnidadeSaude criar (@RequestBody UnidadeSaude unidade){
        return repository.save(unidade);
    }

    @GetMapping
    public List<UnidadeSaude> listar(){
        return repository.findAll();
    }
}

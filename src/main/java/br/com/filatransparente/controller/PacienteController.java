package br.com.filatransparente.controller;

import br.com.filatransparente.domain.Paciente;
import br.com.filatransparente.repository.PacienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteRepository repository;

    public PacienteController(PacienteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Paciente criar (@RequestBody Paciente paciente) {
        return repository.save(paciente);
    }

    @GetMapping
    public List<Paciente> listar() {
        return repository.findAll();
    }

}
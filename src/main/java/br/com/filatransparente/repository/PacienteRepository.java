package br.com.filatransparente.repository;

import br.com.filatransparente.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository  extends JpaRepository<Paciente,Long> {
}
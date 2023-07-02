package pdev.com.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pdev.com.agenda.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}

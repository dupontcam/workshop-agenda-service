package pdev.com.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdev.com.agenda.entities.Paciente;
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}

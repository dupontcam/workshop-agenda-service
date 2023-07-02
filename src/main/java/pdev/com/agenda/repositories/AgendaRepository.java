package pdev.com.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pdev.com.agenda.entities.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
}

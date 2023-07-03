package pdev.com.agenda.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pdev.com.agenda.entities.Paciente;
import pdev.com.agenda.repositories.PacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PacienteService {

    private PacienteRepository repository;

    public Paciente salvar(Paciente paciente){
        return repository.save(paciente);
    }

    public List<Paciente> listarTodos(){
        return repository.findAll();
    }

    public Optional<Paciente> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}

package com.sistematizacaomgs.api.service;

import com.sistematizacaomgs.api.model.Funcionario;
import io.micrometer.observation.ObservationFilter;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service

public class FuncionarioService {
    private final List<Funcionario> funcionarios = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public List<Funcionario> findAll() {
        return funcionarios;
    }

    public Optional<Funcionario> findById(Long id) {
        return funcionarios.stream().filter(u -> u.getId().equals(id)).findFirst();
    }

    public Funcionario save(Funcionario funcionario) {
        funcionario.setId(counter.incrementAndGet());
        funcionarios.add(funcionario);
        return funcionario;
    }

    public Optional<Funcionario> update(Long id, Funcionario funcionarioAtualizado) {
        return findById(id).map(funcionario -> {
            funcionario.setNome(funcionarioAtualizado.getNome());
            funcionario.setEmail(funcionarioAtualizado.getEmail());
            funcionario.setTelefone(funcionarioAtualizado.getTelefone());
            funcionario.setInformacoesMedicas(funcionarioAtualizado.getInformacoesMedicas());
            return funcionario;

        });

    }

    public boolean delete(Long id) {
        return funcionarios.removeIf(funcionario -> funcionario.getId().equals(id));
    }
}


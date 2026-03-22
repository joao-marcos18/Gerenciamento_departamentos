package com.example.exercicio8.services;

import java.util.List;
import java.util.Optional;

import com.example.exercicio8.models.DepartamentosModel;
import com.example.exercicio8.repositories.DepartamentosRepository;
import org.springframework.stereotype.Service;


@Service
public class DepartamentosService {

    private final DepartamentosRepository departamentoRepository;

    public DepartamentosService(DepartamentosRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    public DepartamentosModel criarDepartamento(DepartamentosModel departamento) {
        return departamentoRepository.save(departamento);
    }

    public List<DepartamentosModel> listarDepartamentos() {
        return departamentoRepository.findAll();
    }

    public Optional<DepartamentosModel> buscarPorId(Long id) {
        return departamentoRepository.findById(id);
    }

    public void deletarDepartamento(Long id) {
        departamentoRepository.deleteById(id);
    }
}
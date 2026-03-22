package com.example.exercicio8.controllers;

import java.util.List;
import java.util.Optional;

import com.example.exercicio8.models.DepartamentosModel;
import com.example.exercicio8.services.DepartamentosService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/departamentos")
public class DepartamentosController {

    private final DepartamentosService departamentosService;

    public DepartamentosController(DepartamentosService departamentoService) {
        this.departamentosService = departamentoService;
    }

    @PostMapping
    public DepartamentosModel criarDepartamento(@RequestBody DepartamentosModel departamento) {
        return departamentosService.criarDepartamento(departamento);
    }

    @GetMapping
    public List<DepartamentosModel> listarDepartamentos() {
        return departamentosService.listarDepartamentos();
    }

    @GetMapping("/{id}")
    public Optional<DepartamentosModel> buscarPorId(@PathVariable Long id) {
        return departamentosService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarDepartamento(@PathVariable Long id) {
        departamentosService.deletarDepartamento(id);
    }
}
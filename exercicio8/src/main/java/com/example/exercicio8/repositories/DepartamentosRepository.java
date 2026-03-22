package com.example.exercicio8.repositories;

import com.example.exercicio8.models.DepartamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentosRepository extends JpaRepository<DepartamentosModel, Long> {

}
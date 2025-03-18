package com.example.ac1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac1.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    // Você pode adicionar consultas customizadas se necessário
}

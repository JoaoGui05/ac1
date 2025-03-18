package com.example.ac1.repositories;

import com.example.ac1.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    // Os métodos básicos já estão fornecidos pelo JpaRepository
    // (save(), deleteById(), findById(), findAll(), etc.)
}

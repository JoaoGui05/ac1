package com.example.ac1.controllers;

import com.example.ac1.models.Curso;
import com.example.ac1.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    // Método para listar todos os cursos
    @GetMapping
    public List<Curso> mostrarTodos() {
        return cursoRepository.findAll();
    }

    // Método para cadastrar um novo curso
    @PostMapping
    public Curso inserir(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }
}

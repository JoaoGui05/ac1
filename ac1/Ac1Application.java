package com.example.ac1;

import com.example.ac1.models.Aluno;
import com.example.ac1.models.Curso;
import com.example.ac1.repositories.AlunoRepository;
import com.example.ac1.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ac1Application implements CommandLineRunner {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    public static void main(String[] args) {
        SpringApplication.run(Ac1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Inserindo cursos
        Curso curso1 = new Curso("Curso Java");
        Curso curso2 = new Curso("Curso Spring Boot");

        cursoRepository.save(curso1);
        cursoRepository.save(curso2);

        // Inserindo alunos
        Aluno aluno1 = new Aluno("Carlos Silva");
        Aluno aluno2 = new Aluno("Maria Oliveira");

        alunoRepository.save(aluno1);
        alunoRepository.save(aluno2);

        // Exibindo todos os cursos e alunos
        System.out.println("Lista de Cursos:");
        cursoRepository.findAll().forEach(curso -> System.out.println(curso.getNome()));

        System.out.println("\nLista de Alunos:");
        alunoRepository.findAll().forEach(aluno -> System.out.println(aluno.getNome()));
    }
}

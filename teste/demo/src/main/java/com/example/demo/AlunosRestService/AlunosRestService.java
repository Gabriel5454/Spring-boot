package com.example.demo.AlunosRestService;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Aluno.Aluno;

import jakarta.validation.Valid;
@RestController
@RequestMapping("api/v1")
public class AlunosRestService {
    List<Aluno> alunos = new ArrayList<>();
    @GetMapping("/alunos/listar")
    public List<Aluno> getAlunos() {
       alunos.add(new Aluno("João", 15, "24100054890"));
       return alunos;
    }

    @PostMapping("/alunos/inserir")
    public List<Aluno> insertAluno(@RequestBody @Valid Aluno aluno){
        alunos.add(aluno);
        System.out.println("Aluno inserido:" + aluno);
    return alunos;
    }
}

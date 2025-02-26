package br.edu.eteczl.atividade.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/aluno")
public class AlunoController {

    @RequestMapping("/findByName")
    public String findbyname(@RequestParam String nome){
        return "Olá Aluno," + nome;
    }

    @GetMapping("/get/{id}")
    public String getbyid(@PathVariable(value="id") String id){
        return "Id para pegar o usario foi," + id;
    } 
}

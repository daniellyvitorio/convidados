package com.convidados.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/convidados")
@Controller
public class ConvidadosController {
    //localhost:8080/convidados/listar
    @GetMapping("/listar")
    public String listar(){
        return  "Lista de Convidados.";
    }
}

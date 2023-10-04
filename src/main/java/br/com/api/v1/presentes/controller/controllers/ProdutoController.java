package br.com.api.v1.presentes.controller.controllers;

import br.com.api.v1.presentes.core.Models.Produto;
import br.com.api.v1.presentes.service.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping("/adicionar")
    public ResponseEntity Create(@RequestBody Produto produto){
        if (service.Create(produto)){
            return ResponseEntity.ok("Registro criado com sucesso");
        } else {
            return ResponseEntity.badRequest().body("Erro ao criar registro");
        }
    }

    @GetMapping("/encontrar/{$id}")
    public ResponseEntity FindById(@RequestParam int id){
        Produto produto = service.findById(id);
        if (produto != null){
            return ResponseEntity.ok().body(produto);
        }else {
            return ResponseEntity.notFound().build();
        }

    }
}

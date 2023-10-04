package br.com.api.v1.presentes.service.services;

import br.com.api.v1.presentes.core.Models.Produto;
import br.com.api.v1.presentes.core.infrastructure.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto findById(int id){
        Optional<Produto> produto = repository.findById(id);
        return produto.orElse(null);
    }

    public Boolean Create(Produto produto){
        try {
            repository.save(produto);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}

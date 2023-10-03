package br.com.api.v1.presentes.core.infrastructure;

import br.com.api.v1.presentes.core.Models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}

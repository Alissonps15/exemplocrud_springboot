package br.edu.famper.exemplo1.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.famper.exemplo1.model.Produto;

public interface ProdutoReposity extends JpaRepository<Produto, Long> {
}

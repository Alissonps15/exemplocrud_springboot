package br.edu.famper.exemplo1.service;

import br.edu.famper.exemplo1.model.Produto;
import br.edu.famper.exemplo1.reposity.ProdutoReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoReposity produtoReposity;

    public Produto salvar(Produto produto) {
        return produtoReposity.save(produto);
    }
        public List<Produto> findall() {
            return produtoReposity.findAll();
        }
        public Optional<Produto> findById(Long id) {
        return produtoReposity.findById(id);
        }

        public Produto update(Produto produto) {
        return produtoReposity.save(produto);
        }

        public void deleteById(Long id) {
        produtoReposity.deleteById(id);
        }
    }


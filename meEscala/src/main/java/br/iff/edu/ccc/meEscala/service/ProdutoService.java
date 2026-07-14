package br.iff.edu.ccc.meEscala.service;

import java.util.UUID;

public class ProdutoService {

    public void criarProduto(ProdutoRequest produto) {
        UUID id = UUID.randomUUID();
        Produto novoProduto = new Produto(id, produto.getNome(), produto.getDescricao());
        // Lógica para criar um produto
    }

    public void atualizarProduto( ) {
        // Lógica para atualizar um produto
    }

    public void deletarProduto() {
        // Lógica para deletar um produto
    }

    public void buscarProduto() {
        // Lógica para buscar um produto
    }

    public void listarProdutos() {
        // Lógica para listar todos os produtos
    }

}

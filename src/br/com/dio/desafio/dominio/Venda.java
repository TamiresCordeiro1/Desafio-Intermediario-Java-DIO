package br.com.dio.desafio.dominio;

import java.util.ArrayList;

public class Venda {
    //Lista de produto
    ArrayList<Produto> produtos = new ArrayList();

    //Método para adicionar o produto no pedido, ou seja, na venda
    public void adicionarProduto(Produto produto, int quantidade)
    {
        produto.baixarEstoque(quantidade);
        produtos.add(produto);
        System.out.println("Produto "+produto.descricao+" adicionado com sucesso!");
    }

    public void removerProduto(Produto produto)
    {
        produtos.remove(produto);
        System.out.println("Produto "+produto.descricao+" removido com sucesso!");
    }

    public void listarProdutos()
    {
        System.out.println("");
        System.out.println("Listagem de Produtos ------------");

        for (Produto produto : produtos)
        {
            System.out.println("Produto: "+produto.descricao+" estoque: "+produto.getEstoque());

        }
    }
}

package br.com.dio.desafio.dominio;

public class Main {
        public static void main(String[] args) {
            //Crio, ou seja, instancio dois produtos
            Produto pc = new Produto();
            pc.descricao = "Computador i5";
            pc.preco = 1500;

            Produto cel = new Produto();
            cel.descricao = "Celular";
            cel.preco = 2000;

            //Crio um objeto para venda
            Venda venda = new Venda();

            //Adicionando produtos na venda, informando a quantidade para baixar estoque
            venda.adicionarProduto(pc, 4);
            venda.adicionarProduto(cel, 1);

            //listo todos os produtos com o estoque atualizado
            venda.listarProdutos();
        }
}

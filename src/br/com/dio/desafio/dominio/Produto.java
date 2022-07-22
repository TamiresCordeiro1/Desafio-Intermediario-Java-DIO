package br.com.dio.desafio.dominio;

public class Produto {
    //Atributos públicos
    public String descricao;
    public double preco;
    private int estoque;

    //Construtor: todo produto criado terá 10 unidades no estoque
    public Produto()
    {
        estoque = 10;
    }

    //Método para diminuir o estoque
    public void baixarEstoque(int quantidade)
    {
        this.estoque = this.estoque - quantidade;
    }

    //Método para aumentar o estoque
    public void aumentarEstoque(int quantidade)
    {
        this.estoque = this.estoque + quantidade;
    }

    //Método para obter o estoque
    public int getEstoque()
    {
        return this.estoque;
    }

}


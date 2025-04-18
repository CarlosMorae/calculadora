package Produto2;

import java.util.Scanner;

public class Produto2 {
    private String nome;
    private String descricao;
    private int quantidadeDeEstoque;

    public Produto2(String nome, String descricao, int quantidadeDeEstoque){
    }
    public Produto2(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeDeEstoque() {
        return quantidadeDeEstoque;
    }

    public void setQuantidadeDeEstoque(int quantidadeDeEstoque) {
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }
    @Override
    public String toString() {
        return "Produto2{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidadeDeEstoque=" + quantidadeDeEstoque +
                '}';
    }
}

package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
    }
    /* int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
}
class Livro{
    private String nome;
    private Integer npaginas;

    public Livro(String nome, Integer npaginas) {
        this.nome = nome;
        this.npaginas = npaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(Integer npaginas) {
        this.npaginas = npaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npaginas=" + npaginas +
                '}';
    }
}
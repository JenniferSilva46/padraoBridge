package com.company.domain;

public class Livro  implements LivroInterface{
    private Fisico fisico;

    public Livro() {
    }

    public Livro(Fisico fisico) {
        this.fisico = fisico;
    }

    @Override
    public Fisico getLivro() {
        return this.fisico;
    }
}

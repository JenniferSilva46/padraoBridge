package com.company.domain;

import com.company.AbstractLivro;

public class LivroEmprestimo extends AbstractLivro {
    public  LivroEmprestimo(Fisico livro, Boolean verificarLivro){
        super(livro, verificarLivro);
    }

}

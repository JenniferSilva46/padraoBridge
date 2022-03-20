package com.company.domain;

import com.company.AbstractLivro;

public class LivroEmprestimo extends AbstractLivro {
    public  LivroEmprestimo(Livro livro, Boolean verificarLivro){
        super(livro, verificarLivro);
    }

}

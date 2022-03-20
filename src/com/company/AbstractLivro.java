package com.company;

import com.company.domain.Fisico;
import com.company.domain.Livro;
import com.company.domain.LivroInterface;

import java.util.Objects;

public abstract class AbstractLivro{
    protected LivroInterface livroInterface;
    private Boolean verificarLivro;
    private Livro livro;

    public AbstractLivro(){

    }

    public AbstractLivro(Fisico livro, Boolean verificarLivro){
        this.livro = new Livro(livro);
        this.verificarLivro = verificarLivro;
    }

    public AbstractLivro(Fisico livro){
        this.livro = new Livro(livro);
    }

    public void ConcluirEmprestimo(){

        if (!Objects.isNull(this.verificarLivro)){
            System.out.print("Emprestimo do livro " + this.livro.getLivro().getTitulo() +  " foi realizado com sucesso!");
        } else {
            System.out.print("O livro " + this.livro.getLivro().getTitulo() + " não esta disponivel para emprestimo");
        }

    }

    public void ConcluirDevolucao(){
        System.out.print("\nO livro " + this.livro.getLivro().getTitulo() + " foi devolvido com sucesso!");
    }



}
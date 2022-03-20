package com.company;

import com.company.domain.Livro;
import com.company.domain.LivroInterface;

import java.util.Objects;

public abstract class AbstractLivro{
    protected LivroInterface livroInterface;
    private Boolean verificarLivro;

    private Livro livro = new Livro();

    public AbstractLivro(){

    }

    public AbstractLivro(Livro livro, Boolean verificarLivro){
        this.verificarLivro = verificarLivro;
        this.livro = livro;
    }

    public AbstractLivro(Livro livro){
        this.livro = livro;
    }

    public void ConcluirEmprestimo(){

        if (!Objects.isNull(this.verificarLivro)){
            System.out.print("Emprestimo do livro " + this.livro.titulo +  " foi realizado com sucesso!");
        } else {
            System.out.print("O livro " + this.livro.titulo + " não esta disponivel para emprestimo");
        }

//        this.livro = new Livro();
    }

    public void ConcluirDevolucao(){
        System.out.print("\nO livro " + this.livro.titulo + " foi devolvido com sucesso!");
    }



}
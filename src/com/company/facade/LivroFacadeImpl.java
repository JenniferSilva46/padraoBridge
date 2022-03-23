package com.company.facade;

import com.company.AbstractLivro;
import com.company.domain.Fisico;
import com.company.domain.LivroDevolucao;
import com.company.domain.LivroEmprestimo;

import java.util.Objects;

public class LivroFacadeImpl implements LivroFacade{

    @Override
    public void livroDevolucao(Fisico livro) {
        AbstractLivro devolucao = new LivroDevolucao(livro);
        if(!Objects.isNull(devolucao)){
            concluirDevolucao(devolucao);
        }
        else{
            System.out.print("Não foi possível realizar o emprestimo");
        }
    }

    @Override
    public void livroEmprestimo(Fisico livro) {
        Boolean verificado = verificarLivro(true);
        AbstractLivro emprestimo = new LivroEmprestimo(livro, verificado);
        if(!Objects.isNull(emprestimo)){
            concluirEmprestimo(emprestimo);
        }
        else{
            System.out.print("Não foi possível realizar o emprestimo");
        }
    }

    @Override
    public boolean verificarLivro(Boolean verificar) {
        return verificar;
    }

    @Override
    public void concluirEmprestimo(AbstractLivro abstractLivro) {
        abstractLivro.ConcluirEmprestimo();

    }

    @Override
    public void concluirDevolucao(AbstractLivro abstractLivro) {
        abstractLivro.ConcluirDevolucao();
    }
}


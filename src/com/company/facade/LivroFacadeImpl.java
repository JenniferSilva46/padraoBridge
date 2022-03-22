package com.company.facade;

import com.company.AbstractLivro;
import com.company.domain.Fisico;
import com.company.domain.LivroDevolucao;
import com.company.domain.LivroEmprestimo;

public class LivroFacadeImpl implements LivroFacade{

    @Override
    public void livroDevolucao(Fisico livro) {
        AbstractLivro devolucao = new LivroDevolucao(livro);
        concluirDevolucao(devolucao);
    }

    @Override
    public void livroEmprestimo(Fisico livro) {
       Boolean verificado = verificarLivro(true);
        AbstractLivro emprestimo = new LivroEmprestimo(livro, verificado);
        concluirEmprestimo(emprestimo);
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


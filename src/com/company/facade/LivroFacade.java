package com.company.facade;

import com.company.AbstractLivro;
import com.company.domain.Fisico;
import com.company.domain.Livro;

public interface LivroFacade {
    public void livroDevolucao(Fisico livro);

    public void livroEmprestimo(Fisico livro);

    public boolean verificarLivro(Boolean verificar);

    public void concluirEmprestimo(AbstractLivro abstractLivro);

    public void concluirDevolucao(AbstractLivro abstractLivro);
}

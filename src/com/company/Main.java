package com.company;

import com.company.domain.Fisico;
import com.company.domain.Livro;
import com.company.domain.LivroDevolucao;
import com.company.domain.LivroEmprestimo;

public class Main {

    public static void main(String[] args) {

        Fisico autoDaCompadecida = new Fisico(
                "Auto da compadecida",
                "Ariano Suassuna"
        );

        AbstractLivro abstractLivro = new LivroEmprestimo( autoDaCompadecida, true);

        abstractLivro.ConcluirEmprestimo();


        Fisico mindset = new Fisico(
                "Mindset",
                "Carol Dweck"
        );

        AbstractLivro devolucao = new LivroDevolucao(mindset);

        devolucao.ConcluirDevolucao();
    }
}

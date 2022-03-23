package com.company;

import com.company.domain.Fisico;
import com.company.domain.Livro;
import com.company.domain.LivroDevolucao;
import com.company.domain.LivroEmprestimo;
import com.company.facade.LivroFacade;
import com.company.facade.LivroFacadeImpl;

public class Main {

    public static void main(String[] args) {
        LivroFacade livroFacade = new LivroFacadeImpl();

        Fisico autoDaCompadecida = new Fisico(
                "Auto da compadecida",
                "Ariano Suassuna"
        );
        livroFacade.livroEmprestimo(autoDaCompadecida);


        Fisico mindset = new Fisico(
                "Mindset",
                "Carol Dweck"
        );
        livroFacade.livroDevolucao(mindset);
    }
}

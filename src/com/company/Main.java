package com.company;

import com.company.domain.Livro;
import com.company.domain.LivroDevolucao;
import com.company.domain.LivroEmprestimo;

public class Main {

    public static void main(String[] args) {

        Livro autoDaCompadecida = new Livro(
                "Auto da compadecida"
        );


        // QUal tipo de serviço?
            // Emprestimo
            // Verificar se esta disponivel
        AbstractLivro abstractLivro = new LivroEmprestimo( autoDaCompadecida, true);

                // Se sim
                    // Concluir emprestimo
        abstractLivro.ConcluirEmprestimo();
                //Se não
                    // Negar emprestimo
            // Devolução ?

                // Cunclui devolução

        Livro mindset = new Livro(
                "Mindset"
        );

        AbstractLivro devolucao = new LivroDevolucao(mindset);

        devolucao.ConcluirDevolucao();
    }
}

package com.company;

import com.company.domain.Livro;
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
        abstractLivro.Concluir();
                //Se não
                    // Negar emprestimo
            // Devolução ?
                // Cunclui devolução

    }
}

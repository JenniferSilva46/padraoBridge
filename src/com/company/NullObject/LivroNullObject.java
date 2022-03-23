package com.company.NullObject;

import com.company.domain.Fisico;
import com.company.domain.LivroInterface;

public class LivroNullObject implements LivroInterface {
    @Override
    public Fisico getLivro() {
        Fisico livro = new Fisico("", "");
        return livro;
    }
}

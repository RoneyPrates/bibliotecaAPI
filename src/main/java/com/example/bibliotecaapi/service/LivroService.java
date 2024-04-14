package com.example.bibliotecaapi.service;

import com.example.bibliotecaapi.model.Livro;
import com.example.bibliotecaapi.repository.LivroRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class LivroService {
    @Inject
    private LivroRepository livroRepository;

    public List<Livro> listar (){
        return livroRepository.listar();
    }
    public void cadastrar(Livro livro) throws Exception {
        livroRepository.cadastrar(livro);
    }
}

package com.acn3to;

import com.acn3to.entities.Pessoa;
import com.acn3to.interfaces.AnalisadorDeDados;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AnalisadorJSON implements AnalisadorDeDados<List<Pessoa>> {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private List<Pessoa> pessoas;

    @Override
    public void lerArquivo(String caminho) {
        try {
            pessoas = objectMapper.readValue(new File(caminho), new TypeReference<>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Pessoa> extrairDados() {
        return pessoas;
    }

    @Override
    public void processarDados(List<Pessoa> dados) {
        for (Pessoa pessoa : dados) {
            System.out.println("Processando dados JSON: " + pessoa);
        }
    }
}
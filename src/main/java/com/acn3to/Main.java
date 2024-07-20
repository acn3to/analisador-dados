package com.acn3to;

import com.acn3to.entities.Pessoa;
import com.acn3to.entities.Produto;
import com.acn3to.interfaces.AnalisadorDeDados;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnalisadorDeDados<List<Pessoa>> analisadorJSON = new AnalisadorJSON();
        String caminhoArquivoJSON = "pessoas.json";

        analisadorJSON.lerArquivo(caminhoArquivoJSON);

        List<Pessoa> pessoas = analisadorJSON.extrairDados();

        analisadorJSON.processarDados(pessoas);

        AnalisadorDeDados<List<Produto>> analisadorCSV = new AnalisadorCSV();
        String caminhoArquivoCSV = "produtos.csv";

        analisadorCSV.lerArquivo(caminhoArquivoCSV);

        List<Produto> produtos = analisadorCSV.extrairDados();

        analisadorCSV.processarDados(produtos);
    }
}

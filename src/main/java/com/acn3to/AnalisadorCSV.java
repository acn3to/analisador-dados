package com.acn3to;

import com.acn3to.entities.Produto;
import com.acn3to.interfaces.AnalisadorDeDados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnalisadorCSV implements AnalisadorDeDados<List<Produto>> {

    @Override
    public void lerArquivo(String caminho) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String line;
            List<Produto> produtos = new ArrayList<>();

            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String nome = values[0];
                double preco = Double.parseDouble(values[1]);
                produtos.add(new Produto(nome, preco));
            }
            processarDados(produtos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Produto> extrairDados() {
        return new ArrayList<>();
    }

    @Override
    public void processarDados(List<Produto> dados) {
        for (Produto produto : dados) {
            System.out.println("Processando dados CSV: " + produto);
        }
    }
}
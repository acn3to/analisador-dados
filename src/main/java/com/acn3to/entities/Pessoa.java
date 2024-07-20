package com.acn3to.entities;

public class Pessoa {
    private String nome;
    private String numero;

    public Pessoa() {
    }

    public Pessoa(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + getNome() + '\'' +
                ", numero='" + getNumero() + '\'' +
                '}';
    }
}

package com.acn3to.interfaces;

public interface AnalisadorDeDados<T> {
    void lerArquivo(String caminho);
    T extrairDados();
    void processarDados(T dados);
}

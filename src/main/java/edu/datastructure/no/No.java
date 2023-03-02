package edu.datastructure.no;

public class No<T> {

    private T conteudo;
    private No<T> proximo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximo = proximo;
    }


    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}

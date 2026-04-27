package models;

public class Node {
    private int valor;
    private Node esquerda;
    private Node direita;

    public Node(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
    public int getValor() {
        return valor;
    }

    public Node getEsquerda() {
        return esquerda;
    }

    public Node getDireita() {
        return direita;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(Node direita) {
        this.direita = direita;
    }
}

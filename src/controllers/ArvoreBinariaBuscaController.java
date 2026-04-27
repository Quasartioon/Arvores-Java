package controllers;
import models.ArvoreBinariaBusca;
import models.Node;
public class ArvoreBinariaBuscaController {
    private ArvoreBinariaBusca model;
    public ArvoreBinariaBuscaController() {
        model = new ArvoreBinariaBusca();
    }

    // Inserção pública
    public void inserir(int valor) {
        model.setRaiz(inserirRec(model.getRaiz(), valor));
    }

    // Recursivo, simples e claro
    private Node inserirRec(Node nodo, int valor) {
        if (nodo == null) return new Node(valor);
        if (valor < nodo.getValor()) {
            nodo.setEsquerda(inserirRec(nodo.getEsquerda(), valor));
        } else if (valor > nodo.getValor()) {
            nodo.setDireita(inserirRec(nodo.getDireita(), valor));
        } // se igual, ignora (ou trate duplicatas como quiser)
        return nodo;
    }

    // Busca por nó (retorna o Node ou null)
    public Node buscarNode(int valor) {
        Node atual = model.getRaiz();
        while (atual != null) {
            if (valor == atual.getValor()) return atual;
            atual = (valor < atual.getValor()) ? atual.getEsquerda() : atual.getDireita();
        }
        return null;
    }

    // Retorna o pai do nó que contém 'valor' (ou null se raiz ou não encontrado)
    public Node getPaiDo(int valor) {
        Node pai = null;
        Node atual = model.getRaiz();
        while (atual != null && atual.getValor() != valor) {
            pai = atual;
            atual = (valor < atual.getValor()) ? atual.getEsquerda() : atual.getDireita();
        }
        return (atual == null) ? null : pai;
    }

    // Retorna o filho esquerdo/direito do nó que contém 'valor'
    public Node getFilhoEsquerdoDo(int valor) {
        Node n = buscarNode(valor);
        return (n == null) ? null : n.getEsquerda();
    }
    public Node getFilhoDireitoDo(int valor) {
        Node n = buscarNode(valor);
        return (n == null) ? null : n.getDireita();
    }

    // Exibe informações completas de um valor (pai, filhos, raiz)
    public void exibirInfoDoValor(int valor) {
        Node n = buscarNode(valor);
        if (n == null) {
            System.out.println("Valor " + valor + " não encontrado.");
            return;
        }
        System.out.println("Nó: " + n.getValor());
        Node pai = getPaiDo(valor);
        System.out.println("Pai: " + (pai == null ? "null (é raiz ou não encontrado)" : pai.getValor()));
        System.out.println("Filho Esquerdo: " + (n.getEsquerda() == null ? "null" : n.getEsquerda().getValor()));
        System.out.println("Filho Direito: " + (n.getDireita() == null ? "null" : n.getDireita().getValor()));
        System.out.println("Raiz da árvore: " + (model.getRaiz() == null ? "null" : model.getRaiz().getValor()));
        System.out.println("--------------------------");
    }

    // Traversal in-order só pra conferir
    public void inOrder() { inOrderRec(model.getRaiz()); System.out.println(); }
    private void inOrderRec(Node n) {
        if (n == null) return;
        inOrderRec(n.getEsquerda());
        System.out.print(n.getValor() + " ");
        inOrderRec(n.getDireita());
    }
}

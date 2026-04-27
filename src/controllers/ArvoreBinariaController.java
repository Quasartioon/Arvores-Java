package controllers;
import models.ArvoreBinaria;
public class ArvoreBinariaController {
    private ArvoreBinaria model;
    public ArvoreBinariaController() {
        model = new ArvoreBinaria();
    }
    public void inserir (int valor){
        model.getArvore().add(valor);
    }
    public void exibirArvore(){
        System.out.println("Elementos da árvore:");
        for(int num : model.getArvore()){
            System.out.print(num + "  ");
        }
        System.out.println();
    }
    public Integer getPai(int indice){
        if(indice == 0 || indice >= model.getArvore().size()) return null; //Se não houver nada na árvore
        int indicePai = (indice - 1)/2;
        return model.getArvore().get(indicePai);
    }

    public Integer getEsquerda(int indice){
        int indiceEsquerda = 2 * indice + 1;
        if(indiceEsquerda < model.getArvore().size()) return model.getArvore().get(indiceEsquerda);
        return null;
    }

    public Integer getDireita(int indice){
        int indiceDireito = 2 * indice + 2;
        if (indiceDireito < model.getArvore().size()) return model.getArvore().get(indiceDireito);
        return null;
    }

    public void exibirInfoNo(int indice){
        if (indice >= model.getArvore().size()){
            System.out.println("Indice inválido!");
            return;
        }
        System.out.println("Raiz: " + model.getArvore().get(0));
        System.out.println("\nNó: " + model.getArvore().get(indice));
        System.out.println("Pai: " + getPai(indice));
        System.out.println("Filho Esquerdo: " + getEsquerda(indice));
        System.out.println("Filho Direito: " + getDireita(indice));
        System.out.println("---------------------------");
    }
}

package models;

import java.util.ArrayList;

public class ArvoreBinaria {
    private ArrayList<Integer> arvore;
    public ArvoreBinaria(){
        arvore = new ArrayList<>();
    }

    public void setArvore(ArrayList<Integer> arvore) {
        this.arvore = arvore;
    }

    public ArrayList<Integer> getArvore() {
        return arvore;
    }
}

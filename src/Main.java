import controllers.ArvoreBinariaController;
import controllers.ArvoreBinariaBuscaController;

public class Main {
    public static void main(String[] args) {
        ArvoreBinariaController arvoreBinaria = new ArvoreBinariaController();
        ArvoreBinariaBuscaController abb = new ArvoreBinariaBuscaController();

        arvoreBinaria.inserir(10);
        arvoreBinaria.inserir(20);
        arvoreBinaria.inserir(30);
        arvoreBinaria.inserir(40);
        arvoreBinaria.inserir(50);
        arvoreBinaria.inserir(60);
        arvoreBinaria.inserir(70);
        System.out.println("-----------------------------------");
        System.out.println("Arvore Binária: ");
        arvoreBinaria.exibirArvore();
        System.out.println("-----------------------------------");
        System.out.println("Informações de nós: ");
        for(int i = 0; i < 7; i++){ // 7 por que eu só inseri 7 valores na árvore
            arvoreBinaria.exibirInfoNo(i);
        }
        System.out.println("-----------------------------------");
        System.out.println("Arvore Binária de Busca: ");
        int[] valores = {10, 5, 15, 3, 7, 12, 18};
        for (int v : valores) abb.inserir(v);

        System.out.println("Arvore Binária de busca em órdem (in-order): ");
        abb.inOrder();
        System.out.println("-----------------------------------");
        System.out.println("Informação do nó 15: ");
        abb.exibirInfoDoValor(15);
        System.out.println("Informação do nó 10: ");
        abb.exibirInfoDoValor(10);
        System.out.println("Informação do nó 3: ");
        abb.exibirInfoDoValor(3);
    }
}
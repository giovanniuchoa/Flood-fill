import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
//        Matriz matriz = new Matriz(5, 5);
//
//        matriz.preencherZerosNaDiagonal();
//        matriz.preencherUnsNoRestante();
//
//        matriz.imprimirMatriz();
//
//        matriz.verificarEAtualizarNumeros();

        Pilha p = new Pilha<>(5);

        p.add("Ola Mundo");
        p.add(15);
        p.showPilha();

//
//        p.add(25);
//        p.add("lili");
    }
}

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(10, 10);

        matriz.preencherZerosNaDiagonal();
        matriz.preencherUnsNoRestante();

        matriz.imprimirMatriz();

        matriz.verificarEAtualizarNumeros();
    }
}

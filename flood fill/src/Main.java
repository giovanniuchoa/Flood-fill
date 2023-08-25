// Main.java
public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(10, 10);

        matriz.preencherZerosNaDiagonal();
        matriz.preencherUnsNoRestante();

        matriz.imprimirMatriz();

        matriz.verificarEAtualizarNumeros();
    }
}

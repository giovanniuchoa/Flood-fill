import java.util.Stack;

public class Matriz {
    private int[][] matriz;

    Stack<String> pilha = new Stack<>();

    public Matriz(int linhas, int colunas) {
        matriz = new int[linhas][colunas];
    }

    public void preencherZerosNaDiagonal() {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][matriz.length - 1 - i] = 0;
        }
    }

    public void preencherUnsNoRestante() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i != matriz.length - 1 - j) {
                    matriz[i][j] = 1;
                }
            }
        }
    }

    public void imprimirMatriz() {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void verificarEAtualizarNumeros() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == 1) {
                    matriz[i][j] = 2;
                    pilha.push(i + "," + j);
                } else if (matriz[i][j] == 0) {
                    break;
                }
            }
            System.out.println(pilha);
            imprimirMatriz();
        }
    }
}

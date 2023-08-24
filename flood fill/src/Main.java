public class Main {
    public static void main(String[] args) {

        // Cria a matriz
        int[][] matriz = new int[10][10];

        // Coloca os 0 na diagonal
        for (int i = 0; i < 10; i++) {
            matriz[i][9 - i] = 0;
        }

        // Coloca os 1 no resto
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i != 9 - j) {
                    matriz[i][j] = 1;
                }
            }
        }

        // Imprime a matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        // Verifica os números
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == 1) {
                    matriz [i][j] = 2;
                } else if (matriz[i][j] == 0 ) {
                    break;
                }

            }

            // Imprime a matriz
            for (int a = 0; a < 10; a++) {
                for (int b = 0; b < 10; b++) {
                    System.out.print(matriz[a][b] + " ");
                }
                System.out.println();
            }
            System.out.println("\n");

        }
    }
}

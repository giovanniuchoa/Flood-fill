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
    }
}

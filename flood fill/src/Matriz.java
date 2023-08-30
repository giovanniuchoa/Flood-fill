import java.util.Stack;

public class Matriz <T> {
    private int[][] matriz;
    private Pilha pilha;
    private Fila fila;
    private int colunas;
    private int linhas;


    public Matriz(int linhas, int colunas) {
        matriz = new int[linhas][colunas];
        pilha = new Pilha<>(linhas*colunas+10);
        fila = new Fila<>(linhas*colunas+1000);
        this.colunas = colunas;
        this.linhas = linhas;
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
                if (valor == 0){
                    System.out.print(ConsoleColors.RED + valor + " "+ ConsoleColors.RESET);
                }
                else if (valor == 1 ){
                    System.out.print(ConsoleColors.WHITE + valor + " "+ConsoleColors.RESET);
                }
                else {
                    System.out.print(ConsoleColors.PURPLE + valor + " "+ConsoleColors.RESET);
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    public void FloodFillFunctionPilha(int x, int y){
        int safeX = 0;
        int safeY = 0;
        Coordenadas xy = new Coordenadas(x,y);

        //VERIFICA SE A ENTRADA NÃO ESTÁ FORA DA MATRIZ EX: MATRIZ[-1][0]
        if (!xy.isValid(matriz.length, matriz[0].length)){
            throw new IllegalStateException("Coordenadas iniciais inválidas");
        }

        this.pilha.add( xy.returnCoordenadas());

        while (!this.pilha.isEmpty()){ //ENQUANTO TIVER ELEMENTOS
            xy.setXY ((int[]) this.pilha.remove());

            if (matriz[xy.getX()][xy.getY()] == 1){
                matriz[xy.getX()][xy.getY()] = 2;
            }
//            if (matriz[xy.getX()][xy.getY()] != 2){

            for (int ii = 0;ii < 4;ii++ ){
//
                switch (ii){
                    case 0:
                        xy.setX(xy.getX()+1);
                        System.out.println(xy.getX()+" "+xy.getY());

                        break;
                    case 1:
                        xy.setX(xy.getX()-2);
                        break;
                    case 2:
                        xy.setX(xy.getX()+1);
                        xy.setY(xy.getY()+1);
                        break;
                    case 3:
                        xy.setY(xy.getY()-2);
                }

                if (xy.isValid(this.linhas,this.colunas) &&  matriz[xy.getX()][xy.getY()] == 1){

                    this.pilha.add(xy.returnCoordenadas());
                }
//                this.pilha.showPilha();
            }
            xy.setY(xy.getY()-1);
            imprimirMatriz();
        }
    }

    public void FloodFillFunctionFila(int x, int y){

        Coordenadas xy = new Coordenadas(x,y);

        //VERIFICA SE A ENTRADA NÃO ESTÁ FORA DA MATRIZ EX: MATRIZ[-1][0]
        if (!xy.isValid(matriz.length, matriz[0].length)){
            throw new IllegalStateException("Coordenadas iniciais inválidas");
        }

        this.fila.add( xy.returnCoordenadas());

        while (!this.fila.isEmpty()){ //ENQUANTO TIVER ELEMENTOS
            xy.setXY ((int[]) this.fila.remove());
            if (matriz[xy.getX()][xy.getY()] == 1){
                matriz[xy.getX()][xy.getY()] = 2;
            }
//
            for (int ii = 0;ii < 4;ii++ ){
//
                switch (ii){
                    case 0:
                        xy.setX(xy.getX()+1);
                        break;
                    case 1:
                        xy.setX(xy.getX()-2);
                        break;
                    case 2:
                        xy.setX(xy.getX()+1);
                        xy.setY(xy.getY()+1);
                        break;
                    case 3:
                        xy.setY(xy.getY()-2);
                }
                if (xy.isValid(this.linhas,this.colunas) &&  matriz[xy.getX()][xy.getY()] == 1){
                    this.fila.add(xy.returnCoordenadas());
                }
//                this.fila.showFila();
            }
            xy.setY(xy.getY()-1);
            imprimirMatriz();
//            fila.showFila();

        }
    }

//    public void verificarEAtualizarNumeros() {
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[0].length; j++) {
//                if (matriz[i][j] == 1) {
//                    matriz[i][j] = 2;
//                    pilha.push(i + "," + j);
//                } else if (matriz[i][j] == 0) {
//                    break;
//                }
//            }
//            System.out.println(pilha);
//            imprimirMatriz();
//        }
//    }

    public int getColunas() {
        return colunas;
    }

    public int getLinhas() {
        return linhas;
    }
    
}

public class Coordenadas {
    private int x;
    private int y;

    public Coordenadas(){
        this.x = 0;
        this.y = 0;
    }

    public Coordenadas(int x,int y){
        this.x = x;
        this.y = y;
    }

    public boolean isValid(int xMax,int yMax){
        if ((x>=0 && x<xMax)&&(y>=0 && y<yMax)){
            return true;
        }
        return false;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int[] xy){
        setX(xy[0]);
        setY(xy[1]);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int[] returnCoordenadas(){
        int[] retorno = new int[2];
        retorno[0] = getX();
        retorno[1] = getY();
        return retorno;
    }
}

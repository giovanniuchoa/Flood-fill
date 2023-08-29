public class Fila <T>{
    private T[] data;
    private int topo;
    private int base;
    private int tamanho;

    public Fila(int tamanho){
        topo = -1;
        base = 0;
        this.tamanho = tamanho;
        this.data = (T[]) new Object[tamanho];

    }
    public void add(T data);
    public T remove();
    public boolean isEmpty();
    public boolean isFull();

    public void clear(){
        for (int i = 0; i<data.length;i++){
            this.data[i] = null;
        }
        topo = -1;
    }
    public void setBase(int base) {
        this.base = base;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getBase() {
        return base;
    }

    public int getTopo() {
        return topo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public T[] getData() {
        return data;
    }
}

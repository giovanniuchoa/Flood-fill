public class Fila <T>{
    private T[] data;
    private int topo;
    private int base;
    private int tamanhoAtual;

    public Fila(int capacidadeTotal){
        topo = -1;
        base = 0;
        this.tamanhoAtual = 0;
        this.data = (T[]) new Object[capacidadeTotal];

    }
    public void add(T data){
        if (isFull()){
            throw new IllegalStateException("A fila está cheia.");
        }

        setTopo((getTopo()+1)% getData().length);
        this.data[getTopo()] = data;
        setTamanhoAtual(tamanhoAtual + 1);
    }
    public T remove(){
        if (isEmpty()){
            throw new IllegalStateException("A fila está vazia.");
        }
        T retorno = this.data[getBase()];
        this.data[getBase()] = null;

        setBase(base + 1);
        setTamanhoAtual(tamanhoAtual - 1);
        return retorno;
    }
    public boolean isEmpty(){
        if (getTamanhoAtual() == 0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(getTamanhoAtual() == data.length){
            return true;
        }
        return false;
    }

    public void clear(){
        for (int i = 0; i<data.length;i++){
            this.data[i] = null;
        }
        setTopo(-1);
    }
    public void showFila(){

        System.out.println("Topo: "+getTopo()+" Base: "+getBase());
        for (int i = 0; i<data.length;i++){
            if ( data[i] != null){
                System.out.println(i + " - "+data[i].toString());
            }else {
                System.out.println(i+" - Null");
            }
        }
    }

    public int getTamanhoAtual() {
        return tamanhoAtual;
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

    public void setTamanhoAtual(int tamanho) {
        this.tamanhoAtual = tamanho;
    }

    public int getBase() {
        return base;
    }

    public int getTopo() {
        return topo;
    }

    public int getTamanho() {
        return tamanhoAtual;
    }

    public T[] getData() {
        return data;
    }
}

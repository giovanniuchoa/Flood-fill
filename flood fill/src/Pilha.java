public class Pilha <T> {
    private T[] data;
    private int topo;
    private int tamanho;
    public Pilha(int tamanho){
        topo = -1;
        this.tamanho = tamanho;
        this.data = (T[]) new Object[tamanho];
    }

    public boolean isEmpty() {
        if(getTamanho() == -1){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (getTamanho()==topo+1){
            return true;
        }
        return false;
    }

    public void add(T data) {
        if (isFull()){
            System.out.print("A pilha está cheia");
            return;
        }
        topo += 1;
        this.data[topo] = data;
    }
    public T remove(){
        if (isEmpty()){
            System.out.println("Pilha vazia");
            return null;
        }
        T retorno = this.data[topo] ;
        this.data[topo] = null;
        topo -= 1;

        return retorno;
    }

    public void clear(){
        for (int i = 0; i<data.length;i++){
            this.data[i] = null;
        }
        topo = -1;
    }
    public void showPilha(){
        for (int i = 0; i<topo+1;i++){
            System.out.println(i+ " - "+ data[i].toString());
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getTopo() {
        return topo;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }
}
public  class Pilha <T> {
    private T[] data;
    private int topo;

    public Pilha(int capacidadeTotal){
        topo = -1;
        this.data = (T[]) new Object[capacidadeTotal];
    }

    public boolean isEmpty() { //VERIFICA SE A PILHA ESTÁ VAZIA
        if(getTopo() == -1){
            return true;
        }
        return false;
    }

    public boolean isFull() { //VERIFICA SE A PILHA ESTÁ CHEIA

        if (getTopo()+1 == getData().length){
            return true;
        }
        return false;
    }

    public void add(T data) { //ADICIONA UM ELEMENTO A PILHA
        if (isFull()){
            throw new IllegalStateException("A Pilha está cheia.");
        }
        this.data[getTopo()+1] = data;
        setTopo(getTopo() + 1);

    }
    public T remove(){ //REMOVE UM ELEMENTO A PILHA
        if (isEmpty()){
            throw new IllegalStateException("A Pilha está vazia.");
        }
        T retorno = this.data[getTopo()];
        this.data[getTopo()] = null;
        setTopo(getTopo() - 1);
        return retorno;
    }

    public void clear(){ // LIMPA TODAS AS POSIÇÕES DA PILHA
        for (int i = 0; i<data.length;i++){
            this.data[i] = null;
        }
        setTopo(-1);
    }
    public void showPilha(){ //IMPRIME A PILHA
        System.out.println("Topo: "+getTopo());
        for (int i = 0; i<getTopo()+1;i++){
            System.out.println(i+ " - "+ data[i].toString());
        }
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

    public void setTopo(int topo) {
        this.topo = topo;
    }
}
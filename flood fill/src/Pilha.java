public class Pilha <T> {

    private T[] valores;
    private int topo;

    public Pilha(int tamanho) {
        topo = -1;
        valores = new T[tamanho];

    }
    public void mostrar(){
        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
    }
    public void add (T entrada){
        if (isFull()){
            return ;
        }
        topo = topo + 1;
        valores[topo] = entrada;

    }

    public T remove(){
        if (isEmpty()){
            return null;
        }
        T retorno = valores[topo];
        valores[topo] = null;
        topo = topo -1;
        return retorno;
    }

    public boolean isFull(){
        if(topo + 1 == valores.length){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(topo == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public void clear() {
        for (int i = 0; i < valores.length; i++){
            valores[i] = null;
        }
    }
}
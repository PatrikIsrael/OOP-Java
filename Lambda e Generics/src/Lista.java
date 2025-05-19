

public class Lista <T> {
    private int qtde;
    private T elementos [];

    public Lista (int capacidade) {
        this.elementos = (T[]) new Object [capacidade];
    }
    public T get(int indice) {
        return indice >= qtde ? null : elementos[indice];
    }
    public boolean adicionar(T objeto){
        if (qtde == getCapacidade()) return false;

        elementos[qtde ++] = objeto;
        return true;
    }
    public int getCapacidade(){
        return elementos.length;
    }
    public int getQtde(){
        return qtde;
    }

}


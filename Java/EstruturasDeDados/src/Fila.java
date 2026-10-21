import java.util.ArrayList;

public class Fila {
    // Fila de supermercado - FIFO(First in, first out)
    ArrayList<Integer> fila;
    public Fila() {
        fila = new ArrayList<>();
    }

    public void enqueue(int item){
        fila.add(item);
    }

    public int dequeue(){
        if (fila.isEmpty()){
            throw new RuntimeException("Fila vazia");
        }
        return fila.remove(0);
    }

    public int peek(){
        if (fila.isEmpty()){
            throw new RuntimeException("Fila vazia");
        }
        return fila.get(0);
    }

    public boolean estaVazia(){
        return fila.isEmpty();
    }

    public int tamanho(){
        return fila.size();
    }
}

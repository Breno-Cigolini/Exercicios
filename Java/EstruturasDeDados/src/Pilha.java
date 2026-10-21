import java.util.ArrayList;

public class Pilha {
    // Empilhar pratos - LIFO (Last in, first out)
    ArrayList<Integer> pratos;

    public Pilha(){
        pratos = new ArrayList<>();
    }

    public void addPrato(int numPrato) {
        pratos.add(numPrato);
    }

    public int removerUltimoPrato(){
        if (pratos.size() == 0){
            throw new RuntimeException("Pilha vazia");
        }
        return pratos.remove(pratos.size()-1);
    }

    public int ultimoPrato(){
        if (pratos.size() == 0){
            throw new RuntimeException("Pilha vazia");
        }
        return pratos.get(pratos.size()-1);
    }

    public boolean estaVazia(){
        return pratos.isEmpty();
        // ou
        // return pratos.size() == 0;
    }

    public int tamanho(){
        return pratos.size();
    }
}

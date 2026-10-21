import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        // vetor controlado com índice com ordem livre
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(10);
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println(numeros.remove(numeros.size()-1));
        System.out.println(numeros);
    }
}

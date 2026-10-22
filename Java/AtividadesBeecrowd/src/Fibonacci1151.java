import java.util.Scanner;

public class Fibonacci1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anterior = 0, atual = 1, prox = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print(anterior);
            if (i < n-1){
                System.out.print(" ");
            }
            prox = anterior + atual;
            anterior = atual;
            atual = prox;
        }
        System.out.println();
    }
}

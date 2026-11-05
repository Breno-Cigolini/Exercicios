import java.util.Scanner;

public class SomaParesConsecutivos1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, cont = 0, soma = 0;

        do{
            x = sc.nextInt();
            if (x != 0) {
                for (int i = x; cont != 5; i++) {
                    if (i % 2 == 0) {
                        cont++;
                        soma += i;
                    }
                }
                System.out.println(soma);
                cont = 0;
                soma = 0;
            }
        } while (x != 0);
    }
}

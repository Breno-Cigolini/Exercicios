import java.util.Scanner;

public class SomaImparesConsecutivos1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, y, soma = 0;

        for (int z = 0; z < n; z++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x <= y) {
                for (int i = x + 1; i < y; i++) {
                    if (i % 2 == 1) {
                        soma += i;
                    }
                }
                System.out.println(soma);
                soma = 0;
            } else {
                for (int i = y + 1; i < x; i++) {
                    if (i % 2 == 1) {
                        soma += i;
                    }
                }
                System.out.println(soma);
                soma = 0;
            }
        }
    }
}

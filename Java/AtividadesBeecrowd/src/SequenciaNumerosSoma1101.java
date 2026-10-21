import java.util.Scanner;

public class SequenciaNumerosSoma1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, soma = 0;
        do {
            m = sc.nextInt();
            n = sc.nextInt();

            if (m <= 0 || n <= 0) break;

            if (m > n) {
                    for (int i = n; i <= m; i++) {
                        System.out.printf(i + " ");
                        soma += i;
                    }
                    System.out.println("Sum="+soma);
                    soma = 0;
            }else {
                    for (int i = m; i <= n; i++) {
                        System.out.printf(i + " ");
                        soma += i;
                    }
                    System.out.println("Sum="+soma);
                    soma = 0;
            }

        } while (m > 0 && n > 0);
    }
}
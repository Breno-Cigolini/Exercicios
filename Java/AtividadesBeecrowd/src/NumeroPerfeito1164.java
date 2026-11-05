import java.util.Scanner;

public class NumeroPerfeito1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 0; j < n; j++){
            int num = sc.nextInt();
            int soma = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    soma += i;
                }
            }

            if (soma == num) {
                System.out.println(num + " eh perfeito");
            } else {
                System.out.println(num + " nao eh perfeito");
            }
        }
    }
}

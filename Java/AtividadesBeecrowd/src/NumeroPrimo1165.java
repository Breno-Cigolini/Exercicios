import java.util.Scanner;

public class NumeroPrimo1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int j = 0; j < n; j++) {
            int num = sc.nextInt();
            boolean primo = num >= 2;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(num + " eh primo");
            } else {
                System.out.println(num + " nao eh primo");
            }
        }
    }
}

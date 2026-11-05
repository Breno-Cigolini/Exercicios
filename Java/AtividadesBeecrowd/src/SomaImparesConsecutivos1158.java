import java.util.Scanner;

public class SomaImparesConsecutivos1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int j = 0; j < n; j++){
            int cont = 0, soma = 0;
            int x = sc.nextInt(), y = sc.nextInt();
            for (int i = x; cont != y; i++) {
                if (i % 2 != 0) {
                    cont++;
                    soma += i;
                }
            }
            System.out.println(soma);
        }
    }
}

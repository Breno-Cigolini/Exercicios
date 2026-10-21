import java.util.Scanner;

public class Lanche1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod = sc.nextInt(), qnt = sc.nextInt();
        double[] precos = {4, 4.5, 5, 2, 1.5};
        double total = precos[cod-1] * qnt;
        System.out.printf("Total: R$ %.2f\n", total);
    }
}

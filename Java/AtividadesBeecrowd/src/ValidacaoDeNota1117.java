import java.util.Scanner;

public class ValidacaoDeNota1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;
        do {
            n1 = sc.nextDouble();
            if (n1 < 0 || n1 > 10) {
                System.out.println("nota invalida");
            }
            else {
                do {
                n2 = sc.nextDouble();
                if (n2 < 0 || n2 > 10) {
                    System.out.println("nota invalida");
                }
                else {
                    double media = (n1 + n2) / 2;
                    System.out.println("media = " + media);
                }
                } while (n2 < 0 || n2 > 10);
            }
        } while (n1 < 0 || n1 > 10);
    }
}

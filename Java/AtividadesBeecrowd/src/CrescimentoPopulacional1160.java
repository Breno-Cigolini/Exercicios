import java.util.Scanner;

public class CrescimentoPopulacional1160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            int pa = sc.nextInt(), pb = sc.nextInt();
            double g1 = sc.nextDouble(), g2 = sc.nextDouble();
            int anos = 0;

            while (pa <= pb && anos <= 100) {
                pa += (int) (pa * g1 / 100);
                pb += (int) (pb * g2 / 100);
                anos++;
            }

            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }
    }
}
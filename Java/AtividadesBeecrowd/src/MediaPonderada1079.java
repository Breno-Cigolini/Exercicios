import java.util.Scanner;

public class MediaPonderada1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            double p1 = sc.nextDouble(), p2 = sc.nextDouble(), p3 = sc.nextDouble();
            double media = (p1 * 2 + p2 * 3 + p3 * 5) / (2+3+5);
            System.out.printf("%.1f\n", media);
        }
    }
}

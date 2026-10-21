import java.util.Scanner;

public class DividindoXporY1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 0, y = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n;i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0) {
                System.out.println("divisao impossivel");
            } else {
                double total = x / y;
                System.out.println(total);
            }
        }
    }
}

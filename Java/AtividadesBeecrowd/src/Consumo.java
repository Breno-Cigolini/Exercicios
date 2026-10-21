import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();

        double consumo = x / y;

        System.out.printf("%.3f km/l\n", consumo);
    }
}

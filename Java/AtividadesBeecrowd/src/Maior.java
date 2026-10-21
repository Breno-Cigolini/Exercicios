import java.util.Scanner;

import static java.lang.Math.abs;

public class Maior {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), x = sc.nextInt(), b = sc.nextInt();
        int maiorAB = (a + b + abs(a-b)) / 2;
        int maior = (maiorAB + x + abs(maiorAB-x))/2;
        System.out.printf("%d eh o maior\n", maior);

    }
}

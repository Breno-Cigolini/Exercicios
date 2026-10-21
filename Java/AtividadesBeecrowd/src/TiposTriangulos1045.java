import java.util.Scanner;

public class TiposTriangulos1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double maior = Math.max(a, Math.max(b, c));
        double menor = Math.min(a, Math.min(b, c));
        double meio;
        if ((a >= b && a <= c) || (a <= b && a >= c)) meio = a;
        else if ((b >= a && b <= c) || (b <= a && b >= c)) meio = b;
        else meio = c;

        a = maior;
        b = meio;
        c = menor;

        if (a >= (b + c)){
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || b == c || a == c){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}

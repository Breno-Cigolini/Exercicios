import java.util.Scanner;

public class Triangulo1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(),b = sc.nextDouble(), c = sc.nextDouble();
        double perimetro, area;
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            perimetro = a +  b + c;
            System.out.println("Perimetro = " + perimetro);
        }
        else {
            area = (a+ b) * c / 2;
            System.out.println("Area = " + area);
        }
    }
}

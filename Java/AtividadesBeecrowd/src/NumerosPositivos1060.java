import java.util.Scanner;

public class NumerosPositivos1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        double v1 = sc.nextDouble(), v2 = sc.nextDouble(), v3 = sc.nextDouble(), v4 = sc.nextDouble(), v5 = sc.nextDouble(), v6 = sc.nextDouble();
        if (v1 > 0){
            cont++;
        }
        if (v2 > 0){
            cont++;
        }
        if (v3 > 0){
            cont++;
        }
        if (v4 > 0){
            cont++;
        }
        if (v5 > 0){
            cont++;
        }
        if (v6 > 0){
            cont++;
        }
        System.out.println(cont + " valores positivos");
    }
}

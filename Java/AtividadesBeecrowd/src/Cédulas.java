import java.util.Scanner;

public class Cédulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas100 = 0, notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0, notas1 = 0;
        int cedulas = sc.nextInt();

        System.out.println(cedulas);

        while (cedulas > 0){
            if (cedulas >= 100){
                cedulas = cedulas - 100;
                notas100 ++;
            } else if (cedulas >= 50){
                cedulas = cedulas - 50;
                notas50 ++;
            } else if (cedulas >= 20){
                cedulas = cedulas - 20;
                notas20 ++;
            } else if (cedulas >= 10){
                cedulas = cedulas - 10;
                notas10 ++;
            } else if (cedulas >= 5){
                cedulas = cedulas - 5;
                notas5 ++;
            } else if (cedulas >= 2){
                cedulas = cedulas - 2;
                notas2 ++;
            } else {
                cedulas = cedulas - 1;
                notas1 ++;
            }
        }
        System.out.printf(notas100 + " nota(s) de R$ 100,00\n");
        System.out.printf(notas50 + " nota(s) de R$ 50,00\n");
        System.out.printf(notas20 + " nota(s) de R$ 20,00\n");
        System.out.printf(notas10 + " nota(s) de R$ 10,00\n");
        System.out.printf(notas5 + " nota(s) de R$ 5,00\n");
        System.out.printf(notas2 + " nota(s) de R$ 2,00\n");
        System.out.printf(notas1 + " nota(s) de R$ 1,00\n");

    }
}

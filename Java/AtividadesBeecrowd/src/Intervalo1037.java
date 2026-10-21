import java.util.Scanner;

public class Intervalo1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        String intervalo;
        if (num >= 0 && num <= 25){
            intervalo = "[0,25]";
            System.out.println("Intervalo " + intervalo);
        } else if  (num > 25 && num <= 50){
            intervalo = "(25,50]";
            System.out.println("Intervalo " + intervalo);
        } else if (num > 50 && num <= 75) {
            intervalo = "(50,75]";
            System.out.println("Intervalo " + intervalo);
        } else if (num > 75 && num <= 100){
            intervalo = "(75,100]";
            System.out.println("Intervalo " + intervalo);
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}

import java.util.Scanner;

public class NotasMoedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas100 = 0, notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0;
        int moeda1 = 0, moeda50 = 0, moeda25 = 0, moeda10 = 0, moeda05 = 0, moeda01 = 0;
        double valorDouble = sc.nextDouble();

        long valor = Math.round(valorDouble * 100);

        while (valor > 0){
            if (valor >= 10000){
                notas100++;
                valor -= 10000;
            }
            else if (valor >= 5000){
                notas50++;
                valor -= 5000;
            }
            else if (valor >= 2000){
                notas20++;
                valor -= 2000;
            }
            else if (valor >= 1000){
                notas10++;
                valor -= 1000;
            }
            else if (valor >= 500){
                notas5++;
                valor -= 500;
            }
            else if (valor >= 200){
                notas2++;
                valor -= 200;
            }
            else if (valor >= 100){
                moeda1++;
                valor -= 100;
            }
            else if (valor >= 50){
                moeda50++;
                valor -= 50;
            }
            else if (valor >= 25){
                moeda25++;
                valor -= 25;
            }
            else if (valor >= 10){
                moeda10++;
                valor -= 10;
            }
            else if (valor >= 5){
                moeda05++;
                valor -= 5;
            }
            else {
                moeda01++;
                valor -= 1;
            }
        }

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda05 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");
    }
}
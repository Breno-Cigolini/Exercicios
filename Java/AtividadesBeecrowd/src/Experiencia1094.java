import java.util.Scanner;

public class Experiencia1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), qnt;
        String tipo;
        int soma = 0, coelho = 0, rato = 0, sapo = 0;

        for (int i = 0; i < num; i++) {
            qnt = sc.nextInt();
            tipo = sc.next();
            soma += qnt;
            if (tipo.equalsIgnoreCase("C")) {
                coelho += qnt;
            } else if (tipo.equalsIgnoreCase("R")) {
                rato += qnt;
            } else if (tipo.equalsIgnoreCase("S")) {
                sapo += qnt;
            }
        }

        System.out.println("Total: " + soma + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %%%n", (coelho * 100.0) / soma);
        System.out.printf("Percentual de ratos: %.2f %%%n", (rato * 100.0) / soma);
        System.out.printf("Percentual de sapos: %.2f %%%n", (sapo * 100.0) / soma);
    }
}

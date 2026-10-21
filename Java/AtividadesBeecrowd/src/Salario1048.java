import java.util.Scanner;

public class Salario1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double reajuste, salario = sc.nextDouble();

        if (salario <= 400.00){
            reajuste = 0.15;
        } else if (salario > 400.00 && salario <= 800.00){
            reajuste = 0.12;
        } else if (salario > 800.00 && salario <= 1200.00){
            reajuste = 0.10;
        } else if (salario > 1200.00 && salario <= 2000.00){
            reajuste = 0.07;
        } else {
            reajuste = 0.04;
        }
        System.out.printf("Novo salario: %.2f\n", (salario * reajuste + salario));
        System.out.printf("Reajuste ganho: %.2f\n", Math.ceil(salario * reajuste - reajuste));
        System.out.printf("Em percentual: %.0f", (reajuste * 100));
        System.out.println("%");
    }
}

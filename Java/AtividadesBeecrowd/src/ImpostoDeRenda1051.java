import java.util.Scanner;

public class ImpostoDeRenda1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imposto = 0.0, salario = sc.nextDouble();

        if (salario <= 2000){
            System.out.println("Isento");
        }
        else {
            if (salario > 4500){
                imposto += (salario - 4500) * 0.28;
                salario = 4500;
            }
            if (salario > 3000){
                imposto += (salario - 3000) * 0.18;
                salario = 3000;
            }
            if (salario > 2000){
                imposto += (salario - 2000) * 0.08;
                salario = 2000;
            }
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}

import java.util.Scanner;

public class Media3_1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble(), n4 = sc.nextDouble();
        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 + 1);

        if (media >= 7) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        } else {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            double notaExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            media = (media + notaExame) / 2;
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", media);
        }
    }
}

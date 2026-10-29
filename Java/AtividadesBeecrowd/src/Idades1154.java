import java.util.Scanner;

public class Idades1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        double idades = 0, num = 0;

        do {
            idade = sc.nextInt();
            if (idade >= 0) {
                idades += idade;
                num++;
            }
        } while (idade >= 0);
        double media = idades / num;
        System.out.printf("%.2f\n", media);


    }
}

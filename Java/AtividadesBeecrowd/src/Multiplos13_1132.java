import java.util.Scanner;

public class Multiplos13_1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, n1 = sc.nextInt(), n2 = sc.nextInt();
        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);
        for (int i = menor; i < maior; i++){
            if (i % 13 != 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}

import java.util.Scanner;

public class TempoDeJogo1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int cont = 0;
        if (a > b) {
            while (a != 24) {
                cont++;
                a++;
            }
            a = 0;
            while (a != b){
                a++;
            }
            cont += a;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", cont);
        }
        else if (a < b){
            while (a != b) {
                a++;
                cont++;
            }
            System.out.printf("O JOGO DUROU %d HORA(S)\n", cont);
        }
        else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}

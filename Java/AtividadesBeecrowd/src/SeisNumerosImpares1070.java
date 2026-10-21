import java.util.Scanner;

public class SeisNumerosImpares1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0, num = sc.nextInt();

        for (int i = num; cont < 6; i++){
            if (i % 2 != 0) {
                System.out.println(i);
                cont++;
            }
        }
    }
}

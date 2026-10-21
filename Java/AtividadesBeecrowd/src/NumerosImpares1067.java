import java.util.Scanner;

public class NumerosImpares1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}

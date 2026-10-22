import java.util.Scanner;

public class Fatorial1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        for (int i = n; i > 1; i--){
            f *= i;
        }
        System.out.println(f);
    }
}

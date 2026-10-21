import java.util.Scanner;

public class PUM1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), linhas = 0, x = 0;

        while (linhas != n){
            x++;
            if (x % 4 == 0){
                System.out.println("PUM");
                linhas++;
            }
            else {
                System.out.printf(x+" ");
            }
        }
    }
}

import java.util.Scanner;

public class CrescenteDecrescente1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;

        do {
            x = sc.nextInt(); y = sc.nextInt();
            if (x > y){
                System.out.println("Decrescente");
            }
            else if (y > x){
                System.out.println("Crescente");
            }
            else {
                return;
            }
        } while (x != y);
    }
}

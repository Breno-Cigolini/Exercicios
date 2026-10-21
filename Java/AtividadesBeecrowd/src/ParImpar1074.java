import java.util.Scanner;

public class ParImpar1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), num;

        for (int i = 0; i < n; i++){
            num = sc.nextInt();
            if (num == 0){
                System.out.println("NULL");
            }
            else {
                if (num % 2 == 0) {
                    System.out.print("EVEN ");
                } else {
                    System.out.print("ODD ");
                }
                if (num > 0) {
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            }
        }
    }
}

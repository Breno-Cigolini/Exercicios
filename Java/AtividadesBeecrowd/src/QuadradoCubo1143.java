import java.util.Scanner;

public class QuadradoCubo1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, n = sc.nextInt();

        while (i != n+1){
            System.out.printf(i+" "+ i*i+" " + i*i*i+"\n");
            i++;
        }
    }
}

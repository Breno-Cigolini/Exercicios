import java.util.Scanner;

public class RestoDivisao1133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int menor = Math.min(x, y);
        int maior = Math.max(x, y);
        for (int i = menor+=1; i < maior; i++){
            if (i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
        }
    }
}

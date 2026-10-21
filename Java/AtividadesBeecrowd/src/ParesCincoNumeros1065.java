import java.util.Scanner;

public class ParesCincoNumeros1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont = 0;
        for (int i = 0; i < 5; i++){
            num = sc.nextInt();
            if (num % 2 == 0){
                cont++;
            }
        }
        System.out.println(cont + " valores pares");
    }
}

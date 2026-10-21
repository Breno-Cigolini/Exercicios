import java.util.Scanner;

public class SomaDeImpares1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int soma = 0;
        if (x > y){
            y++;
            for (int i = y; y < x; y++){
                if (y % 2 != 0){
                    soma+=y;
                }
            }
        }

        System.out.println(soma);
    }
}

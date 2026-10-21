import java.util.Scanner;

public class Intervalo1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), num, in = 0 , out = 0;

        for (int i = 0; i < x; i++){
            num = sc.nextInt();
            if (num >= 10 && num <= 20){
                in++;
            }
            else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}

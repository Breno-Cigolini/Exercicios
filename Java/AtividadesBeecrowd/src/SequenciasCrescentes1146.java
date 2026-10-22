import java.util.Scanner;

public class SequenciasCrescentes1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = -1, i;

        do {
            x = sc.nextInt();
            for (i = 1; i <= x; i++) {
                System.out.print(i);
                if (i!=x){
                    System.out.print(" ");
                }
                else {
                    System.out.println();
                }
            }
        } while (x != 0);
    }
}

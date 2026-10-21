import java.util.Scanner;

public class SequenciaLogica1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, n = sc.nextInt();

        while (i != n+1){
            System.out.printf(i+" "+ i*i+" " + i*i*i+"\n");
            System.out.printf(i+" "+ (i*i+1)+" " + (i*i*i+1)+"\n");
            i++;
        }
    }
}

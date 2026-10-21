import java.util.Scanner;

public class ConversãoDeTempo {
    public static void main(String[] args) {
        int horas = 0, minutos = 0, segundos = 0;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {
            if (n >= 3600) {
                horas++;
                n = n - 3600;
            } else if (n >= 60) {
                minutos++;
                n = n - 60;
            } else {
                n--;
                segundos++;
            }
        }
        System.out.println(horas+ ":"+ minutos + ":" + segundos);
    }
}

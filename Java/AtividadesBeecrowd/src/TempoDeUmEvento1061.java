import java.util.Scanner;

public class TempoDeUmEvento1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.next();
        int dia0 = sc.nextInt();

        int hora0 = sc.nextInt();
        sc.next();
        int minuto0 = sc.nextInt();
        sc.next();
        int segundo0 = sc.nextInt();

        sc.next();
        int dia = sc.nextInt();

        int hora = sc.nextInt();
        sc.next();
        int minuto = sc.nextInt();
        sc.next();
        int segundo = sc.nextInt();

        int inicio = dia0 * 24 * 60 * 60 + hora0 * 60 * 60 + minuto0 * 60 + segundo0;
        int fim = dia * 24 * 60 * 60 + hora * 60 * 60 + minuto * 60 + segundo;
        int duracao = fim - inicio;

        int dias = duracao / 86400;
        duracao %= 86400;

        int horas = duracao / 3600;
        duracao %= 3600;

        int minutos = duracao / 60;

        int segundos = duracao % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}

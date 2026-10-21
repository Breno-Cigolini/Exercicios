import java.util.Scanner;

public class TempoDeJogoComMinutos1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora0 = sc.nextInt(), minuto0 = sc.nextInt(), hora = sc.nextInt(), minuto = sc.nextInt();

        if (hora0 == hora && minuto0 == minuto){
            hora = 24;
            minuto = 0;
        }
        else if (hora0 == hora && minuto0 < minuto){
            hora = 0;
            minuto -= minuto0;
        }
        else if (hora0 == hora && minuto0 > minuto){
            minuto += 60;
            minuto -= minuto0;
            hora = 24;
            hora--;
        }
        else {
            if (hora0 > hora){
                hora += 24;
                hora -= hora0;
            }
            else if (hora0 < hora){
                hora -= hora0;
            }

            if (minuto0 > minuto){
                minuto += 60;
                minuto -= minuto0;
                hora--;
            }
            else if (minuto0 < minuto){
                minuto -= minuto0;
            }
        }

        System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)\n");
    }
}

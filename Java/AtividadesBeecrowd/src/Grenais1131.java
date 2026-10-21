import java.util.Scanner;

public class Grenais1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int golsInter, golsGremio, loop = 0, partidas = 1, empate = 0, inter = 0, gremio = 0;

        do {
            golsInter = sc.nextInt(); golsGremio = sc.nextInt();
            if (golsInter > golsGremio){
                inter++;
            }
            else if (golsGremio > golsInter){
                gremio++;
            }
            else {
                empate++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            loop = sc.nextInt();
            if (loop == 1){
                partidas++;
            }
        } while (loop != 2);

        System.out.println(partidas + " grenais");
        System.out.println("Inter:"+inter);
        System.out.println("Gremio:"+gremio);
        System.out.println("Empates:"+empate);
        if (inter > gremio){
            System.out.println("Inter venceu mais");
        }
        else if (gremio > inter){
            System.out.println("Gremio venceu mais");
        }
        else {
            System.out.println("Nao houve vencedor");
        }
    }
}

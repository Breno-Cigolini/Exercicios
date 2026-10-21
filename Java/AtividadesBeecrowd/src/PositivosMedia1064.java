import java.util.ArrayList;
import java.util.Scanner;

public class PositivosMedia1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> positivos = new ArrayList<>();
        int cont = 0;
        double num, media = 0;
        for (int i = 0; i < 6; i++){
            num = sc.nextDouble();
            if (num > 0){
                positivos.add(num);
                cont++;
                media += num;
            }

        }
        System.out.println(cont + " valores positivos");
        if (cont > 0) {
            media = media / cont;
            System.out.printf("%.1f\n", media);
        } else {
            System.out.println("Nenhum valor positivo informado.");
        }
    }
}

import java.util.Scanner;

public class TiposCombustivel1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, alcool=0, gasolina=0, diesel=0;

        do {
            r = sc.nextInt();
            if (r == 1){
                alcool++;
            } else if (r == 2){
                gasolina++;
            }else if (r == 3){
                diesel++;
            }
        }while (r != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }
}

import java.util.Scanner;

public class ParesImparesPositivosNegativos1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, par = 0, impar = 0, positivo = 0, negativo = 0;

        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            if (num == 0){
                par++;
            }
            else {
                if (num % 2 == 0){
                    par++;
                }
                else {
                    impar++;
                }
                if (num > 0){
                    positivo++;
                }
                else {
                    negativo++;
                }
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}

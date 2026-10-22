import java.util.Scanner;

public class UltrapassandoZ1150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma,z,cont = 1, x = sc.nextInt();
        do {
            z = sc.nextInt();
        } while (z <= x);

        soma = x;
        while (soma <= z){
            soma += x+cont;
            cont++;
        }
        System.out.println(cont);
    }
}

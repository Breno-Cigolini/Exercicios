import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anos = 0, meses = 0, dias = 0;
        int idade = sc.nextInt();

        while (idade > 0){
            if (idade >= 365){
                idade -= 365;
                anos++;
            } else if (idade >= 30){
                idade -= 30;
                meses++;
            } else {
                idade--;
                dias++;
            }
        }

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}

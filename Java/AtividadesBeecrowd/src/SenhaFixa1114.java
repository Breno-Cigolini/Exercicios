import java.util.Scanner;

public class SenhaFixa1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 0;
        while (senha != 2002){
            senha = sc.nextInt();
            if (senha == 2002){
                System.out.println("Acesso Permitido");
            }
            else {
                System.out.println("Senha Invalida");
            }
        }
    }
}

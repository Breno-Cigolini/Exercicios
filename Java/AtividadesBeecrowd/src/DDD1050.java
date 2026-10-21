import java.util.HashMap; import java.util.Map; import java.util.Scanner;

public class DDD1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Map<Integer, String> ddd = new HashMap<>();
        ddd.put(61, "Brasilia");
        ddd.put(71, "Salvador");
        ddd.put(11, "Sao Paulo");
        ddd.put(21, "Rio de Janeiro");
        ddd.put(32, "Juiz de Fora");
        ddd.put(19, "Campinas");
        ddd.put(27, "Vitoria");
        ddd.put(31, "Belo Horizonte");
        boolean b = ddd.containsKey(num);

        if (b){
            System.out.println(ddd.get(num));
        }
        else {
            System.out.println("DDD nao cadastrado");
        }
    }
}

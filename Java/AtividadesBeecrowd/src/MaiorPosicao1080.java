import java.util.ArrayList;
import java.util.Scanner;

public class MaiorPosicao1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();
        int num, maior = 0, index = 0;
        for (int i = 0; i < 100; i++){
            num = sc.nextInt();
            n.add(num);
        }
        for (int i = 0; i < n.size(); i++){
            if (n.get(i) > maior){
                maior = n.get(i);
                index = i+1;
            }
        }
        System.out.println(maior);
        System.out.println(index);
    }
}

public class Sequencia1_1095a1098 {
    public static void main(String[] args) {
        for (int passo = 0; passo <= 10; passo++) {
            double i = passo * 0.2;
            for (int k = 1; k <= 3; k++) {
                double j = k + i;
                System.out.println("I=" + i + " J=" + j);
            }
        }

    }
}

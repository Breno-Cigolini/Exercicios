import java.util.Scanner;

public class Animais1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String animal1 = sc.next(), animal2 = sc.next(), animal3 = sc.next();

        if (animal1.equals("vertebrado")){
            if (animal2.equals("ave")){
                if (animal3.equals("carnivoro")){
                    System.out.println("aguia");
                }
                else if (animal3.equals("onivoro")){
                    System.out.println("pomba");
                }
            } else if (animal2.equals("mamifero")){
                if (animal3.equals("onivoro")){
                    System.out.println("homem");
                }
                else if (animal3.equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }

        else if(animal1.equals("invertebrado")){

            if (animal2.equals("inseto")){

                if(animal3.equals("hematofago")){
                    System.out.println("pulga");
                }
                else if (animal3.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }

            else if(animal2.equals("anelideo")){
                if (animal3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                else if (animal3.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
    }
}

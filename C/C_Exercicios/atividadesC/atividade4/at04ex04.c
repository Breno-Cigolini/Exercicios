#include <stdio.h>

int main(){
    int n, cont1 = 0, cont2 = 0, cont3 = 0;
    printf("Informe valores... [informe 100 para parar]\n");
    do{
        printf("-> ");
        scanf("%d", &n);

        if (n == 100){
            break;
        }
        else if (n > 40 && n < 80){
            cont1 = cont1 + 1;
        } 
        
        else if (n == 40 || n == 80) {
            cont2 = cont2 + 1;
        } 
        
        else {
            cont3 = cont3 + 1;
        }

    } while (1);

    printf("%d, numeros no intervalo de 40 a 80.\n", cont1);
    printf("%d, numeros iguais a 40 ou 80.\n", cont2);
    printf("%d, numeros fora do intervalo de 40 a 80.\n", cont3);
}
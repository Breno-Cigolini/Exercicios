#include <stdio.h>

int main(){
    int i = 0, idades[10], maior, menor;

    printf("Informe 10 idades:\n");

    for (; i < 10; i++){
        printf("%d- ", i+1);
        scanf("%d", &idades[i]);
    }

    maior = idades[0];
    menor = idades[0];

    for (int j = 1; j < 10; j++){
        if (idades[j] > maior){
            maior = idades[j];
        }
        if (idades[j] < menor){
            menor = idades[j];
        }
    }
    printf("maior: %d\n", maior);
    printf("menor: %d\n", menor);
}
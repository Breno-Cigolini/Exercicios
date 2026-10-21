#include <stdio.h>

int main() {
    int v[10], soma = 0;

    printf("Informe 10 numeros menores que 1000. \n");


    for (int i = 0; i < 10; i++){
        do{
            printf("-> ");
            scanf("%d", &v[i]);
            if (v[i] >= 1000){
                printf("Somente numeros menores que 1000. Tente novamente...\n");
            }
        } while (v[i] >= 1000);

        soma += v[i];
        printf("Numeros digitados: \n");
        printf("------------------\n");
        for (int j = 0; j <= i; j++) {
            printf("%9d\n", v[j]);
        }
        printf("------------------\n");
        printf("Soma: %3d\n", soma);
        printf("------------------\n");
    }
}
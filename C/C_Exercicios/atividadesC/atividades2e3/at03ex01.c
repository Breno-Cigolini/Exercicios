#include <stdio.h>

int main(void) {
    int n1, n2, maior;

    printf("Informe um numero inteiro: ");
    scanf("%d", &n1);
    printf("Informe outro numero inteiro: ");
    scanf("%d", &n2);

    maior = (n1 > n2) ? n1 : n2;

    printf("O maior numero e %d", maior);
}
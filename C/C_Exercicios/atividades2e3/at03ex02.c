#include <stdio.h>

int main(void) {
    int n1,n2, n3, n4, menor;

    printf("Informe um numero inteiro: ");
    scanf("%d", &n1);
    printf("Informe um numero inteiro outro: ");
    scanf("%d", &n2);
    printf("Informe um numero inteiro outro: ");
    scanf("%d", &n3);
    printf("Informe um numero inteiro outro: ");
    scanf("%d", &n4);

    menor = (n1 < n2)? n1 : (n2 < n3? n2:(n3 < n4? n3 : n4));
    
    printf("O menor e: %d", menor);
}
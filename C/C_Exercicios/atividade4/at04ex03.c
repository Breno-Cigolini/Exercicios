#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "");
    int n,soma = 0, c = 1;
    do{
        printf("Informe o %dº valor:", c);
        scanf("%d", &n);
        soma = soma + n;
        c++;
    } while (c <= 5);

    printf("Soma: %d", soma);
}
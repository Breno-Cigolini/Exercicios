#include <stdio.h>
#include <math.h>

int main(void) {
    float total, p, t, totalparcela;
    int resp, parcelas;

    printf("Total gasto: ");
    scanf("%f", &total);

    printf("Opcao 1: a vista com 10 %% de desconto\nOpcao 2: em duas vezes sem juros\nOpcao 3: de 3 ate 10 vezes com 3 %% de juros ao mes\n");
    printf("--> ");
    scanf("%d", &resp);

    if (resp == 1) {
        p = 0.1;
        t = total - total * p;
        printf("A vista com desconto. Era R$%.2f e ficou por R$%.2f", total, t);
    }
    else if (resp == 2) {
        t = total / 2;
        printf("Duas vezes sem juros. Era R$%.2f e ficou por duas parcelas de R$%.2f cada.", total, t);
    }
    else if (resp == 3) {
        printf("Em quantas parcelas [3 a 10]? ");
        scanf("%d", &parcelas);

        t = total * pow(1.03, parcelas);
        totalparcela = total / parcelas;
        printf("%d parcelas com 3 %% de juros. Era R$%.2f e ficou em R$%.2f cada parcela mais o juros, no total sai por R$%.2f", parcelas, total, totalparcela, t);
    }
}
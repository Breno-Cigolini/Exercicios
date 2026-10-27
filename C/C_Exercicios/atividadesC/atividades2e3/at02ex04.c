#include <stdio.h>
#include <math.h>

int main(void) {
    float total, p, t, totalparcela;
    int resp, parcelas;

    printf("Total gasto: ");
    scanf("%f", &total);

    printf("Opcao 1: a vista com 10%% de desconto\nOpcao 2: em duas vezes sem juros\nOpcao 3: de 3 ate 10 vezes com 3%% de juros ao mes ---> Valido somente quando o total de gasto for igual ou superior a R$100\n");
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
        if (total < 100) {
            printf("Erro. A opcao 3 so podera ser escolhida se o valor total dos gastos for maior que R$100, caso contrario o programa sera encerrado.");
            printf("Programa finalizado...");
            return 0;  
        }
        printf("Em quantas parcelas [3 a 10]? ");
        scanf("%d", &parcelas);

        t = total * pow(1.03, parcelas);
        totalparcela = total / parcelas;
        printf("%d parcelas com 3%% de juros. Era R$%.2f e ficou em R$%.2f cada parcela mais o juros, no total sai por R$%.2f", parcelas, total, totalparcela, t);
    }
}
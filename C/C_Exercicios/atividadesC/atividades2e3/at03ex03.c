#include <stdio.h>
#include <math.h>

int main(void) {
    float metros,latas;
    int resp, rendimento, d;

    printf("Quantos metros de tinta: ");
    scanf("%f", &metros);
    do {
    printf("Escolha um tipo de superficie:\n1 - Parede rebocada sem tinta previa.\n2 - Parede rebocada ja pintada anteriormente.\n3 - Parede emassada.\n");
    printf("--> ");
    scanf("%d", &resp); 
    } while (resp >= 4 || resp < 1);

    printf("Quantos demaos de tinta? ");
    scanf("%d", &d);

    if (resp == 1) {
        rendimento = 8;
    }
    else if (resp == 2) {
        rendimento = 6;
    }
    else if (resp == 3) {
        rendimento = 10;
    }

    latas = ceilf((metros * d) / (rendimento * 3.6));

    printf("Quantidade de latas para %2.fm de tinta: %.0f", metros, latas);
}
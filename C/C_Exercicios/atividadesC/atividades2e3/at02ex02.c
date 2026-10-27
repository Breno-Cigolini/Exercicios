#include <stdio.h>

int main(void) {
    char nome[20];
    int cargo;
    float salario, novo_salario, p;

    printf("Nome: ");
    scanf("%19s", nome);
    printf("Salario: ");
    scanf("%f", &salario);
    printf("101 - Gerente\n102 - Analista\n103 - Engenheiro\n104 - Tecnico\n");
    printf("--> ");
    scanf("%d", &cargo);

    if (cargo == 101) {
        p = 0.1;
    } 
    else if (cargo == 102 || cargo == 103) {
        p = 0.2;
    }
    else if (cargo == 104) {
        p = 0.3;
    }
    else {
        printf("Cargo nao encontrado.");
        return 0;
    }
    novo_salario = salario + salario * p;
    printf("Nome: %s\n", nome);
    printf("Antigo salario: R$%.2f\n", salario);
    printf("Salario atualizado: R$%.2f\n", novo_salario);
}
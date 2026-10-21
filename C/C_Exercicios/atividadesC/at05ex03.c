#include <stdio.h>

int main() {
    char nome[5][100];
    int cargo[5], i = 0, j = 0;
    float horas_trabaladas[5], horas_efetivas[5], horas_excedentes[5], salario[5], horas;

    for (; i < 5; i++) {
        printf("Informe seu nome completo: ");
        scanf(" %[^\n]", nome[i]);
        printf("Informe o nivel do seu cargo:\n");
        printf("----------------------------------------------------------------------\n");
        printf("| %-20s | %-20s | %-20s |\n", 
            "Nivel do cargo", 
            "Horas maximas no mes", 
            "Valor pago pela hora");
        printf("----------------------------------------------------------------------\n");

        printf("| %-20s | %-20d | R$ %-17.2f |\n", "1 - Junior", 180, 32.08);
        printf("| %-20s | %-20d | R$ %-17.2f |\n", "2 - Pleno", 160, 44.10);
        printf("| %-20s | %-20d | R$ %-17.2f |\n", "3 - Senior", 140, 58.20);

        printf("----------------------------------------------------------------------\n");
        do{
            printf("-> ");
            scanf("%d", &cargo[i]);
        } while (cargo[i] != 1 && cargo[i] != 2 && cargo[i] != 3);
        printf("Horas trabalhadas: ");
        scanf("%f", &horas_trabaladas[i]);

        if (cargo[i] == 1){
            horas_efetivas[i] = 180;
            horas = 32.08;
        } else if (cargo[i] == 2){
            horas_efetivas[i] = 160;
            horas= 44.10;
        } else {
            horas_efetivas[i] = 140;
            horas = 58.20;
        }
        if (horas_trabaladas[i] > horas_efetivas[i]){
            horas_excedentes[i] = horas_trabaladas[i] - horas_efetivas[i];
            salario[i] = horas_efetivas[i] * horas;

        } else {
            salario[i] = horas_trabaladas[i] * horas;
            horas_excedentes[i] = 0;
        }
    }
    
    printf("\n%-20s %-20s %-20s %-20s %-20s \n\n",
            "Nome",
            "Horas Trabalhadas",
            "Horas Efetivas",
            "Horas Excedentes",
            "Salario");
    
    for (; j < 5; j++) {
        printf("%-20s %-20.0f %-20.0f %-20.0f R$%-20.2f\n", nome[j], horas_trabaladas[j], horas_efetivas[j], horas_excedentes[j], salario[j]);        
    }
}
#include <stdio.h>

int main() {
    char nome[100];
    int cargo;
    float horas_trabaladas, horas_efetivas, horas_excedentes, salario, horas;

    printf("Informe seu nome completo: ");
    scanf(" %[^\n]", nome);
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
        scanf("%d", &cargo);
    } while (cargo != 1 && cargo != 2 && cargo != 3);
    printf("Horas trabalhadas: ");
    scanf("%f", &horas_trabaladas);

    if (cargo == 1){
        horas_efetivas = 180;
        horas = 32.08;
    } else if (cargo == 2){
        horas_efetivas = 160;
        horas= 44.10;
    } else {
        horas_efetivas = 140;
        horas = 58.20;
    }
    if (horas_trabaladas > horas_efetivas){
        horas_excedentes = horas_trabaladas - horas_efetivas;
        salario = horas_efetivas * horas;

    } else {
        salario = horas_trabaladas * horas;
        horas_excedentes = 0;
    }

    
    printf("%-20s %-20s %-20s %-20s %-20s \n",
        "Nome",
        "Horas Trabalhadas",
        "Horas Efetivas",
        "Horas Excedentes",
        "Salario");

    printf("%-20s %-20.0f %-20.0f %-20.0f R$%-20.2f", nome, horas_trabaladas, horas_efetivas, horas_excedentes, salario);
}
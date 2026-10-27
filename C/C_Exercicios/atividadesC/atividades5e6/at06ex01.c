#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

int menu(){
    int opcao;
    system("cls");
    printf(
        "*====================== Caixa Eletronico ======================*\n"
        "\n1-Verificar Saldo.\n"
        "2-Realizar um deposito.\n"
        "3-Realizar um saque.\n"
        "4-Sair.\n"
        "\n*==============================================================*\n"
    );
    do {
        printf("-> ");
        scanf("%d", &opcao);
        if (opcao >= 1 && opcao <= 4)
            return opcao;
        else 
            printf("Opcao invalida. Tente novamente...\n");

    } while (1);
    return opcao;
}

int main(){
    printf("Bem-vindo ao Programa!\n");
    printf("Pressione qualquer tecla para continuar...\n");
    getch();
    system("cls");
    
    float saldo = 1000, deposito, saque;

    while(1){
        int resp = menu();

        if (resp == 1) {
            system("cls");
            printf("Saldo: R$%.2f\n", saldo);
            printf("\nPressione qualquer tecla para continuar...\n");
            getch();
        }
        else if (resp == 2){
            system("cls");
            printf("Quanto deseja depositar? ");
            scanf("%f", &deposito);

            if (deposito < 0){
                printf("Nao e possivel depositar valores negativos.\n");
                printf("\nPressione qualquer tecla para continuar...\n");
                getch();
                continue;
            }
            else {
                saldo += deposito;
                printf("Deposito bem-sucedido.\n");
                printf("\nPressione qualquer tecla para continuar...\n");
                getch();
            }
        }
        else if (resp == 3){
            system("cls");
            printf("Quanto deseja sacar? ");
            scanf("%f", &saque);
            if (saque > saldo){
                printf("Saldo insuficiente.\n");
                printf("\nPressione qualquer tecla para continuar...\n");
                getch();
                continue;
            }
            else if (saque < 0){
                printf("Nao e possivel sacar valores negativos.\n");
                printf("\nPressione qualquer tecla para continuar...\n");
                getch();
                continue;
            }
            else{
                printf("Saque bem-sucedido.\n");
                printf("\nPressione qualquer tecla para continuar...\n");
                getch();
            }
            saldo -= saque;
        }
        else if (resp == 4){
            system("cls");
            printf("Voce escolheu sair...\n");
            printf("Obrigado e volte sempre!");
            break;
        }
    }
}
#include <stdio.h>

int main(void){
    char nome[20], cidade[20];
    int idade;

    printf("Nome: ");
    scanf("%19s", nome);
    printf("Cidade: ");
    scanf("%19s", cidade);
    printf("Idade: ");
    scanf("%d", &idade);

    printf("%s, nascido em cidade em %s, possui %d anos e e ", nome, cidade, idade);
    if (idade >= 18){
        printf("maior de idade.");
    } else {
        printf("menor de idade.");
    }

    return 0;
}
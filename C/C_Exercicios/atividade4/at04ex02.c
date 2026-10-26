#include <stdio.h>

int main(){
    int n, i = 0;

    do {
        printf("Informe um valor maior que 1 e menor que 200: ");
        scanf("%d", &n);
    } while (n < 1 || n > 200);

    for (; n >= 0; n = n - 1){
        printf("%d - %d - %d\n", n*2, n, i);
        i++;
    }
}
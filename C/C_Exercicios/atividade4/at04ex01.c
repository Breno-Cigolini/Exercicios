#include <stdio.h>

int main(){
    int n;
    do {
        printf("Informe um valor inteiro maior que 1 e menor que 130: ");
        scanf("%d", &n);
    } while (n < 1 || n > 130);

    for (; n > -1 ; n--){
        printf("%d\n", n);
    }
    
}

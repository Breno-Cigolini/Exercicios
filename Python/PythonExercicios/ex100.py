from random import randint
from time import sleep

numeros = list()

def sorteia():
    for valor in range(0, 5):
        numeros.append(randint(1, 100))
    print(f"Sorteando 5 valores da  lista: ", end="")
    for v in numeros:
        print(f"{v} ",end=" ", flush=True)
        sleep(0.5)

sorteia()

def somapar():
    soma = 0
    for num in numeros:
        if num % 2 == 0:
            soma += num
    print(f"\nSorteando os valores pares de {numeros} temos: {soma}")

somapar()

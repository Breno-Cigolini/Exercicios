from random import randint
from time import sleep
print("-"*30)
print(f'{"JOGA NA MEGA SENA":^30}')
print("-"*30)
j = int(input("Quantos jogos você quer que eu sorteie? "))
print("-="*5, end="")
print(f" < SORTEANDO {j} JOGOS > ", end="")
print("-="*5)
for n in range(1, j+1):
    lista = list()
    while len(lista) < 6:
        num = randint(1, 60)
        if num not in lista:
            lista.append(num)
    lista.sort()
    print(f"Jogo {n}: {lista}")
    sleep(1)

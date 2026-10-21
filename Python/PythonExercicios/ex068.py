print("=-" * 30)
print("Vamos jogar par ou ímpar!")
print("=-" * 30)
from random import randint
cont = 0
while True:
    v = int(input("Diga um valor: "))
    pi = " "
    while pi not in "PI":
        pi = str(input("Par ou ímpar? [P/I] ")).strip().upper()[0]
    c = randint(0,10)
    print("=-"*30)
    s = v + c
    print(f"Você jogou {v} e o computador {c}. Total de {s} e deu ", end="")
    if s % 2 == 0:
        print("PAR")
    else: 
        print("ÍMPAR")
        print("=-"*30)
    if pi == 'P':
        if s % 2 ==0:
            cont += 1
            print("VOCÊ VENCEU!")
            print("Vamos jogar novamente...")
            print("=-"*30)
        else:
            print("Você perdeu!")
            print(f"GAME OVER! Você venceu {cont} vezes.")
            print("=-"*30)
            break     
    elif pi == "I":
        if s % 2 == 1:
            cont += 1
            print("VOCÊ VENCEU!")
            print("Vamos jogar novamente...")
            print("=-"*30)
        else:
            print("Você perdeu!")
            print(f"GAME OVER! Você venceu {cont} vezes.")
            print("=-"*30)
            break

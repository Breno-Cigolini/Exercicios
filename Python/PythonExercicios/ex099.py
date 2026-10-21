from random import randint
lista = list()

def lin():
    print("-="*30)

for v in range(0, randint(0, 10)):
    lista.append(randint(1, 10))

def maior(*num):
    lin()
    print("Analisando os valores passados...")
    for valor in num:
        print(f"{valor} ", end=" ")
    
    print(f"\nForam informados {len(num)} valores ao todo.")

    if len(num) == 0:
        print("Nenhum número foi informado.")
    
    else:
        maior_valor = 0
        for valor in num:
            if valor > maior_valor:
                maior_valor = valor
        print(f"O maior valor informado foi {maior_valor}")
    
maior(*lista)

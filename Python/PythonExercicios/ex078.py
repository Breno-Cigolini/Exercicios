lista = []
for i in range(0, 5):
    n = int(input(f"Digite um valor para a posição {i}: "))
    lista.append(n)
    if i == 0:
        maior = menor = n
    else:
        if n > maior:
            maior = n
        if n < menor:
            menor = n

print("=-"*30)
print(f"Você digitou os valores {lista}")
print(f"O maior valor digitado foi {maior} nas posições ", end="")
for i, v in enumerate(lista):
    if v == maior:
        print(f"{i}... ", end="")
print()
print(f"O menor valor digitado foi {menor}.", end="")
for i, v in enumerate(lista):
    if v == menor:
        print(f"{i}... ", end="")
print()

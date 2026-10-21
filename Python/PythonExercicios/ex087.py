matriz = [[], [], []]
soma = somacoluna3 = maior = 0
for linha in range(1, 4):
    for coluna in range(1, 4):
        n = int(input(f"Digite um valor para [ α {linha}, {coluna}]: "))
        if n % 2 == 0:
            soma += n
        if linha == 1:
            matriz[0].append(n)
        elif linha == 2:
            matriz[1].append(n)
        elif linha == 3:
            matriz[2].append(n)
        if coluna == 3:
            somacoluna3 += n
        if linha == 2:
            maior = max(matriz[1])
print("=-"*30)
print(matriz[0])
print(matriz[1])
print(matriz[2])
print("=-"*30)
print(f"A soma dos valores pares é {soma}.")
print(f"A soma dos valores da terceira coluna é {somacoluna3}.")
print(f"O maior valor da segunda linha é {maior}")

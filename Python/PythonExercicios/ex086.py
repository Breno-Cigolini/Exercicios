matriz = [[], [], []]
for p in range(1, 4):
    for p2 in range(1, 4):
        n = int(input(f"Digite um valor para [ α {p}, {p2}]: "))
        if p == 1:
            matriz[0].append(n)
        elif p == 2:
            matriz[1].append(n)
        elif p == 3:
            matriz[2].append(n)
print("=-"*30)
print(matriz[0])
print(matriz[1])
print(matriz[2])

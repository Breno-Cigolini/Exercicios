lista = [[], []]

for n in range(1, 8):
    num = int(input(f"Digite o {n} valor: "))
    if num % 2 == 0:
        lista[0].append(num)
    elif num % 2 == 1:
        lista[1].append(num)

print("-="*30)

print(f"Os valores pares digitados foram: {lista[0]}.")
print(f"Os valores impares digitados foram: {lista[1]}.")

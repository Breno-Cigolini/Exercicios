total = list()
dado = list()
cont = maior = menor = 0
while True:
    dado.append(str(input("Nome: ")))
    dado.append(float(input("Peso: ")))
    if cont == 0:
        maior = menor = dado[1]
    else:
        if dado[1] > maior:
            maior = dado[1]
        if dado[1] < menor:
            menor = dado[1]
    cont += 1
    total.append(dado[:])
    dado.clear()
    r = str(input("Quer Continuar? [S/N] "))
    if r in "Nn":
        break
print("-="*30)
print(f"O total de pessoas cadastradas foram {cont}.")
print(f"O maior peso foi de {maior}Kg. Peso de: ", end="")
for p in total:
    if p[1] == maior:
        print(f"[{p[0]}]")
print()
print(f"O menor peso foi de {menor}Kg. Peso de: ", end="")
for p in total:
    if p[1] == menor:
            print(f"[{p[0]}]")
print()

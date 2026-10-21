lista = []
pares = []
impares = []
while True: 
    lista.append(int(input("Informe valores: ")))
    r = str(input("Quer continuar? [S/N] "))
    if r.upper() == "N":
        break
for i, n in enumerate(lista):
    if n % 2 == 0:
        pares.append(n)
    elif n % 2 == 1:
        impares.append(n)

print("=-"*30)
print(f"Sua lista fica assim: {lista}")
print(f"Sua lista de pares fica assim: {pares}")
print(f"Sua lista de impares fica assim: {impares}")

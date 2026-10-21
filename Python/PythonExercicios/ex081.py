lista = []
c = 0
cont = 0
while True:
    n = int(input("Informe um valor: "))
    lista.append(n)
    c += 1
    r = str(input("Quer continuar? [S/N] "))
    while r.upper() not in "SN":
        r = str(input("Quer continuar [S/N] "))
    if r.upper() == "N":
        break
print("=-"*30)
print(f"Você digitou {c} números...")
lista.sort(reverse=True)
print(f"A lista de valores de ordem decressente é {lista}")
if 5 in lista:
    print("O valor 5 faz parte da lista!")
else:
    print("O valor 5 não faz parte da lista!")

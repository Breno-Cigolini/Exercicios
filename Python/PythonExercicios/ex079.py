lista = []
while True:
    v = int(input("Digite um valor: "))
    if v in lista:
        print("Valor duplicado! Não vou adicionar...")
    else:
        print("Valor adicionado com sucesso...")
        lista.append(v)
    r = str(input("Quer continuar? [S/N] "))
    while r.upper() not in "SN":
        r = str(input("Quer continuar? [S/N] "))
    if r.upper() == "N":
        break
print("=-"*30)
lista.sort()
print(f"Você digitou os valores {lista}")

boletim = []
while True:
    n = str(input("Nome: "))
    n1 = float(input("Nota 1: "))
    n2 = float(input("Nota 2: "))
    media = (n1+n2)/2
    boletim.append([n, [n1, n2], media])
    r = str(input("Quer continuar? [S/N] "))
    if r in "Nn":
        break
print("=-"*30)
print(f"{"Nº":<4}{"Nome":<10}{"Nota":>8}")
print("-"*30)
for i, a in enumerate(boletim):
    print(f"{i:<4}{a[0]:<10}{a[2]:>8.1f}")

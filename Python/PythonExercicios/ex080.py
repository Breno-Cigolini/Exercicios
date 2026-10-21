lista = []

for i in range(0,5):
    v = int(input("Digite um valor: "))
    if i == 0 or v > lista[-1]:
        lista.append(v)
    else:
        p = 0
        while p < len(lista):
            if v <= lista[p]:
                lista.insert(p , v)
                break
            p += 1
print("=-"*30)
print(f"Os valores digitados foram {lista}")

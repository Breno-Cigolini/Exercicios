def notas(*n, sit = False):
    notas = dict()
    notas["total"] = len(n)
    notas["maior"] = max(n)
    notas["menor"] = min(n)
    notas["media"] = sum(n)/len(n)

    if sit == True:
        if notas["media"] >= 7:
            s = "Aprovado"
        elif 4 <= notas["media"] < 7:
            s = "Boa"
        else:
            s = "Ruim"
        notas["situação"] = s

    return notas

print("-"*30)

print(notas(6, 6, sit=True))

cont = 0
h = 0
m = 0
while True:
    idade = int(input("Informe sua idade: "))
    sexo = " "
    while sexo not in "MF":
        sexo = str(input("Informe seu sexo [M/F]: ")).strip().upper()[0]
    if idade >= 18:
        cont += 1
    if sexo == "M":
        h += 1
    if sexo == "F" and idade < 20:
        m += 1
    resposta = " "
    while resposta not in "SN":
        resposta = str(input("Deseja continuar? [S/N] ")).strip().upper()[0]
    if resposta == "N":
        break
print(f"Total de pessoas com mais de 18 anos: {cont}")
print(f"Total de homens cadastratados: {h}")
print(f"Total de mulheres com menos de 20 anos: {m}")

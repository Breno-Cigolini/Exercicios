dados = dict()
lista = list()
cont = idade = 0
mulheres = list()
while True:
    dados["nome"] = str(input("Nome: "))
    dados["idade"] = int(input("Idade: "))
    idade += dados["idade"]
    
    sexo = str(input("Sexo [M/F]: ")).upper()
    while sexo not in "MF":
        print("ERROR! Digite apenas M ou F.")
        sexo = str(input("Sexo [M/F]: ")).upper()
    dados["sexo"] = sexo
    
    cont += 1
    
    if sexo == "F":
        mulheres.append(dados["nome"])
    
    lista.append(dados.copy())

    r = str(input("Quer continuar [S/N]? ")).upper()
    while r not in "SN":
        print("ERROR! Digite apenas S ou N.")
        r = str(input("Quer continuar [S/N]? "))
    if r == "N":
        break

print("-="*30)
print(f"Ao todo temos {cont} pessoas cadastradas.")
print(f"A média das idades é {idade/cont} anos.")
print(f"As mulheres cadastradas foram {', '.join(mulheres)}")
print("Lista das pessoas que estão acima da média: ")
for p in lista:
    if p["idade"] > idade/cont:
        print(f"    nome = {dados["nome"]}: sexo = {dados["sexo"]}; idade = {dados["idade"]}")

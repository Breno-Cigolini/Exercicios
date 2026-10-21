from datetime import datetime
cadastro = dict()
cadastro["nome"] = str(input("Nome: "))
ano = int(input("Ano de nascimento: "))
cadastro["idade"] = datetime.now().year - ano
cadastro["carteira"] = int(input("Carteira de Trabalho (0 não tem): "))
if cadastro["carteira"] != 0:
    cadastro["contratação"] = int(input("Ano de contratação: "))
    cadastro["salário"] = float(input("Salário: "))
    cadastro["aposentadoria"] = cadastro["idade"] + ((cadastro["contratação"] + 35) - datetime.now().year)
print("-=-"*30)
for k, v in cadastro.items():
    print(f"    -> {k} tem o valor: {v}")
print(cadastro["idade"])

aluno = dict()
aluno["nome"] = str(input("Nome: "))
aluno["media"] = float(input(f"Média de {aluno["nome"]}: "))
print("=-"*30)
for k, v in aluno.items():
    print(f"-> {k} é igual a {v}")
print("-> Situação final:", end=" ")
if v >= 7:
    print("Aprovado!")
elif v >= 5:
    print("Recuperação.")
else:
    print("Reprovado.")

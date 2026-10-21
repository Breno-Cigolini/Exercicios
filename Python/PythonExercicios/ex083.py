e = str(input("Digite a espressão: "))
pilha = []
for i in e:
    if i == "(":
        pilha.append("(")
    elif i == ")":
        if len(pilha) > 0:
            pilha.pop()
        else:
            pilha.append(")")
            break
if len(pilha) == 0:
    print("Sua espressão está válida.")
else:
    print("Sua espressão esta inválida.")

dados = dict()
dados["nome"] = str(input("Nome do jogador: "))
p = int(input(f"Quantas partidas {dados["nome"]} jogou? "))

if p == 0:
    print("Jogador é o Ney ent? KKK")

else:
    gols = list()

    total = 0

    for i in range(1, p+1):
        g = int(input(f"Quantos gols na partida {i}? "))
        gols.append(g)
        total += g

    dados["gols"] = gols
    dados["total"] = total

    print("-="*30)
    print(dados)
    print("-="*30)

    for k, v in dados.items():
        print(f"O campo {k} tem o valor {v}")
    print("-="*30)
    print(f"O jogador {dados["nome"]} jogou {p} partidas.")
    for i, v in enumerate(dados["gols"]):
        print(f"    -> Na partida {i}, fez {v} gols.")
    print(f"Foi um total de {total} gols.")

jogadores =list()
while True:
    dados = dict()
    gols = list()
    total = 0
    dados["nome"] = str(input("Nome do jogador: "))
    p = int(input(f"Quantas partidas {dados['nome']} jogou? "))
    for i in range(1, p+1):
        g = int(input(f"Quantos gols na partida {i}? "))
        gols.append(g)
        total += g

    dados["gols"] = gols
    dados["total"] = total
    jogadores.append(dados.copy())

    r = str(input("Quer continuar [S/N] ")).upper()
    while r not in "SN":
        print("ERROR! Digite apenas S ou N.")
        r = str(input("Quer continuar [S/N]? ")).upper()
    if r == "N":
        break
print("-=" * 30)
print(f"{'cod':<4}{'Nome':<15}{'Gols':<20}{'Total':<5}")
print("-" * 60)
for i, jogador in enumerate(jogadores):
    print(f"{i:<4}{jogador['nome']:<15}{str(jogador['gols']):<20}{jogador['total']:<5}")
while True:
    print("-" * 60)
    op = int(input("Mostrar dados de qual jogador? (999 para parar) "))
    if op == 999:
        break
    if op < 0 or op >= len(jogadores):
        print(f"ERRO! Não existe jogador com código {op}!")
    else:
        print(f"-- LEVANTAMENTO DO JOGADOR {jogadores[op]['nome']}:")
        for i, g in enumerate(jogadores[op]['gols']):
            print(f"   No jogo {i+1} fez {g} gols.")
            
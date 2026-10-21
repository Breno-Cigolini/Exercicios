from random import randint
from time import sleep
from operator import itemgetter
jogadores = {
    "jogador1": randint(1,6),
    "jogador2": randint(1,6),
    "jogador3": randint(1,6),
    "jogador4": randint(1,6),
}
rank = list()
print("Valores sorteados:")
for k, v in jogadores.items():
    print(f"{k} tirou {v} no dado.")
    sleep(1)
rank = sorted(jogadores.items(), key= itemgetter(1), reverse = True)
print("-="*30)
print(" == RANKING DE JOGADORES == ")
for i, v in enumerate(rank):
    print(f"{i+1} lugar: {v[0]} com {v[1]} pontos.")
    sleep(1)

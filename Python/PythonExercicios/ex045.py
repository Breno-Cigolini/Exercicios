from random import randint
from time import sleep
itens = ('pedra', 'papel', 'tesoura')
computador = randint(0, 2)
print('''Suas opções:
[0] pedra
[1] papel
[2] tesoura''')
jogador = int(input('Qual sua escolha: '))
print('-='*15)
print('JO')
sleep(1)
print('KEN')
sleep(1)
print('PO!!!')
sleep(1)
print('-='*15)
print('O computador escolheu {}'.format(itens[computador]))
print('O jogador escolheu {}'.format(itens[jogador]))
print('-='*15)
if computador == 0:
    if jogador == 1:
        print('Jogador venceu!')
    elif jogador == 2:
        print('Computador venceu!')
    elif jogador == 0:
        print('Empate')
    else:
        print('\033[1;31mJogada inválida!\033[m')

elif computador == 1:
    if jogador == 0:
        print('Computador venceu!')
    elif jogador == 2:
        print('Jogador venceu!')
    elif jogador == 1:
        print('Empate')
    else:
        print('\033[1;31mJogada inválida!\033[m')

elif computador == 2:
    if jogador == 0:
        print('Jogador venceu!')
    elif jogador == 1:
        print('Computador venceu!')
    elif jogador == 2:
        print('Empate')
    else:
        print('\033[1;31mJogada inválida!\033[1;31m1')

import random
r = random.randint(0, 5)
print('Tente advinhar qual número de 0 a 5 o computador está pensando.')
R = float(input('Sua escolha: '))
if R == r:
    print('Parabéns! Você acertou!')
else:
    print('O computador venceu! A resposta era {}'.format(r))
print('>>>Fim do programa<<<')

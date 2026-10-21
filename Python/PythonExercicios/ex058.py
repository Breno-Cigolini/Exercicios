import random
num = random.randint(0,10)
r = 0
p = 0
print('Tente advinhar o número que estou pensando de 1 a 10.')
while num != r:
    r = int(input('Sua escolha: '))
    print('=-'*28)
    if r == num:
        print('Você acertou!')
    else:
        print('Você errou. Tente novamente!')
        p += 1
        print('=-'*28)
print('Parabéns! Você acertou com apenas {} palpites!'.format(p))
print('>>>Fim do programa<<<')
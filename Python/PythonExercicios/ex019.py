import random
a = input('Primeiro aluno: ')
b = input('Segundo aluno: ')
c = input('Terceiro aluno: ')
d = input('Quarto aluno: ')
lista = [a, b, c, d]
x = random.choice(lista)
print('O aluno escolhido foi -> {}.'.format(x))

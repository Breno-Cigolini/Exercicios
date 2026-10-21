s = 0
contador = 0
for c in range (1, 501, 2):
    if c % 3 == 0:
        contador = contador + 1
        s = s + c
print('A soma entre todos esses {} números são {}.'.format(contador, s))

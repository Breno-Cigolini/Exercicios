n = int(input('Digite um número: '))
contador = 0
for c in range(1, n+1):
    if n % c == 0:
        print('\033[1;31m', end=' ')
        contador += 1
    else:
        print('\033[33m', end=' ')
    print('{}'.format(c), end=' ')
print('\n\033[mO número {} foi dividido {} vezes.'.format(n, contador))
if contador == 2:
    print('Por 1 e por ele mesmo! E por isso ele é primo.')
else:
    print('E por isso ele não é primo.')

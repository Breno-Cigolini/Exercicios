n = int(input('Digite um número para saber sua tabuada: '))
for c in range(0, 11):
    print('{} x {:2} = {}'.format(n, c, n*c))

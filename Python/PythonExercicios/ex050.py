soma = 0
for c in range(1, 7):
    n = int(input('Digite um valor: '))
    if n % 2 == 0:
        soma += n
print('A soma de apenas os números pares é {}.'.format(soma))

n1 = int(input('Informe um valor: '))
n2 = int(input('Informe outro valor: '))
print('=-' * 28)
print('''
[1] somar
[2] Multiplicar
[3] Maior
[4] Novos números
[5] Sair do programa
''')
e = 0
while e != 5:
    print('=-' * 28)
    e = int(input('Sua escolha: '))
    if e == 1:
        soma = n1 + n2
        print('{} + {} = {}'.format(n1, n2, soma))
    if e == 2:
        print('{} x {} = {}.'.format(n1, n2, n1*n2))
    if e == 3:
        maior = 0
        menor = 0
        if n1 < n2:
            maior += n2
            menor = n1
        else:
            maior += n1
            menor = n2
        print('{} > {}.'.format(maior, menor))
    if e == 4:
        print('=-' * 28)
        n1 = int(input('Informe um valor: '))
        n2 = int(input('Informe outro valor: '))
    if e >= 6:
        print('\033[31mOpção inválida. Tente novamente.\033[m')
        print('=-' * 28)
        n1 = int(input('Informe um valor: '))
        n2 = int(input('Informe outro valor: '))
print('----- Você escolheu sair -----')

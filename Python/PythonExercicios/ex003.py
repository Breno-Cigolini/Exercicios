n1 = int(input('\033[1;35mDigite um número:'))
n2 = int(input('\033[1;33mDigite mais um número:'))
s = n1*n2
# print('A soma entre:',n1, 'e', n2, 'vale -> {}'.format(s))
print('\033[1;34mA multiplicação entre: {} e {} vale -> \033[31m{}'.format(n1, n2, s ))

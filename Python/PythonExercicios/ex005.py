n1 = int(input('\033[1;31mDigite um valor:'))
n2 = int(input('\033[1;32mDigite outro valor:'))
# print('A soma vale -> {}'.format(n1+n2))
# print('A multiplicação vale -> {}'.format(n1*n2))
# print('A divisão vale -> {}, sendo -> {} o resto.'.format(n1/n2, n1%n2))
# print('E ambos ao quadrado são, {} e {} respectivamente.'.format(n1**2, n2**2))
s = n1+n2
m = n1*n2
d = n1/n2
di = n1//n2
e =  n1**n2
print('\033[1;33mA soma é {}, \033[1;34mo produto é {}, \033[1;35ma divisão é {:.2f}'.format(s, m, d), end=', ')
print('\033[1;36ma divisão inteira é {}, \033[1;37me potência é {}'.format(di, e))

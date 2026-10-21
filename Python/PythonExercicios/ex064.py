c = 0
s = 0
n = int(input('Informe um número: '))
while n != 999:
    c += 1
    s += n
    n = int(input('Informe um número: '))
print('Você digitou {} números e a soma entre eles foi {}'.format(c, s))

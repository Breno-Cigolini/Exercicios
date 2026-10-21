print('='*30)
print('10 Primeiros termos de uma PA')
print('='*30)
a = int(input('Digite o primeiro valor: '))
r = int(input('Razão: '))
t = a
cont = 1
while cont <= 10:
    print('{} -> '.format(t), end='')
    t += r
    cont +=1
print('Acabou')

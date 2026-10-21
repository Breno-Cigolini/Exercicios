print('='*30)
print('10 Primeiros termos de uma PA')
print('='*30)
a = int(input('Digite o primeiro valor: '))
r = int(input('Razão: '))
t = a
cont = 1
total = 0
m = 10
while m != 0:
    total += m
    while cont <= total:
        print('{} -> '.format(t), end='')
        t += r
        cont +=1
    print('Pausa')
    m = int(input('Quantos termos você quer mostrar a mais? '))
print('Fim')

print('='*30)
print('10 Primeiros termos de uma PA')
print('='*30)
a = int(input('Digite o primeiro valor: '))
r = int(input('Razão: '))
pa = a+(10-1)*r
for c in range(a, pa+r, r):
    print(c, end=' -> ')
print('ACABOU')

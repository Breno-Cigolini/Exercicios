a = int(input('Digite um número: '))
b = int(input('Digite outro número: '))
c = int(input('Ditite mais um número: '))
menor = a
if b < a and b < c:
    menor = b
if c < a and c < b:
    menor = c
maior = a
if b > a and b > c:
    maior = b
if c > a and c > b:
    maior = c
print('O maior valor é {}'.format(maior))
print('O menor valor é {}'.format(menor))

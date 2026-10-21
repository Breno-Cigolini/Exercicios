p1 = float(input('Primeiro segmento: '))
p2 = float(input('Segundo segmento: '))
p3 = float(input('Terceiro segmento: '))
print('=-'*28)
if p1 < p2 + p3 and p2 < p1 + p3 and p3 < p1 + p2:
    print('Os segmentos acima podem formar um triangulo', end=' ')
    if p1 == p2 == p3:
        print('equilátero.')
    elif p1 == p2 or p1 == p3 or p2 == p3:
        print('isósceles.')
    else:
        print('escaleno.')
else:
    print('Os segmentos acima não podem formar um triangulo.')

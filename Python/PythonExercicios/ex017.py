from math import sqrt
co = float(input('Cateto oposto: '))
ca = float(input('Cateto adjacente: '))
h = sqrt(ca**2 + co**2)
print('A hipotenusa é {:.2f}.'.format(h))

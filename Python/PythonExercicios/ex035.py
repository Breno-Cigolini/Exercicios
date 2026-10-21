print('-='*20)
print('Analizador de Triângulos')
print('-='*20)
a = float(input('Primeiro segmento: '))
b = float(input('Segundo segmento: '))
c = float(input('Terceiro segmento: '))
if a < b+c and b < a+c and c < a+b:
    print('Os segmentos {}, {}, e {}, PODEM FORMAR um triângulo'.format(a, b, c))
else:
    print('Os segmentos {}, {}, e {}, NÃO PODEM FORMAR um triângulo'.format(a, b, c))

p = float(input('Escreva o preço total do produto: '))
d = p*5/100
print('O produto vale R${:.2f}, como desconto de  R${:.2}.'.format(p, d))
print('O preço final é R${:.2f}.'.format(p-d))

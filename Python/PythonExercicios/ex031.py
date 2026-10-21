d = int(input('Qual a distancia da sua viagem? '))
if d <= 200:
    p = d * 0.5
    print('O valor da passagem será de R${:.2f}'.format(p))
else:
    pl = d * 0.45
    print('O valor da passagem será de R${:.2f}'.format(pl))
print('<<< FIM DO PROGRAMA >>>')

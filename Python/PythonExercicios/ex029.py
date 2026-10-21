v = int(input('Escreva a velocidade do carro: '))
if v >80:
    print('Seu carro foi multado!')
    print('Você terá que pagar uma multa de R${:.2f}, por andar acima do permitido na lei.'.format((v - 80) * 7))
print('<<< FIM DO PROGRAMA >>>')

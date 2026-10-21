print('=-'*25)
n1 = float(input('Digite sua primeira nota: '))
n2 = float(input('Digite sua segunda nota: '))
media = (n1 + n2) / 2
print('=-'*25)
if media >= 7:
    print('Sua média é {}, sua situação final é APROVADO.'.format(media))
elif media < 5:
    print('Sua média é {} , sua situação final é REPROVADO.'.format(media))
else:
    print('Sua média é {}, sua situação final é RECUPERAÇÃO.'.format(media))
print('=-'*25)

from datetime import date
ano = int(input('Digite o ano de seu nascimento: '))
data = date.today().year
idade = data - ano
if idade <= 9:
    print('Sua idade é {}, sua categoria é MIRIM.'.format(idade))
elif idade <= 14:
    print('Sua idade é {}, sua categoria é INFANTIL.'.format(idade))
elif idade <= 18:
    print('Sua idade é {}, sua categoria é JÚNIOR.'.format(idade))
elif idade >= 19:
    print('Sua idade é {}, sua categoria é SÊNIOR.'.format(idade))

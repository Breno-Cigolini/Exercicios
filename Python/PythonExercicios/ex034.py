s = float(input('Digite o seu salário: '))
if s > 1250:
    s = s * 1.10
if s <= 1250:
    s = s * 1.15
print('O seu salário com o aumento será de R${:.2f}.'.format(s))

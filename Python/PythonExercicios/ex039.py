from datetime import date
print('=-'*20)
print('          Alistamento Militar')
print('=-'*20)
ano = int(input('Informe aqui o ano do seu nascimento: '))
altura = float(input('Informe sua altura: '))
peso = float(input('Informe seu peso: '))
atual = date.today().year - int(ano)
print('=-'*20)
if altura < 1.55:
    print('Você não atende os pré-requisitos para o alistamento.')
elif peso > 110 or peso < 60:
    print('Você não atende os pré-requisitos para o alistamento.')
elif atual >= 19:
    print('Você já deveria ter se alistado no ano de {}.'.format(ano + 18))
    print('Quem nasceu em {} tem/irá fazer {} anos em 2025.'.format(ano, atual))
elif atual <= 17:
    print('Ainda faltam {} anos para o alistamento.'.format((ano + 18) - date.today().year))
    print('Seu alistamento será em {}.'.format(ano + 18))
    print('Quem nasceu em {} tem/irá fazer {} anos em 2025.'.format(ano, atual))
else:
    print('Você que se alistar imediatamente!')
    print('Quem nasceu em {} tem/irá fazer {} anos em 2025.'.format(ano, atual))
print('=-'*20)

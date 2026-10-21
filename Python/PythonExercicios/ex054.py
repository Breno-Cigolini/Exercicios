from datetime import date
contador = 0
atual = date.today().year
cont = 0
for c in range(0,7):
    ano = int(input('Digite o ano de nascimento: '))
    idade = atual - ano
    if idade >= 18:
        contador += 1
    else:
        cont += 1
print('Ao todo temos {} maiores de idade.'.format(contador))
print('Ao todo temos {} pessoas menores de idade.'.format(cont))

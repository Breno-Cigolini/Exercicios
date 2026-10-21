somaidade = 0
maioridadehomem = 0
maisvelho = ''
contador = 0
for p in range(1, 5):
    print('-----{} PESSOA-----'.format(p))
    nome = input('Nome: ').strip()
    idade = int(input('Idade: '))
    sexo = input('Sexo (M/F): ').upper().strip()
    somaidade += idade
    if p == 1 and sexo == 'M':
        maioridadehomem = idade
        maisvelho = nome
    if idade > maioridadehomem and sexo == 'M':
        maioridadehomem = idade
        maisvelho = nome
    if sexo == 'F' and idade < 20:
        contador += 1
print('-='*20)
mediaidade = somaidade / 4
print('A média da idade do grupo é {} anos.'.format(mediaidade))
print('O homem mais velho tem {} anos e se chama {}.'.format(maioridadehomem, maisvelho))
print('E tem {} mulheres com menos de 20 anos de idade.'.format(contador))



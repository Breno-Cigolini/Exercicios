sexo = ''
while sexo != 'M' and sexo != 'F':
    sexo = str(input('Digite seu sexo correspondente a [M/F]: ')).upper()
    print('-='*10)
    if sexo == 'M':
        print('Sexo Masculino.')
    if sexo == 'F':
        print('Sexo Feminino.')
print('-='*10)
print('Acabou')

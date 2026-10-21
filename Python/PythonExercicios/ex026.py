frase = str(input('Digite uma frase: ')).strip().upper()
print('O A aparece {} vezes na frase.'.format(frase.count('A')))
print('Ele aparece primeiro na {} posição.'.format(frase.find('A')+1))
print('E por último na {} posição.'.format(frase.rfind('A')+1))

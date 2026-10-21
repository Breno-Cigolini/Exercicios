f = str(input('digite uma frase: ')).strip().upper()
palavras = f.split()
junto = ''.join(palavras)
inverso = ''
for letra in range(len(junto) - 1, -1, -1):
    inverso += junto[letra]
print('O inverso de \033[32m{} \033[mé \033[1;31m{}\033[m.'.format(junto, inverso))
if inverso == junto:
        print('A frase digitada \033[1;32mé um palíndromo\033[m.')
else:
        print('A frase digitada \033[1;31mnão é um palíndromo\033[m.')

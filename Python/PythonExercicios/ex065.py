c = 0
soma = 0
media = 0
maior = 0
menor = 0
e = 'S'
while e in 'S':
    n = float(input('Informe um número: '))
    soma += n
    c += 1
    if c == 1:
        maior = menor = n
    else:
        if n > maior:
            maior = n
        if n < menor:
            menor = n
    e = str(input('Quer continuar? [S/N] ')).upper().strip()
media = soma / c
print('Você digitou {} números e a média é {:.2f}.'.format(c, media))
print('O maior valor digitado foi {} e o menor {}.'.format(maior, menor))

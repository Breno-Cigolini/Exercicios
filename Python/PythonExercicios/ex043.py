print('=-'*20)
print('Calculador de Índice de Massa Corporal')
print('=-'*20)
p = float(input('Digite aqui seu peso: '))
a = float(input('Digite aqui sua altura: '))
print('=-'*20)
imc = p / (a**2)
print('Seu IMC é de {:.1f}'.format(imc))
if imc < 18.5:
    print('você está abaixo do peso ideal'.format(imc))
elif 18.5 <= imc < 25:
    print('você está no peso ideal'.format(imc))
elif 25 <= imc < 30:
    print('você está com sobrepeso'.format(imc))
elif 30 <= imc < 40:
    print('você está com obesidade'.format(imc))
elif imc >= 40:
    print('você está com obesidade mórbida'.format(imc))
print('=-'*20)

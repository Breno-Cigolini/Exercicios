valor = float(input('Digite o valor da casa: '))
salario = float(input('Digite seu salário: '))
anos = float(input('Em quantos anos deseja pagar tudo? '))
prestacao = valor / (anos * 12)
if prestacao > 0.3 * salario:
    print('Empréstimo negado.')
elif prestacao < 0.3 * salario:
    print('Para comprar uma casa de R${} em {:.0f} anos, o valor da prestação mensal será de R${:.2f}.'.format(valor, anos, prestacao))

print('='*20, 'Loja do Cibulinha', '='*20)
preco = float(input('Informe o preço do produto: R$'))
print('=-'*30)
print('''FORMA DE PAGAMENTO
[1] à vista no dinheiro
[2] à vista no cartão
[3] 2x no cartão
[4] 3x ou mais no cartão''')
opcao = int(input('Sua escolha: '))
print('=-'*30)
if opcao == 1:
    print('Sua compra de R${:.2f} vai custar R${:.2f} no final.'.format(preco, preco - (preco*0.1)))
elif opcao == 2:
    print('Sua compra de R${:.2f} vai custar R${:.2f} no final.'.format(preco, preco - (preco*0.05)))
elif opcao == 3:
    parcela = preco / 2
    print('Sua compra de R${:.2f} será parcelada em 2x de R${:.2f}.'.format(preco, parcela))
elif opcao == 4:
    tempo = int(input('Quantas vezes deseja parcelar? '))
    if tempo <= 3:
        print('\033[1;31mOpção de pagamento inválida!\033[m')
    else:
        juros = preco * 0.2
        total = preco + juros
        parcelas = total / tempo
        print('Sua compra será parcelada em {}x de R${:.2f} com juros'.format(tempo, parcelas))
        print('Sua compra de R${:.2f} vai custar R${:.2f} no final.'.format(preco, total))
else:
    total = preco
    print('\033[31mOpção inválida de pagamento. Tente novamente.\033[m')
print('=-'*30)

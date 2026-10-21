import moeda

num = float(input("Informe o preço: R$"))
print(f"A metade de {moeda.moeda(num)} é {moeda.metade(num, True)}")
print(f"O dobro de {moeda.moeda(num)} é {moeda.dobro(num, True)}")
print(f"Aumentando o preço em 10%, {moeda.aumentar(num, 10, True)}")
print(f"Reduzindo 13%, temos {moeda.diminuir(num , 13, True)}")

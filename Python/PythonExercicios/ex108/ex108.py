import moeda

num = float(input("Informe o preço: R$"))
print(f"A metade de {moeda.moeda(num)} é {moeda.moeda(moeda.metade(num))}")
print(f"O dobro de {moeda.moeda(num)} é {moeda.moeda(moeda.dobro(num))}")
print(f"Aumentando o preço em 10%, {moeda.moeda(moeda.aumentar(num, 10))}")


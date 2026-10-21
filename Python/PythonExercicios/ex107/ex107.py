import moedas
num = float(input("Informe o preço: R$"))
print(f"A metade de R${num} é R${moedas.metade(num)}")
print(f"O dobro de R${num} é R${moedas.dobro(num)}")
print(f"Aumentando o preço em 10%, R${moedas.aumentar(num, 10)}")
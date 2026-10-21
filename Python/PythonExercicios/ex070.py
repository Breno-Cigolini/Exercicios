#070 -  Crie um programa que leia o nome e o preço de vários produtos. 
# O programa deverá perguntar se o usuário vai continuar ou não. No final, mostre:

#A) qual é o total gasto na compra.

#B) quantos produtos custam mais de R$1000.

#C) qual é o nome do produto mais barato.
s = 0
cont = 0
barato = ""
menor = 0
maismil = 0
while True:
    produto = str(input("Informe o nome do produto: "))
    preco = float(input("Informe o preço do produto: R$"))
    cont += 1
    s += preco
    if preco > 1000:
        maismil += 1
    if cont == 1  or preco < menor:
        menor = preco
        barato = produto
    continuar = " "
    while continuar not in "SN":
        continuar = str(input("Deseja continuar? [S/N] ")).strip().upper()[0]
    if continuar == "N":
        break
print(f"Total gasto na compra: R${s:.2f}")
print(f"Temos {cont} produtos que custam mais de R$1000,00")
print(f"O produto mais barato foi {barato} que custa R${menor:.2f}")

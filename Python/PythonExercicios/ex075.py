#Desenvolva um programa que leia quatro valores pelo teclado e guarde-os em uma tupla. No final, mostre:
num = (int(input("Informe um valor: ")), int(input("Informe um valor: ")), 
     int(input("Informe um valor: ")), int(input("Informe um valor: ")))
# A) Quantas vezes apareceu o valor 9.
cont = 0
print(f"Você digitou os valores: {num}")
# for c in n:
#     if c == 9:
#         cont += 1
print(f"O 9 apareceu {num.count(9)} vezes.")
# B) Em que posição foi digitado o primeiro valor 3.
# for i, c in enumerate(n):
#     if c == 3:
#         break
if 3 in num:    
    print(f"O valor 3 apareceu pela primeira vez na {num.index(3)} posição")
else:
    print("O valor 3 não foi digitado")
# C) Quais foram os números pares.
print("Os valores pares digitados foram: ", end=" ")
for n in num:
    if n % 2 == 0:
        print(n, end=" ")

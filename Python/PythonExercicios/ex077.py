#Crie um programa que tenha uma tupla com várias palavras (não usar acentos). 
# Depois disso, você deve mostrar, para cada palavra, quais são as suas vogais.
tupla = ("Programar", "Python", "Trabalhar", "Programador")
for t in tupla:
    print(f"\nNa palavra {t} temos: ", end="")
    for letra in t:
        if letra.upper() in "AEIOU":
            print(letra, end=" ")
            
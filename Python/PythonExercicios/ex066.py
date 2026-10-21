c = 0
s = 0
while True:
    n = int(input("Digite um número (999 para parar): "))
    c += 1  
    if n == 999:
        break
    s += n
print(f"Você digitou {c} números e a soma entre eles foi {s}.")

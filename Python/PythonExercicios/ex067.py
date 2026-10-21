while True:
    t = int(input("Quer ver a tabuada de qual valor? "))
    if t < 0:
        print("-" * 30)
        print("Programa encerrado.")
        break
    print("-" * 30)
    for i in range (1, 11):
        print(f"{t} x {i} = {t*i}")
    print("-" * 30)
    print("Para encerrar, digite um número negativo.")


def leiaint(msg):
    ok = False
    v = 0
    while True:
        n = str(input(msg))
        if n.isnumeric():
            v = int(n)
            ok = True
        else:
            print("ERROR!")
        if ok == True:
            break
    
n = int(input("Digite um valor: "))
print(f"Você acabou de digitar o valor {n}.")

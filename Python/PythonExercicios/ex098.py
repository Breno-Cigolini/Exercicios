from time import sleep

def lin():
    print("-="*30)

def contador(inicio, fim, passo):
    lin()
    print(f"Contagem de {inicio} até {fim} de {passo} em {passo}: ")
    
    if passo < 0:
        passo *= -1
    
    if passo == 0:
        passo = 1

    if inicio < fim:
        cont = inicio
        while cont <= fim:
            print(f"{cont}", end=" ", flush=True)
            sleep(0.5)
            cont += passo
        print("FIM!")
    else:
        cont = inicio
        while cont >= fim:
            print(f"{cont}", end=" ", flush=True)
            sleep(0.5)
            cont -= passo
        print("FIM!")


contador(1, 10, 1)

contador(10, 0, 2)

lin()

print("Agora é sua vez de personalizar a contagem!")
i = int(input("Início: "))
f = int(input("Fim: "))
p = int(input("Passo: "))

contador(i, f, p)

def aumentar(n=0, t=0):
    r = n + (n * t/100)
    return r

def diminuir(n=0, t=0):  
    r = n - (n * t/100)
    return r 

def metade(n=0):
    return n / 2

def dobro(n=0):
    return n * 2

def moeda(n=0):
    return f"R${n:.2f}".replace(".", ",")

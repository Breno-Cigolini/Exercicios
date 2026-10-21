def aumentar(n=0, t=0, format=False):
    r = n + (n * t/100)
    return r if format is False else moeda(r)

def diminuir(n=0, t=0,  format=False):  
    r = n - (n * t/100)
    return r if format is False else moeda(r)

def metade(n=0,  format=False):
    r = n/2
    return r if format is False else moeda(r)

def dobro(n=0,  format=False):
    r = n * 2
    return r if format is False else moeda(r)

def moeda(n=0, moeda="R$"):
    return f"{moeda}{n:>.2f}".replace(".", ",")

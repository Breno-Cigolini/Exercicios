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
    return f"{r:>.2f}" if format is False else moeda(r)

def moeda(n=0, moeda="R$"):
    return f"{moeda}{n:,.2f}".replace(".", ",")

def resumo(n=0, aumento=10, reducao=5):
    print("-"*30)
    print("RESUMO DO VALOR".center(30))
    print("-"*30)
    print(f"""Preço analisado: \t{moeda(n)}
Dobro do Preço: \t{dobro(n, True)}
Metade do Preço: \t{metade(n, True)}
{aumento}% de aumento: \t{aumentar(n, 20, True)}
{reducao}% de redução: \t{diminuir(n, 12, True)}
""")

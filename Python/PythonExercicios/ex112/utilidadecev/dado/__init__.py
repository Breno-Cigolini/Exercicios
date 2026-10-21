def leiaDinheiro(txt):
    v = False
    while not v:
        e = str(input(txt)).replace(",", ".").strip()
        if e.isalpha() or e == "":
            print(f"\033[0;31mERRO: \"{e}\" é um preço inválido!\033[m")
        else:
            v = True
            return float(e)

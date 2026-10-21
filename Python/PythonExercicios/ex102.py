def fatorial(n, show=False):
    f = 1
    for c in range(n, 0, -1):
        if show:
            print(f"{c}", end="")
            if c > 1:
                print(" x ", end="")
            else:
                print(" = ", end="")
        f *= c
    return f

n = int(input("Informe um valor: "))

print(fatorial(n, show=True))

from time import sleep

def linha(txt):
    tam = len(txt)
    print("\033[32m~" * tam)
    print(f"{txt}")
    print("~" * tam)
    print("\033[m")
    
while True:
    
    linha("  SISTEMA DE AJUDA PyHelp  ")
    
    r = str(input("\033[33mDigite a função ou biblioteca -> \033[m")).lower().strip()

    print()

    if r == "fim":
        
        sleep(1)
        print("\033[31m-" * 13)
        print("\033[31m  ATÉ LOGO!  ")
        print("-" * 13)
        print("\033[m")
        break
    
    sleep(1)
    linha(f"  Acessando o manual  do comando '{r}'  ")
    sleep(1)

    print("\033[35m")
    help(r)
    print("\033[m")

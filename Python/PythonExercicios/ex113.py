def leiaint():
    while True:
        try:
            i = int(input("Digite um valor inteiro: "))

        except (ValueError, TypeError):
            print("\033[31mERRO: por favor digite um número inteiro válido.\033[m")
            continue
        except KeyboardInterrupt:
            print("\033[31mO usuário preferiu não continuar...\033[m")
            return 0
        else:
            return i
        
def leiafloat():
    while True:
        try:
            r = float(input("Digite um valor real: "))

        except (ValueError, TypeError):
            print("\033[31mERRO: por favor digite um número real válido.\033[m")
            continue

        except KeyboardInterrupt:
            print("\033[31mO usuário preferiu não continuar...\033[m")
            return 0
        else:
            return r
        

print(f"O valor inteiro digitado foi {leiaint()} e o real {leiafloat()}.")

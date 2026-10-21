from time import sleep


def lerArquivo(nome):
    try:
        a = open(nome, "rt")
    except:
        print("Erro ao ler o arquivo!")
    else:
        print("PESSOAS CADASTRADAS".center(50))
        print("-"*50)
        for linha in a:
            dado = linha.split(";")
            dado[1] = dado[1].strip()
            print(f"{dado[0]:<30}{dado[1]:>3}")
    finally:
        a.close()
        
def arquivoExiste(nome):
    try:
        a = open(nome, "rt")
        a.close()
    except FileNotFoundError:
        return False
    else:
        return True
    
def criarArquivo(nome):
    try:
        a = open(nome, "wt+")
        a.close()
    except:
        print("Houve algum erro na criação do arquivo.")
    else:
        print(f"Arquivo {nome} criado com sucesso.")

arq = "cursoemvideo.txt"

if not arquivoExiste(arq):
    criarArquivo(arq)

def menu():
    print("-"*50)
    print("MENU PRINCIPAL".center(50))
    print("-"*50)

def cadastro():
    for n in range(1, 4):
        print(f"\033[33m{n}- \033[m", end="")
        if n == 1:
            print("\033[36mVer pessoas cadastradas")
        elif n == 2:
            print("\033[36mCadastrar uma pessoa")
        elif n == 3:
            print("\033[36mEncerrar o programa\033[m")
    print("-"*50)

def cadastrar(arq, nome="Desconhecido", idade=0):
    try:
        a = open(arq, "at")
    except:
        print("Houve um erro no arquivo.")
    else:
        try:
            a.write(f"{nome};{idade}\n")
        except:
            print("Houve um erro na hora de escrever os dados.")
        else:
            print(f"Novo registro de {nome} adicionado.")
            a.close()

while True:
    sleep(1)
    menu()
    cadastro()
    try:
        o = int(input("\033[33mSua Opção: \033[m"))
        if o == 1:
            print("-"*50)
            lerArquivo(arq)
            
        elif o == 2:
            print("-"*50)
            print("NOVO CADASTRO".center(50))
            print("-"*50)
            nome = str(input("Nome: "))
            idade = int(input("Idade: "))
            cadastrar(arq, nome, idade)
            
        elif o == 3:
            print("-"*50)
            print("Você escolheu sair...".center(50))
            print("-"*50)
            break
        elif o > 3:
            print("\033[31mERRO! Digite uma opção válida!\033[m")
            continue
    except (ValueError, TypeError):
        print("\033[31mERRO: por favor, digite um número inteiro válido.\033[m")
        continue
    except KeyboardInterrupt:
        print("\033[31mERRO! O usuário preferiu não continuar...\033[m")
        continue

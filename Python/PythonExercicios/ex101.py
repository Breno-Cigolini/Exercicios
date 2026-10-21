from datetime import datetime

def voto(ano):
    idade = datetime.now().year - ano
    if 18 <= idade <= 65:
        return print(f"Com {idade} anos: VOTO OBRIGATÓRIO")
    elif 16 <= idade < 18 or idade >= 66:
        return print(f"Com {idade} anos: VOTO OPCIONAL")
    else:
        return print(f"Com {idade} anos: VOTO NEGADO")
    

print("-"*30)

ano = int(input("Em que ano você nasceu? "))
voto(ano)

#Crie uma tupla preenchida com os 20 primeiros colocados da Tabela do Campeonato Brasileiro de Futebol(10/04/2025),
# na ordem de colocação. Depois mostre:
times = ("Fortaleza", "Juventude", "Vasco", "Cruzeiro", "Grêmio", "Bragantino", "Ceará", "Corinthians", "Flamengo", 
        "Internacional", "Bahia", "São Paulo", "Sport", "Botafogo", "Palmeiras", "Atlético-MG", "Santos", "Mirassol", 
        "Fluminense", "Vitória")
print("Lista de colocados da Tabela do Campeonato Brasileiro de Futebol(10/04/2025):")
print(times)
print("=-"*50)
# a) Os 5 primeiros times.
print(f"Os 5 primeiros times são: {times[0:5]}.")
print("=-"*50)
# b) Os últimos 4 colocados.
print(f"Os últimos 4 colocados são: {times[-4:]}")
print("=-"*50)
# c) Times em ordem alfabética.
print(f"Os times em ordem alfabética ficariam: {sorted(times)}")
print("=-"*50)
# d) Em que posição está o time da Chapecoense.
print("O time da Chapecoense não esta na série A. Ela está na série B.")
print("=-"*50)

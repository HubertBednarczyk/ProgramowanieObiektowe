##ZAD1
# list = []
# for i in range(1,11):
#     a=input("Wpisz liczbe:")
#     list.append(a)
# print(list)

##ZAD2 - Do skonczenia
#import this
# list = []
# i=0
# while True:
#     x = input("Wpisz liczbe: ")
#     if x == 0:
#         break
#     try:
#         x = int(x)
#         list.append(x)
#         print(list)
#     except:
#         print('Podales tą samą liczbe')
#         print('To nie liczba')
# print(list)

#ZAD 3
from typing import List
# lista_2d: List[List[int]] = [
#     [1,0,0],
#     [0,1,0],
#     [0,0,1],
# ]
# print(lista_2d)

#ZAD 4
width = 4
height = 4
matrix = [list(range(width)) for _ in range(height)]
print(matrix)

#Zad 5
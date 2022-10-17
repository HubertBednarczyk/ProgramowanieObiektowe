from typing import List
#Dodawanie elementow do listy
lista_1d: List[float] = [1.5,2.6,5.4]
print(f'przed dodaniem: {lista_1d}')

lista_1d.append(7.8)
print(f'po dodaniu {lista_1d}')
#Usuwanie elementow z listy

lista_1d: List[float] = [1.3,2.9,10.4,40.4,50,3]
print(f'przed usunieciem: {lista_1d}')

del lista_1d[1]
print(f'po usunieciu: {lista_1d}')

#Usuwanie wartosci z listy dwuwymiarowej

lista_2d: List[List[int]] = [
    [1,2,3],
    [4,5,6],
    [7,8,9],
]
print(f'przed usunieciem pierwszego wiersza: {lista_2d}')

del lista_2d[0]
print(f'po usunieciem pierwszego wiersza {lista_2d}')
del lista_2d[:]
print(f'po usunieciu calosci: {lista_2d}')

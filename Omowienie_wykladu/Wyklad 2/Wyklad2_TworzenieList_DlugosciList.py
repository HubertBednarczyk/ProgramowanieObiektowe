#Listy
lista = []

print(lista)

from typing import List, Any

lista: List[str] = ['jeden','dwa','trzy'] #lista zawierajaca trzy elementy typu str
print(lista)

lista: List[Any] = ['jeden',2,'trzy',4]
print(lista)

#Listy dwuwymiarowe

from typing import List
lista_2d: List[List[int]] = [
    [1,2,3],
    [4,5,6],
    [7,8,9],
]
print(lista_2d)

#Listy twojwymiarowe

from typing import List

lista_3d: List[List[List[int]]] = [
    [
        [1,2,3],
        [4,5,6],
        [7,8,9],
    ],
    [
        [11,12,13],
        [14,15,16],
        [17,18,19],
    ]
]

print(lista_3d)

#Sprawdzanie dlugosci list
#jednowymiarowych
from typing import List
lista_1d: List[int] = [1,2,3,4,5]
print(len(lista_1d))
#dwuwymiarowych
lista_2d: List[List[int]] = [
    [1,2,3],
    [4,5,6],
]
print(f'Liczba wierszy: {len(lista_2d)}, liczba kolumn: {len(lista_2d[0])}')

#twojwymiarowych
lista_3d: List[List[List[int]]]=[
    [
        [1,2,3],
        [4,5,6],
        [7,8,9],
    ],
    [
        [11,12,13],
        [14,15,16],
        [17,18,19],
    ]
]

print(f"Liczba wierszy: {len(lista_3d)}, liczba kolumn: {len(lista_3d[0])}")
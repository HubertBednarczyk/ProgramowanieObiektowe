from typing import List, Any
#Pobieranie elementow na wyznaczonych pozycjach
Lista_1d: List[float] = [1.5,4.3,7.8,4.6,10.5]

print(Lista_1d[1])

Lista_2d: List[List[int]] = [
    [1,2,3],
    [4,5,6],
    [7,8,9],
]
print(Lista_2d[0][0])
#Lączenie list
Lista_0: List[int] = [1,2,3]
Lista_1: List[str] = ['hubert','bartek','przemek']

print(Lista_0)
print(Lista_1)
#jednokierunkowych
Lista_new: List[Any] = Lista_0 + Lista_1
print(Lista_new)
Lista_new2: List[Any] = Lista_1 + Lista_0
print(Lista_new2)
#dwukierunkowych

Lista2d_0: List[List[int]] = [
    [1,2,3],
    [4,5,6],
    [7,8,9],
]

Lista2d_1: List[List[float]] = [
    [4.5,12.4,15.2],
    [6.7,6.5,9.0],
    [8.9,6.9,1.2],
]

Lista2d_new0: List[Any] = Lista2d_0 + Lista2d_1
print(Lista2d_new0)
Lista2d_new1: List[Any] = Lista2d_1 + Lista2d_0
print(Lista2d_new1)

lista=[]
for i in range(0,21,2):
    lista.append(i)
print(lista)
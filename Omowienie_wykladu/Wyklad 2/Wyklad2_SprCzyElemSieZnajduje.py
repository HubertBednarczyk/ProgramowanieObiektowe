from typing import List
#sprawdzanie czy element znajduje sie na liscie
lista: List[int] = [1,2,3,4,5,11,44]

print(44 in lista)
print(15 in lista)

#Krotka(tuple)

from typing import Tuple
#jednowymiarowe
tuple = ()
print(tuple)
tuple: Tuple[int] = (1,2,3,4,5)

print(tuple)

#Dwuwymiarowe
tuple_2d: Tuple[Tuple[int]] = (
    (2,4,6),
    (6,7,5),
    (6,3,2),
)

print(tuple_2d)

#Funkcja len() sprawdzanie dlugosci listy

tuple: Tuple[int] = (5,6,9,42)
print(len(tuple))

#Łączenie krotek

tuple_0: Tuple[int] = (4,56,7,8)
tuple_1: Tuple[int] = (5,11,3,44)

tuple_new: Tuple[int] = tuple_0 + tuple_1

print(tuple_new)
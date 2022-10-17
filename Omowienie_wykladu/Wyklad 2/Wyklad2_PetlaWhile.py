a: int = 0
while a < 6:
    print(a)
    a+=1

from typing import Dict, List

di: Dict[int, int] = {}
a: int = 0
while a < 6:
    di[a] = a ** 2
    a+=1
print(di)

#Pętla w pętli (tablica dwuwymiarowa)
lista: List[List[int]] = []
i: int = 0
j: int = 0

while i < 2:
    tmp_row: List[int] = []
    j = 0
    while j < 3:
        tmp_row.append(j)
        j += 1
    lista.append(tmp_row)
    i += 1
print(lista)
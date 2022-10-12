from typing import List
#Petla for
lista: List[int] = [10,20,30,40,50]

for element in lista:
    print(element)

#Tworzenie listy za pomoca petli for
print('-------')
lista2: List[int] = [10,20,30,40,50]
lista_new: List[int] = []

for element in lista2:
    #print(element)
    new_element: int = element * 2
    lista_new.append(new_element)
print(lista_new)
print('---------')
#podstawowa petla
for i in range(1,11):
    print(i)

#Petla w petli
lista: List[List[int]] = []
for i in range(2):
    tmp_row: List[int] = []
    for j in range(3):
        tmp_row.append(j)
    lista.append(tmp_row)
print(lista)
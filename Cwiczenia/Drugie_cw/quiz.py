#Argumenty funkcji - quiz
def func(a, b=4, c=5):
    print(a,b,c)
func(1,2)

def func(a, b, c=5):
    print(a,b,c)
func(1, c=3, b=2)

def func(a, *args):
    print(a,args)
func(1,2,3)

def func(a, **kwargs):
    print(a,kwargs)
func(a=1,c=3,b=2)

def func(a,b,c=3,d=4):
    print(a,b,c,d)
func(1,*(5,6))

#Argumenty funkcji - zadania programistyczne
#2.1
def mult(abc):
    wynik = 1
    for x in range(0,len(abc)):
        wynik = wynik * abc[x]
    return wynik
print(mult([3,5,7]))
print(mult(range(2,8,2)))

#2.2
def multi_ints(a2):
    wynik=1
    for x in range(0,len(a2)):
        if(type(a2[x]) == int):
            wynik = wynik * a2[x]
    return wynik
print(multi_ints([3,3.14,5,"abc",7]))

#2.3
def multiply(*args):
    wynik = 1
    for x in args:
        wynik = wynik * x
    return wynik
print(multiply(3,5,7))

#2.4
def multiply_ints(*args):
    wynik = 1
    for x in args:
        if(type(x)==int):
            wynik = wynik * x
    return wynik
print(multiply_ints(3,3.14,5,"abc",7))

#2.5
def make_car(firma, model, **kwargs):
    slownik = kwargs
    slownik['Firma:'] = firma
    slownik['Model:'] = model
    return slownik
print(make_car("Kia","Picanto",kolor="czerwony"))

#3.1.1
from typing import List
lista_2d: List[List[int]] = [
    [1,3,4],
    [1,9,16],
    [1,27,64],
]

lista = []
lista.append([x for x in range(1,11)])
lista.append([x ** 2 for x in range(1,11)])
lista.append([x ** 3 for x in range(1,11)])
for i in lista:
    print(f'[{i}')

#3.1.2
lista2=[]
suma = 0
suma2 = 0
for x in range(1,11):
    lista2.append([x for x in range(1,x+1)])
    suma = suma + x
    suma2 = suma2 + suma
    print(suma)

for y in lista2:
    print(f'{y}')
print(suma2)

#3.2
def matrix_sum(a: list[list[int]], b: list[list[int]]):
    c: list[list[int]] = a
    for i in range(len(c)):
        for j in range(len(c[i])):
            c[i][j] += b[i][j]
    return c

def matrix_product(a: list[list[int]], b: list[list[int]]):
    c: list[list[int]] = a
    for i in range(len(c)):
        for j in range(len(c[i])):
            c[i][j] *= b[i][j]
    return c

def main():
    car1 = {"Kolor": "cafe mocca", "poj_silniki": 900}
    print(mult((3, 5, 7)))
    print(mult(range(2, 8, 2)))
    # print(mult_ints([3, 3.14, 5, "abc", 7]))
    print(multiply(3, 5, 7))
    print(multiply_ints(3, 3.14, 5, "abc", 7))
    print(make_car("Kia", "Piccanto", kolor="cafe mocca", pojemnosc=900))
    # print(list2d_1)
    # print(list2d_2)
    print(matrix_sum([[1, 2, 3], [4, 5, 6]], [[1, 1, 1], [1, 1, 1]]))
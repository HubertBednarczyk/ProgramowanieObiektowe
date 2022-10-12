#ZAD 1
print("=====Zad1/a======")
a=0
lista = []
for a in range(1,11):
    lista.append(a)
print(lista)

print("=====Zad1/b======")
b=0
lista2 = []
for b in range (0,11):
    lista2.append(b*2)
print(lista2)

print("=====Zad1/c======")
c=0
lista3 = []
for c in range (1,11):
    lista3.append(c**2)
print(lista3)

print("=====Zad1/d======")
d=0
lista4 = []
for d in range (1,11):
    lista4.append(d*0)
print(lista4)

print("=====Zad1/e======")
e=0
lista5 = []
for e in range (0,10):
    lista5.append(e%2)
print(lista5)

print("=====Zad1/f======")
f=0
lista6 = []
for f in range (0,10):
    lista6.append(f%5)
print(lista6)

#ZAD 2
print("=====Zad2/a======")
lista7 = []
a=0
while a<11:
    lista7.append(a)
    a+=1
print(lista7)

print("=====Zad2/b======")
lista8 = []
b=0
while b<11:
    lista8.append(b*2)
    b+=1
print(lista8)

print("=====Zad2/c======")
lista9 = []
c=1
while c<11:
    lista9.append(c**2)
    c+=1
print(lista9)

print("=====Zad2/d======")
lista10 = []
d=0
while d < 11:
    lista10.append(d*0)
    d+=1
print(lista10)

print("=====Zad2/e======")
lista11 = []
e=0
while e < 10:
    lista11.append(e%2)
    e+=1
print(lista11)

print("=====Zad2/f======")
lista12 = []
f=0
while f < 11:
    lista12.append(f%5)
    f+=1
print(lista12)

#ZAD 3
print("=====Zad3======")

lista13=[1,-2,-5,-7,-8,9]
def ile_ujemnych(a):
    i = 0
    for x in range(0,len(a)):
        if(a[x]<0):
            i+=1
    return i
print("zadanie 3:",ile_ujemnych(lista13))

#ZAD 4
print("=====Zad4======")

lista14 = [1,5,8]
def iloczyn(a):
    i=1
    for x in range(0,len(a)):
        i*=a[x]
    return i
print("Zadanie 4:",iloczyn(lista14))

#ZAD 5
print("=====Zad5======")
lista15 = [2,8,5,6]
def minmax(lista):
   min = 0
   max = 0
   for i in lista:
       if min> i:
           min = i
   for i in lista:
       if max< i:
           max = i
   return(min,max)

print('zadanie5:',minmax(lista15))
print(type(minmax(lista15)))

#ZAD 6
lista16 = [1,2,3,4]
def func(lista):
    i=0
    for x in lista:
        if x<0:
            i+=x
        else:
            i-=x
    return i

print("Zadanie 6 :",func(lista16))

#ZAD 7
def func7():
    wynik = []
    ilosc = 0
    while ilosc < 11:
        x = input(f"podaj liczbe, podano ({ilosc} z 10\n>")
        if x.lstrip("-").isdigit():
            wynik.append(x)
            ilosc +=1
        else:
            print('zle')
    print(f"wpisane numery to: {wynik}")

print('zadanie7:',func7())

#ZAD 8
def func8():
    lista17 = []
    for x in range(2,10001):
        lista17.append(x)
    for x in range (2,101):
        for y in lista17:
            if y % x == 0 and y != x:
                lista17.remove(y)
    print(f"zadanie 8: {lista17}")

print(func8())

#ZAD 9_a
lista9_a=[1,2,3,4,5]

def func9_a (lista):
    temp = lista[0]
    lista[0] = lista[-1]
    lista[-1]=temp
    return lista

print("Zadanie 9a:",func9_a(lista9_a))

#Zad 9_b
lista9_b = [1,2,3,4,5]

def func9_b (lista):
    temp = lista[-1]
    for x in range(0,len(lista)):
        if x == len(lista)-1:
            lista[x] = temp
        else:
            lista[x] = lista[x+1]
    return lista

print('zadanie 9b:',func9_b(lista9_b))

#ZAD 9_c
#zad9c
lista9_c = [1,2,3,4,5]
def func9_c (lista):
    for x in range(0,len(lista)):
        if lista[x]%2==0:
            lista[x] = 0
    return lista
print('zadanie 9c:',func9_c(lista9_c))
#zad10
a = [1,2,3]
b = [4,5,6]
c = [1,2,3]

def equals(a,b):

    if len(a) != len(b):
        return 0
    else:
        for x in range (0,len(a)):
            if a[x]!= b[x] :
                return 0

    return 1


print(equals(a,c))
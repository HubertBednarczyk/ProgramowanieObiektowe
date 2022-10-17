from typing import Set
s = set()
print(s)

s: Set[int] = ([1,2,1,3,4,6])

print(s)

#Dodawanie wartosci do zbioru

s: Set[int] = set()
print(s)

s.add(20)
s.add(50)
s.add(100)

print(s)

s.add(10)

print(s)

s.add(150)

print(s)

#Usuwanie elementow ze zbioru

s: Set[int] = set([1,1,2,3,3,5,10,55])
print(f'Przed usunieciems {s}')
print(10 in s)
s.remove(10)
print(f'Po usunieciu: {s}')

#dzialania na zbiorach

a: Set[int] = set([1,2,3,4,5])
b: Set[int] = set([22,4])
print(b <= a)
print(b.issubset(a))
print("=====")
#Sprawdzenie czy zbior jest nadzbiorem

a: Set[int] = ([1,3,1,6])
b: Set[int] = ([1,6])

print(a >= b)
#print(a.issuperset(b))

#Suma zbiorow
a: Set[int] = ([1,2,3,4])
b: Set[int] = ([1,9])

#print(a.union(b))

zbior1 = set("tekst")
zbior2 = set("tekst jakiś tam")
print(zbior1.union(zbior2))


# d: Set[int] = a | b
# print(d)



#Czesc wspolmna zbiorow

a: Set[int] = set([1,2,3,4,5])
b: Set[int] = set([1,3,7,11])

d: Set[int] = a & b
print(d)

#Roznica zbiorow

a: Set[int] = set([1,2,3,4,5])
b: Set[int] = set([1,2,3,7,11])

d: Set[int] = a - b

print(d)

#Roznica symetryczna zbiorow

a: Set[int] = set([1,2,3,4,5])
b: Set[int] = set([1,3,7,11])

d: Set[int] = a ^ b
print(d)

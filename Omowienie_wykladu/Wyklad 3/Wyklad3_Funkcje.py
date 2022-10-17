#Wywolywanie funkcji
def foo(a):
    message = f'wartosc argumentu a wynosi: {a}'
    print(message)

foo(5)
b=foo(50)
print(b)
#Funkcja zwraca wartosc
def suma(x,y):
    return x+y
wynik = suma(5,7)
print(wynik)

#Funkcje zwracają wiele wartosci
def calc(x,y):
    sum = x + y
    difference = x - y
    return sum, difference
wynik = calc(10,5)
print(wynik)
print(type(wynik))
print(type(wynik[1]))

#Przekazywanie argumentow do funkcji
def foo(x,y,z):
    print(f'x: {x}, y: {y}, z: {z}')

foo(10,20,30)
foo(z=30,x=10,y=20)

def foo(a, b, *args):
    print(f'a: {a}, b: {b}, argument nr 3: {args[0]}, argument nr 4: {args[1]}')
foo(5,4,30,50)

def foo(x, **kwargs):
    print(f'x: {x}, y: {kwargs["y"]}, z: {kwargs["z"]}')

foo(x=20,z=9,y=6)
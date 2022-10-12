
class MyClass1:
    pass

def foo1():
  pass
#Zmienne rzeczywiste
zmienna = "Ala ma kota"

var_str = 'to jakis tekst'
print(var_str)
var_str = 'to jest \'kolejny\' tekst'
print(var_str)

var_int = 2611
print(var_int)

var_float_0 = 10.0
var_int = 10

print(type(var_float_0))
print(type(var_int))

var_float_1 = int(10)
var_float_2 = float(10)

print(var_float_0)
print(var_float_1)
print(var_float_2)

#Zmienne logiczne
var_bool_0 = False
var_bool_1 = True

print(var_bool_0)
print(var_bool_1)
print(var_bool_0 == var_bool_1)

#Rzutowanie typow danych
a = 20
b = 80.1
c = 'tekst'

type_of_a = type(a)
type_of_b = type(b)
type_of_c = type(c)

print(type_of_a)
print(type_of_b)
print(type_of_c)

print(type(type_of_a))

#Alternatywa na sprawdzanie typow zmiennych
print(isinstance(a,int))
print(isinstance(c,float))

#Konwersja typow zmiennych
var_float = 10.2
var_int = 20
var_int_bool = 0
var_str = '90'
var_str2 = 'hubert'
var_bool = True

float_to_int = int(var_float)
print(type(float_to_int))
print(float_to_int)
print(type(var_float))
print(var_float)

int_to_float = float(var_int)
print(type(int_to_float))
print(int_to_float)
print(type(var_int))
print(var_int)

str_to_float = float(var_str)
print(type(str_to_float))
print(str_to_float)
print(type(var_str))
print(var_str)

# str2_to_float = float(var_str2)
# print(type(str2_to_float))
# print(str2_to_float)

int_to_bool = bool(var_int_bool)
print(type(var_int_bool))
print(var_int_bool)
print(type(int_to_bool))
print(int_to_bool)

bool_to_str = str(var_bool)
print(type(var_bool))
print(var_bool)
print(type(bool_to_str))
print(bool_to_str)

#Wczytywanie danych od uzytkownika
od_usera = input("Wprowasz tekst")
print(od_usera)

#Wczytywanie wartosci int
od_usera_int = int(input("Wprowadz liczbe calkowita: "))
print(od_usera_int)
print(type(od_usera_int))

od_usera_float = float(input("Wprowadz liczbe zmiennoprzecinkowa: "))
print(od_usera_float)
print(type(od_usera_float))

#Pierwiastkowanie
#pierwiastek z 10
import math
print(math.sqrt(10))
#logarytm o podstawie 2 i wartoscci 5 log2(5)
print(math.log(5,2))
#liczba e
print(math.e)
#liczba pi
print(math.pi)
#Trygonometria
print(math.sin(20))
print(math.cos(30))
print(math.tan(40))
#Liczby zespolone
z = 3 + 4j
print(z)

print(z.real) #wartosc rzeczywista
print(z.imag) #wartosc urojona

z0 = 5 + 2j
z1 = 9 + 6j

print(z0 + z1)
print(z0 / z1)
print(z0 ** z1)

#Ciagi znakow i operacje na nich
var_str = 'to jest tekst!'

print(len(var_str))
#pozycje znakow
#pierwszy znak:
print(var_str[0])
#ostatni znak:
print(var_str[-1])
#przedostatni znak:
print(var_str[-2])
#Wyswietlanie fragmentu tekstu:
print(var_str[3:7])

#Zmiana wielkosci znakow
#Z malych na duze
var_str_low: str = 'to sa male litery'

print(var_str_low)
print(var_str_low.upper())
#Z duzych na male
var_str_high: str = 'TO SA DUZE LITERY'
print(var_str_high)
print(var_str_high.lower())

#Zmiana pierwszych liter kazdego slowa na wielką
var_str: str= 'prosty tekst i to jak'

print(var_str)
print(var_str.title())

#Interpolacja tekstow (f-string)
lines_count: int = 3200
space_avg: float = 3.5

summary: str = f'Objetosc kodu wynosi {lines_count} linii, gdzie na kazda linie przypada srednio {space_avg} spacji'
print(summary)

summary_1:str = 'Objetosc kodu wynosi ' + str(lines_count) + 'linii, gdzie na kazda linie przypada srednio' + str(space_avg) + 'spacji'
print(summary_1)

#Slowa kluczowe
#W jezyku python są 33 zarezerwowane slowa kluczowe ktorych nie mozna uzywwac do deklaracji zmiennych
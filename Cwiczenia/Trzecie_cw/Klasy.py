#Zad 1
# class Punkt:
#     def __init__(self, x: float, y: float) -> None:
#         self.x = x
#         self.y = y
#
#     def distance(self, punkt) -> float:
#         return ((punkt.x - self.x)**2 + (punkt.y - self.y)**2)**1/2
#
#
# class NazwanyPunkt:
#     def __init__(self, x: float, y: float, nazwa: str) -> None:
#         self.x = x
#         self.y = y
#         self.nazwa = nazwa
#
#
# def main():
#     a = Punkt(1, 2)
#     b = NazwanyPunkt(2, 6, 'B')
#     print(a.distance(b))
#
# if __name__ == "__main__":
#     main()

#Zad 2
class Adres:
    def __init__(self, nr_domu: int, ulica: str, miasto: str, kod_pocztowy: str, nr_mieszkania=0) -> None:
        self.nr_domu = nr_domu
        self.ulica = ulica
        self.nr_mieszkania = nr_mieszkania
        self.miasto = miasto
        self.kod_pocztowy = kod_pocztowy

    def show(self):
        print(self.nr_domu, self.ulica, "Numer mieszkania: ", self.nr_mieszkania)
        print(self.kod_pocztowy, self.miasto)

    def comes_before(self, other):
        if int(other.kod_pocztowy[2:5]) < int(self.kod_pocztowy[2:5]):
            return True
        else:
            return False


def main():
    adres1 = Adres(11, "notak", "Sosnowiec", "24-131", 11)
    adres2 = Adres(12, "nonie", "Olsztyn", "23-124")
    adres1.show()
    adres2.show()
    print(adres2.comes_before(adres1))


if __name__ == "__main__":
    main()
#Zad 3
# class SodaCan:
#     def __init__(self,wysokosc: int = 15,promien: int = 3):
#         self.wysoko = wysokosc
#         self.promyk = promien
#
#     def show(self):
#         return f'Wysokosc puszki: {self.wysoko}, promien puszki: {self.promyk}'
#
#     def get_surface_area(self,h,r):
#         podstawa = 3.14 * (r**2)
#         boki = 2 * 3.14 * r * h
#         calkowite = 2 * 3.14 * r*(r+h)
#         return f'Pole podstawy: {podstawa}, pole boków: {boki}, pole calkowite: {calkowite}'
#     def get_volume(self,h,r):
#         podstawa = 3.14 * (r ** 2)
#         objetosc = podstawa * h
#         return f'Objetosc puszki wynosi: {objetosc}'
#
# puszka=SodaCan()
# print(puszka.show())
# print(puszka.get_surface_area(15,3))
# print(puszka.get_volume(15,3))
#Zad 4

# class Car:
#     def __init__(self,wydajnosc,max_paliwa: int = 0):
#         self.ile_pali = wydajnosc
#         self.max = max_paliwa
#         self.poziom = 0
#         self.dystans = 0
#
#     def show_car(self):
#         return f'Wydajnosc {self.ile_pali}km/1L, max pojemnosc baku: {self.max} L'
#     def drive(self, kilometry: int):
#         zmienna = (kilometry / self.ile_pali)
#         self.poziom = (self.poziom - zmienna)
#         return f'Przejechales: {kilometry} km, spaliles: {zmienna} litrów'
#     def get_fuel_level(self):
#         return f'Poziom paliwa: {self.poziom}'
#     def add_fuel(self, tankowanie: int):
#         print(f'Tankuje {tankowanie} litrów')
#         if (self.poziom + tankowanie)>self.max:
#             return f'Tyle mozesz zatankowac: {self.max - self.poziom}'
#         else:
#             self.poziom += tankowanie
#             return 'Zatankowales pomyslnie'
#
# my_car = Car(20,40)
# print(my_car.show_car())
# print(my_car.get_fuel_level())
# print(my_car.add_fuel(4))
# print(my_car.get_fuel_level())
# print(my_car.add_fuel(40))
# print(my_car.get_fuel_level())
# print(my_car.add_fuel(5))
# print(my_car.get_fuel_level())
# print(my_car.drive(40))
# print(my_car.get_fuel_level())
# print(my_car.drive(60))
# print(my_car.get_fuel_level())

#Zad 5
# class Student:
#     def __init__(self,imie: str, nazwisko: str, *args):
#         self.imie = imie
#         self.nazwisko = nazwisko
#         self.liczba_quizow = len(args)
#         try:
#             suma = 0
#             for i in args:
#                 suma += i
#             self.srednia_quizow = suma / self.liczba_quizow
#         except ZeroDivisionError:
#             self.srednia_quizow = 0
#
#     def add_quiz(self,score):
#         self.srednia_quizow = ((self.srednia_quizow * self.liczba_quizow) + score) / (self.liczba_quizow + 1)
#         self.liczba_quizow += 1
#
#     def get_total_score(self):
#         return self.srednia_quizow * self.liczba_quizow
#
#     def get_average_score(self):
#         return self.srednia_quizow
#
#     def get_name(self,imie):
#         self.imie = imie
#
# studencik = Student('Hubert','Bednarczyk')
# studencik.get_name('Ania')
# print(studencik.imie)
# studencik.add_quiz(20)
# studencik.add_quiz(10)
# print(studencik.liczba_quizow)
# print(studencik.get_total_score())
# print(studencik.get_average_score())
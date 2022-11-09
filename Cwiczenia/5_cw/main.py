#Ćwiczenia sprawdzające podstawową wiedzę z klas
#Zad 1
# import array
# def zad1(n):
#     print(dir(array))
# zad1(3)

#Zad 2

# class Zad2:
#     pass
#     def zad2(self):
#         print(dir(Zad2))
# z=Zad2()
# z.zad2()

#Zad 3

# class Zad3:
#     def __init__(self, x: int, y: int):
#         self.x = x
#         self.y = y
#
#     def potega(self):
#         return self.x**self.y
#
# z3=Zad3(2,3)
# print(z3.dzielenie())

#Zad 4
# import builtins
# def zad4():
#     liczba  = -155
#     print(abs(liczba))
#     print(dir(builtins))
#
# zad4()

#Zad 5
# import inspect
# class Student:
#     def __init__(self,nazwa_ucznia: str,klasa_ucznia: str,student_id: int):
#         self.nazwa_ucznia = nazwa_ucznia
#         self.klasa_ucznia = klasa_ucznia
#         self.student_id = student_id
#
#     def show(self):
#         return f'Uczeń: {self.nazwa_ucznia}, klasa: {self.klasa_ucznia}, ID: {self.student_id}'
#
# studenciak1 = Student('Hubert','2IO',162135)
# studenciak2 = Student('Kamil','3IO',164335)
# studenciak3 = Student('Norbert','4IO',342335)
#
# print(studenciak1.show())
# print(studenciak2.show())
# print(studenciak3.show())
# print(inspect.getfullargspec(studenciak1.__init__))


#Zad 6

# def student_data(student_id: int,nazwa_ucznia: str,klasa_ucznia: str):
#     x = str(input("Wpisz: "))
#     if x == nazwa_ucznia or x == klasa_ucznia:
#         return f'Nazwa ucznia: {nazwa_ucznia} Klasa: {klasa_ucznia}'
#     return f'ID studenta: {student_id}'
#
# print(student_data(123534,'hubert','czwarta'))

#Zad 7

# class Student:
#     def __init__(self,imie: str,nazwisko: str,ID: int):
#         self.imie = imie
#         self.nazwisko = nazwisko
#         self.ID = ID
#
#     def typ(self):
#         print(type(Student))
#
# z7 = Student('hubert','bednarczyk','162135')
# z7.typ()
# print(z7.__dict__)
# print(Student.__dict__)
# print(Student.__module__)

#Zad 8

# class Student(object):
#     pass
# class Marks(object):
#     pass
#
# s = Student()
# s.a=10
# s.a
# print(dir(Student))
#
# m = Marks()
# m.b=10
# m.b
# print(dir(Student))

#Zad 9

# class Student:
#     def __init__(self, student_name: str = 'hubert', marks: int = 5):
#         self.student_name = student_name
#         self.marks = marks
#     def show(self):
#         return f'Przed zmianami: Nazwa={self.student_name}, Ocena= {self.marks}'
#
#     def show2(self):
#         self.student_name = 'bartek'
#         self.marks = 4
#         return f'Po zmianach: Nazwa={self.student_name}, Ocena= {self.marks}'
# s=Student()
# print(s.show())
# print(s.show2())

#Zad 10
# class Student:
#     def __init__(self,student_id,student_name):
#         self.student_id = student_id
#         self.student_name = student_name
#
# czlowiek = Student(162135,'hubert')
# Student.student_class = 5
# print(Student.__getattribute__)
#
# delattr(czlowiek, 'student_name')
# print(Student.__dict__)

# class Student:
#     student_id = 'V10'
#     student_name = 'Jacqueline Barnett'
# print("Original attributes and their values of the Student class:")
# for attr, value in Student.__dict__.items():
#     if not attr.startswith('_'):
#         print(f'{attr} -> {value}')
# print("\nAfter adding the student_class, attributes and their values with the said class:")
# Student.student_class  = 'V'
# for attr, value in Student.__dict__.items():
#     if not attr.startswith('_'):
#         print(f'{attr} -> {value}')
# print("\nAfter removing the student_name, attributes and their values from the said class:")
# del Student.student_name
# #delattr(Student, 'student_name')
# for attr, value in Student.__dict__.items():
#     if not attr.startswith('_'):
#         print(f'{attr} -> {value}')


#Niewiele trudniejsze ćwiczenia sprawdzające podstawową wiedzę

#Zad 1
# class Zad1:
#     def get_string(self):
#         x = str(input("Wpisz cos: "))
#         print(x)
#     def print_string(self):
#         y = str(input("Wpisz cos: "))
#         return y.upper()
#
# z1 = Zad1()
#
# z1.get_string()
# print(z1.print_string())

#Zad 2

# class Rectangle:
#     def __init__(self, dlugosc, szerokosc):
#         self.dlugosc = dlugosc
#         self.szerokosc = szerokosc
#     def pole(self):
#         return self.dlugosc*self.szerokosc
#
# pole = Rectangle(2,3)
#
# print(pole.pole())

#Zad 3

# class Circle:
#     def __init__(self, promien):
#         self.promien = promien
#     def pole(self):
#         return 3.14*(self.promien**2)
#
#     def obwod(self):
#         return 2*3.14*self.promien
#
# zad3 = Circle(3)
#
# print(zad3.pole())
# print(zad3.obwod())

#Zad 4

# class Instancja:
#     def nazwa(self,nazwa):
#         return nazwa
#
# i = Instancja()
# print(i.__class__.__name__)


#KLASY
#Zad 1
# class American:
#     def __init__(self,imie:str ='Hubert',nazwisko:str = 'Bednarczyk',wiek:int = 22):
#         self.imie = imie
#         self.nazwisko = nazwisko
#         self.wiek = wiek
#     def __str__(self):
#         return f'Name: {self.imie}, Lastname: {self.nazwisko},age: {self.wiek}'
#     @staticmethod
#     def print_nationality(nation:str = 'American'):
#         return f'Oto pochodzenie: {nation}'
#
# zad1 = American()
# print(zad1.__str__())
# print(zad1.print_nationality())

#Zad 2

# class American():
#     def __init__(self,imie:str ='Hubert',nazwisko:str = 'Bednarczyk',wiek:int = 22):
#         self.imie = imie
#         self.nazwisko = nazwisko
#         self.wiek = wiek
#     def show(self):
#         print(f'Name: {self.imie}, Lastname: {self.nazwisko},age: {self.wiek}')
#
# class NewYorker(American):
#     def show2(self):
#         print(f'Name: {self.imie}, Lastname: {self.nazwisko},age: {self.wiek}')
#
#
# zad2 = NewYorker()
# zad2.show()
# zad2.show2()

#Zad 3

class Shape():
    def __init__(self,kolo:int = 0):
        self.kolo = kolo
    def area(self):
        return self.kolo
class Square(Shape):
    def __init__(self, dlugosc):
        self.dlugosc = dlugosc
    def area(self):
        return self.dlugosc * self.dlugosc

zad3 = Square(5)
print(zad3.area())




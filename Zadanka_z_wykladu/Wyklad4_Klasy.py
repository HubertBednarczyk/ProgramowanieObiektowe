# #Zad 1
# class Kwadrat:
#     def __init__(self,bok1: int):
#         self.bok = bok1
#
#     def pole_kwadratu(self):
#         return self.bok * self.bok
#
#     def obwod_kwadratu(self):
#         return self.bok + self.bok + self.bok + self.bok
#
# parametry = Kwadrat(5)
#
# print(f'Pole kwadratu: {parametry.pole_kwadratu()}, Obwod kwadratu: {parametry.obwod_kwadratu()}')

#Zad 2

# class Trojkat_Rowno:
#     def __init__(self,side: int, height: int):
#         self.dlugosc = side
#         self.wysokosc = height
#
#     def area(self):
#         return 0.5 * self.dlugosc * self.wysokosc
#
#     # def perimeter(self):
#     #     return
#
# parametry = Trojkat_Rowno(2,3)
#
# print(f'Pole trojkata: {parametry.area()}')

#Zad 3
# print([x*x for x in range(11,21)])
# print([4*x for x in range(11,21)])

#Zad 4
# class Tree:
#     def __init__(self,name: str,height: int,leafs: int):
#         self.nazwa = name
#         self.wysokosc = height
#         self.liczba_lisci = leafs
#
#     def grow_up(self,rosnie: int) -> None:
#         self.wysokosc += rosnie
#
#     def grow_wide(self, rosniew: int) -> None:
#         self.liczba_lisci += rosniew
#
#     def show(self):
#         return f'{self.nazwa} {self.wysokosc} {self.liczba_lisci}'
#
# drzewko1: Tree = Tree('Dąb',198,25453)
# drzewko2: Tree = Tree('Kasztan',165,56234)
# drzewko3: Tree = Tree('Jałowiec',30,12343)
# drzewko4: Tree = Tree('Buka',47,53457)
# drzewko5: Tree = Tree('Głóg',122,79876)
#
# print(drzewko1.show()+"|"+drzewko2.show()+"|"+drzewko3.show()+"|"+drzewko4.show()+"|"+drzewko5.show())
#
# drzewko1.grow_up(30)
# drzewko4.grow_up(30)
# print('Po zmianie: \n')
# print(drzewko1.show())
# print(drzewko4.show())

#Zad 5
# class Matrix:
#     def __init__(self):


#Zad 6
# class Time:
#     def __init__(self, hours: int=0, minutes: int=0):
#         self.godziny = hours
#         self.minuty = minutes
#
#     def add_time

# #Prosta definicja klasy
# #Wypada na poczatku klasy dodawac tzw. docstringa
#
# class MyNewClass:
#     '''Jestem docstringiem. Wlasnie stworzylismy nowa klase'''
#     pass
#
# #Przyklad prostej klasy
#
# class MojDom:
#     '''Prosta klasa moj dom'''
#     windows = 10
#
#     def how_many_windows(self):
#         return self.windows
#
# print(MojDom.windows)
# print(MojDom.how_many_windows)
# print(MojDom.__doc__) # drukowanie docstringa
#
# dom1 = MojDom()
# dom2 = MojDom()
# dom3 = MojDom()
#
# print(f'Liczba okien w domu 1: {dom1.windows}')
# print(f'Liczba okien w domu 2: {dom2.windows}')
# print(f'Liczba okien w domu 3: {dom3.windows}')
#
# dom1.windows = 20
# dom2.windows = 5
# dom3.windows = 15
#
# print(f'Liczba okien w domu 1: {dom1.windows}')
# print(f'Liczba okien w domu 2: {dom2.windows}')
# print(f'Liczba okien w domu 3: {dom3.windows}')
#
# print(MojDom.how_many_windows(dom1))

#Inicjalizator # metoda gdzie inicjujemy wszystkie zmienne
class MyDreamHouse:
    def __init__(self,window_count, door_count, color_name):
        self.windows = window_count
        self.doors = door_count
        self.color = color_name
        self.age = 0
dream_house1=MyDreamHouse(6,10,'red')
dream_house2=MyDreamHouse(8,5,'green')
dream_house3=MyDreamHouse(10,15,'blue')
print(f'Dom marzen 1: liczba okien: {dream_house1.windows}, liczba drzwi: {dream_house1.doors}, kolor: {dream_house1.color}, wiek: {dream_house1.age}')
print(f'Dom marzen 2: liczba okien: {dream_house2.windows}, liczba drzwi: {dream_house2.doors}, kolor: {dream_house2.color}, wiek: {dream_house2.age}')
print(f'Dom marzen 3: liczba okien: {dream_house3.windows}, liczba drzwi: {dream_house3.doors}, kolor: {dream_house3.color}, wiek: {dream_house3.age}')

dream_house1.doors = 25
print(f'Dom marzen 1: liczba okien: {dream_house1.windows}, liczba drzwi: {dream_house1.doors}, kolor: {dream_house1.color}, wiek: {dream_house1.age}')




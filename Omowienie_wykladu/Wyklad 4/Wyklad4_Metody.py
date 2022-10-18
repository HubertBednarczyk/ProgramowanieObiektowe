class MyDreamHouse:
    def __init__(self,window_count,door_count,color_name,age_number):
        self.windows = window_count
        self.door = door_count
        self.color = color_name
        self.age = age_number
    def doors_and_windows(self):
        return self.windows + self.door

    def age_it(self,years):
        self.age = self.age + years

dream_house1 = MyDreamHouse(6,10,'red',4)
dream_house2 = MyDreamHouse(8,5,'blue',5)
dream_house3 = MyDreamHouse(19,20,'green',10)

print(f'Dom marzen 1: Liczba okien {dream_house1.windows}, liczba drzwi: {dream_house1.door}, kolor: {dream_house1.color}, wiek: {dream_house1.age} ')
print(f'Dom marzen 2: Liczba okien {dream_house2.windows}, liczba drzwi: {dream_house2.door}, kolor: {dream_house2.color}, wiek: {dream_house2.age} ')
print(f'Dom marzen 3: Liczba okien {dream_house3.windows}, liczba drzwi: {dream_house3.door}, kolor: {dream_house3.color}, wiek: {dream_house3.age} ')


#Za pomoca metody doors_and_windows sprawdzamy ile drzwi i okien ma kazdy z domow
print(f'Liczba drzwi i okien w domu 1: {dream_house1.doors_and_windows()}')
print(f'Liczba drzwi i okien w domu 2: {dream_house2.doors_and_windows()}')
print(f'Liczba drzwi i okien w domu 3: {dream_house3.doors_and_windows()}')

dream_house1.age_it(3)
dream_house2.age_it(5)
dream_house3.age_it(6)

print(f'Dom marzen 1: Liczba okien {dream_house1.windows}, liczba drzwi: {dream_house1.door}, kolor: {dream_house1.color}, wiek: {dream_house1.age} ')
print(f'Dom marzen 2: Liczba okien {dream_house2.windows}, liczba drzwi: {dream_house2.door}, kolor: {dream_house2.color}, wiek: {dream_house2.age} ')
print(f'Dom marzen 3: Liczba okien {dream_house3.windows}, liczba drzwi: {dream_house3.door}, kolor: {dream_house3.color}, wiek: {dream_house3.age} ')

#Usuwanie atrybutow i obiektow

#del dream_house1.windows
#print(dream_house1.windows)
#Ciezkie do zrobienia
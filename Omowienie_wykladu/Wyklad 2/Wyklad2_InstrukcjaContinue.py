#continue
for i in range(2,6):
    if i == 3: # jezeli liczba wynosi 3 to przerywamy petle i przechodzimy do nastepnego przebiegu, czyli do nastepnej liczby
        continue
    for j in range(2,5):
        score: int = i ** j
        print(f'{i}^{j}={score}')

#Instrukcja break

while True:
    value: int = int(input('Podaj liczbe: '))

    if value == 0:
        break
    print(f'{value}^2 = {value ** 2}')

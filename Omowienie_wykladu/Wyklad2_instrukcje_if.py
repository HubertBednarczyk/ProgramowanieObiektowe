a: int = 8
b: int = 10

if a > b:
    print('a jest wieksze')
else:
    print('b jest wieksze lub rowne')

# a: int = int(input('podaj a:'))
# b: int = int(input('podaj b: '))
# if a > b:
#     print('a jest wieksze')
# elif a < b:
#     print('a jest mniejsze')
# else:
#     print('obie wartosci sa rowne')

#spojniki logiczne

a: int = int(input('Podaj liczbe: '))
if a > 100 and a%2 == 0:
    print('parzysta liczba > 100')
else:
    print('cos innego')
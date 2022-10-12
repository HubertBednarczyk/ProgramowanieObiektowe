# a,b,c = 3,4,5
# print(b)
# print(c)
#
# a,b = b,a
#
# print(b)
#
##ZAD 1

styczen = 31
luty = 29
marzec = 31
print(styczen+luty+marzec)
##ZAD 2
suma = 0
for i in range(1,11):
    suma+=i
print(suma)
##ZAD 3
suma = 1
for i in range(1,11):
    suma*=i
print(suma)
##ZAD 4
konto = 1000
pierwszy_rok=konto+(konto*0.06)
drugi_rok=pierwszy_rok+(pierwszy_rok*0.06)
trzeci_rok=drugi_rok+(drugi_rok*0.06)

print(f"Pierwszy rok {pierwszy_rok},\ndrugi rok {drugi_rok}, \ntrzeci rok {trzeci_rok}")


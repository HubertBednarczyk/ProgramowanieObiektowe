import math
#Zad 1
# def foo(x: int, y: int, tekst: str):
#     if tekst == "+":
#         print('Wybrales dodawanie')
#         return x + y
#     elif tekst == "-":
#         print('Wybrales odejmowanie')
#         return x - y
# print(foo(5,4,"-"))

#Zad 2
# def foo(x0,x1,y0,y1):
#     return f'{x0 - x1},{y0 - y1}'
# print(foo(9,6,10,7))

#Zad 3
# def foo(a: int, b: int, c: int):
#     delta = (b*b) - (4 * a * c)
#     if delta < 0:
#         print(f'Delta rowna sie: {delta}')
#         print('Gdy delta jest ujemna, trojmian kwadratowy nie ma pierwaistkow rzeczywistych')
#     else:
#         pierwiastekzDelty = math.sqrt(delta)
#         print(f'Delta jest rowna: {delta}')
#         print(f'Pierwiastek z delty rowna sie: {pierwiastekzDelty}')
#         x1 = (-b - pierwiastekzDelty) / (2*a)
#         x2 = (-b + pierwiastekzDelty) / (2*a)
#         return x1,x2
#
# print(foo(1,5,6))

#Zad 4
# def foo(lista):
#     return min(lista)
# print(foo([5,4,3]))

#Zad 5
# def najdluzszy(lista):
#     return max(lista, key=len)
#
# print(najdluzszy(['pierwszy','drugiuuuuu']))

#Zad 6
# def srednia(lista):
#     return (lista[0] + lista[1] + lista[2]) / len(lista)
# print(srednia([5,4,3]))

#Zad 7
# def foo(v0,w0,v1,w1):
#     #print(f'v0: {v0}, w0: {kwargs["w0"]}, v1: {kwargs["v1"]}, w1: {kwargs["w1"]}')
#     return f'{((v0*w0)+(v1*w1))}/{(w0+w1)}'
#
# print(foo(v0=2,w0=0.6,v1=4,w1=0.4))

#Zad 8
# def foo(lista):

#Zad 9
def foo(tekst):
    if tekst[::-1] == tekst:
        return True
    return False

print(foo("hubert"))
print(foo("owocowo"))

#Zad 10

#Przyklad main
# import pierwszy_pakiet, drugi_pakiet
#
#
# def main():
#     ...
#     ...
#     ...
#
#
# if __name__ == "__main__":
#     main()

#Funkcje zagnieżdżone

# def foo(x: int, y: int, z:int) -> int:
#     def suma_dwa(a: int,b: int)-> int:
#         return a + b
#     print(f'suma wynosi {suma_dwa(y,z)}')
#     return suma_dwa(x,y)
# print(foo(20,30,40))
# suma_dwa(2,3)

# def foo() -> None:
#     var: int = 10
#     def foo2() -> None:
#         print(var)
#     foo2()
# foo()

def foo() -> None:
    var: int = 10
    def foo2() -> None:
        nonlocal var

        var = 20
    foo2()
    print(var)
foo()
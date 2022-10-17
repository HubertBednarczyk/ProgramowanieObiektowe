#Wartosci domyslne argumentow
def foo(x = 4,  y = 5, z = 6):
    print(f'x: {x}, y: {y}, z: {z}')

foo(5,6,7)

foo()
foo(y=10)

#Typowanie funkcji
def get_message(name: str = 'Janusz', amount: int = 5) -> str:
    message: str = f'{name} ma {amount} jablek'
    return message

message:str=get_message('Czeslaw',10)
print(message)
print(get_message())

#Zmienne globalne
var: int = 10
def foo() -> None:
    var = 9
    print(var)
foo()
print(var)

var:int = 10
def foo() -> None:
    global var
    var = 20
foo()
print(var)
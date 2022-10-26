from collections.abc import Callable

def inc(x):
    return x+1

def dec(x):
    return x-1

def operate(func, x)-> float:
    return func(x)

def main():
    print(operate(inc,3))
    print(operate(dec(3))

    new = is_called
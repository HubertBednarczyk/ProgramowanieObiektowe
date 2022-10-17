from typing import Dict, Any
#Dwie metody stworzenia slownika
slownik = {}
slownik_2 = dict()
print(slownik)
print(slownik_2)
#Dodawanie kluczy i wartosci do slownika
di: Dict[int,str] = {
    1: 'jeden',
    2: 'dwa',
    3: 'trzy',
}
print(di)

#Dodawanie za pomoca funkcji Any

di: Dict[Any,Any] = {
    1: 'jeden',
    'dwa': 2,
}

print(di)

#Pobieranie wartosci ze slownikow

di: Dict[str,str] = {
    'one': 'jeden',
    'two': 'dwa',
    'three': 'trzy',
}

print(di['two'])
print('dwa' in di)

#Dodawanie nowych par do slownik

di: Dict[str,str] = {
    'one': 'jeden',
    'two': 'dwa',
    'three': 'trzy',
}
print(f'Przed dodaniem nowego klucza: {di}')

di['four'] = 'cztery'
print(f'Po dodaniu klucza: {di}')

#Modyfikacja wartosci w slownikach
di: Dict[str,str] = {
    'one': 'jeden',
    'two': 'dwa',
    'three': 'trzy',
}
print(f'Przed modyfikacja wartosci: {di}')

di['three'] = '3'
print(f'po modyfikacji wartosci: {di}')

#Usuwanie par w slowniku

di: Dict[str,str] = {
    'one': 'jeden',
    'two': 'dwa',
    'three': 'trzy',
}
print(f'Przed usunieciem: {di}')

del di['two']
print(f'Po usunieciu: {di}')

#Dlugosc slownika
di: Dict[str,str] = {
    'one': 'jeden',
    'two': 'dwa',
    'three': 'trzy',
}
print(len(di))
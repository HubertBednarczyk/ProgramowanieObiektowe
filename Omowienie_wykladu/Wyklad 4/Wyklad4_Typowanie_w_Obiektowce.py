class Phone:
    '''Typowanie w obiektowce'''
    manufacturer: str
    model: str
    owner_id: int

    def __init__(self,manufacturer: str,model: str,owner: int) -> None:
        self.manufacturer = manufacturer
        self.model = model
        self.owner_id = owner

    def get_phone_name(self) -> str:
        return f'{self.manufacturer} {self.model} ID: {self.owner_id}'

    def change_owner(self,owner_id: int) -> None:
        if owner_id == self.owner_id:
            print(f'nowy wlasciciel nie moze byc wlascicielem co teraz')
        self.owner_id = owner_id
iphone_x: Phone = Phone('Apple','Iphone X',1)
iphone_xs: Phone = Phone('Apple','Iphone XS',2)

print(iphone_x.get_phone_name())
print(iphone_xs.get_phone_name())

iphone_x.change_owner(3)
print(iphone_x.owner_id)

class LiczbyZespolone:
    real: float
    imag: float

    def __init__(self, r:float=0,i: float = 0) -> None:
        self.real = r
        self.imag = i

    def get_data(self) -> None:
        print("{0}+{1}j".format(self.real, self.imag))

c1 = LiczbyZespolone(2,3)
c2 = LiczbyZespolone()
c3 = LiczbyZespolone(4)

c1.get_data()
c2.get_data()
c3.get_data()
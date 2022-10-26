def wzglednie(a: int, b: int) -> int:
    if b==0:
        return a
    return (b,a%b)

class Wymierna:
    def __init__(self, licznik: int = 0, mianownik: int = 1):

        if type(licznik) != int:
            licznik = int(licznik)

        if type(mianownik) != int:
            mianownik = int(mianownik)

        self.licznik = licznik
        self.mianownik = mianownik

    def get_licznik(self):
        return f'Tak wyglada licznik: {self.licznik}'

    def get_mianownik(self):
        return f'Tak wyglada mianownik: {self.mianownik}'

    def __repr__(self):
        return f'{self.licznik} / {self.mianownik}'

    def __float__(self):
        return self.mianownik/self.mianownik

    def __add__(self, other):
        temp = Wymierna()
        temp.mianownik = self.mianownik * other.mianownik
        temp.licznik = self.licznik * other.mianownik + other.licznik * self.mianownik
        return temp
    def __sub__(self, other):
        temp = Wymierna()
        temp.mianownik = self.mianownik * other.mianownik
        temp.licznik = self.licznik * other.mianownik - other.licznik * self.mianownik
        return temp
    def __eq__(self, other):
        temp1 = Wymierna()
        temp2 = Wymierna()
        temp1.mianownik = self.mianownik * other.mianownik
        temp2.mianownik = self.mianownik * other.mianownik
        temp1.licznik = self.licznik * other.mianownik
        temp2.licznik = other.licznik * self.mianownik
        if temp1.licznik > temp2.licznik:
            return false
        else:
            if temp1.licznik == temp2.licznik:
                return True
        return False
    def __ne__(self, other):
        temp1 = Wymierna()
        temp2 = Wymierna()
        temp1.mianownik = self.mianownik * other.mianownik
        temp2.mianownik = self.mianownik * other.mianownik
        temp1.licznik = self.licznik * other.mianownik
        temp2.licznik = other.licznik * self.mianownik
        if temp1.licznik != temp2.licznik:
            return True
        return False
    def __lt__(self, other):
        temp1 = Wymierna()
        temp2 = Wymierna()
        temp1.mianownik = self.mianownik * other.mianownik
        temp2.mianownik = self.mianownik * other.mianownik
        temp1.licznik = self.licznik * other.mianownik
        temp2.licznik = other.licznik * self.mianownik
        if temp1.licznik < temp2.licznik:
            return True
        return False
    def __le__(self, other):
        temp1 = Wymierna()
        temp2 = Wymierna()
        temp1.mianownik = self.mianownik * other.mianownik
        temp2.mianownik = self.mianownik * other.mianownik
        temp1.licznik = self.licznik * other.mianownik
        temp2.licznik = other.licznik * self.mianownik
        if temp1.licznik <= temp2.licznik:
            return True
        return False
    def __gt__(self, other):
        temp1 = Wymierna()
        temp2 = Wymierna()
        temp1.mianownik = self.mianownik * other.mianownik
        temp2.mianownik = self.mianownik * other.mianownik
        temp1.licznik = self.licznik * other.mianownik
        temp2.licznik = other.licznik * self.mianownik
        if temp1.licznik > temp2.licznik:
            return True
        return False
    def __ge__(self, other):
        temp1 = Wymierna()
        temp2 = Wymierna()
        temp1.mianownik = self.mianownik * other.mianownik
        temp2.mianownik = self.mianownik * other.mianownik
        temp1.licznik = self.licznik * other.mianownik
        temp2.licznik = other.licznik * self.mianownik
        if temp1.licznik >= temp2.licznik:
            return True
        return False
    def __mul__(self, other):
        temp = Wymierna()
        temp.mianownik = self.mianownik * other.mianownik
        temp.licznik = self.licznik * other.licznik
        return temp
    def __truediv__(self, other):
        temp = Wymierna()
        temp.mianownik = self.mianownik * other.licznik
        temp.licznik = self.licznik * other.mianownik
        return temp
p = Wymierna(1,3)
q = Wymierna(2,4)

liczby = Wymierna()
print(liczby.get_licznik())
print(liczby.get_mianownik())
print(liczby.__repr__())
print(liczby.__float__())
print(p+q)
print(p-q)
print(p==q)
print(p!=q)
print(p<q)
print(p<=q)
print(p>q)
print(p>=q)
print(p*q)
print(p/q)


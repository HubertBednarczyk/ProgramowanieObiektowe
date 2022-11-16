class Osoba:
    __slots__ = ["nazwisko","rok_urodzenia"]

    def __set__(self, instance, value):
        self.nazwisko = instance
        self.rok_urodzenia = value

    def __del__(self):
        del self.nazwisko
        del self.rok_urodzenia

    def __str__(self):
        return f'{self.nazwisko}, {self.rok_urodzenia}'

    def get_ile(self,cls):
        return cls.ile

    def zwieksz_pobory(self,ile_procent):
        
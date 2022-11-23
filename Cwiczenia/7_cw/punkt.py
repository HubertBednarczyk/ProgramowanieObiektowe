class Punkt():
    __slots__ = ('_x','_y')
    def __init__(self,x,y):
        self._x = x
        self._y = y
    @x.setter
    def x(self,wartosc):
        self._x = wartosc
    @y.setter
    def y(self,wartosc):
        self._y = wartosc
    @x.deleter
    def x(self):
        del self._x
    @y.deleter
    def y(self):
        del self._y
    def __repr__(self):
        return f'{self._x}, {self._y}'
    def __str__(self):
        return f'{self._x}, {self._y}'

dpf = Punkt(4,2)

dpf.x = 2

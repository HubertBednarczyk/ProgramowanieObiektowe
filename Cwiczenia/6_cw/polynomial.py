import numpy as np

class Polynomial:
    def __init__(self, coefficients):
        self.coefficients = coefficients
    def deg(self):
        return len(self.coefficients)-1
    def __str__(self):
        self.coefficients = [5,4,3,0,1]
        return self.coefficients
    def __neg__(self):
        minusowe = np.negative(self.coefficients)
        return minusowe
    def __add__(self, other_poly):
        return self.coefficients + other_poly
    # def __sub__(self, other_poly):
    #     x = self.coefficients - other_poly
    #     return x
    # def __mul__(self, other_poly):
    #     wynik = [x*2 for x in my self.coefficients]
    #     return wynik
    def __eq__(self, other_poly):
        if self.coefficients == other_poly:
            return True
        else:
            return False
    def __call__(self, x):
        return self.coefficients.index(x)





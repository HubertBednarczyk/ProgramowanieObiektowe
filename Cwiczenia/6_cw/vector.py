class Vector:
    def __init__(self, punkt1:int ,punkt2: int):
        self.punkt1=punkt1
        self.punkt2=punkt2
    def __repr__(self):
        return f'Pierwszy punkt: {self.punkt1}, drugi punkt: {self.punkt2}'
    def __add__(self,other):
        x1 = self.punkt1 + other
        x2 = self.punkt2 + other
        return f'{self.punkt1}+{other}={x1} {self.punkt2}+{other}={x2}'
    def __sub__(self,other):
        x1 = self.punkt1 - other
        x2 = self.punkt2 - other
        return f'{self.punkt1}-{other}={x1} {self.punkt2}-{other}={x2}'
    def __mul__(self,other):
        x1 = self.punkt1 * other
        x2 = self.punkt2 * other
        return f'{self.punkt1}*{other}={x1} {self.punkt2}*{other}={x2}'
    def __eq__(self):
        if self.punkt1 == self.punkt2:
            return True
        else:
            return False
    def __len__(self):
        return f'Długość len: {self.punkt2-self.punkt1}'
    def __getitem__(self, item):
        print(type(item),item)
    def __str__(self):
        return '(%g, %g)' % (self.punkt1,self.punkt2)
    # def norm(self):
    def inner(self,otherpunkt1,otherpunkt2):
        skalar = (self.punkt1 * self.punkt2)+(otherpunkt1*otherpunkt2)
        return skalar


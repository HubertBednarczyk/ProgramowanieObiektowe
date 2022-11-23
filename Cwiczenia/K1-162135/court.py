class Court:
    width: float
    length: float
    address: str
    year_built: int

    def __init__(self,length = 105, width = 68, address ='', year_built = 0):
        self.length = length
        self.width = width
        self.address = address
        self.year_built = year_built

        for i in range(45,90,1):

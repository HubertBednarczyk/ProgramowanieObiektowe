from vector import Vector

def main():
    vec = Vector(1, 4)

    print(vec.__repr__())
    print(vec.__add__(3))
    print(vec.__sub__(2))
    print(vec.__mul__(2))
    print(vec.__eq__(3))
    print(vec.__len__())
    vec.__getitem__(4)
    print(vec.__str__())

if __name__ =="__main__":
    main()
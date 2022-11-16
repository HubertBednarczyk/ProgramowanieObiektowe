from vector import Vector

def main():
    vec = Vector(1, 4)

    print(vec.__repr__())
    print(vec.__add__(3))
    print(vec.__sub__(3))
    print(vec.__mul__(3))
    print(vec.__eq__())
    print(vec.__len__())
    vec.__getitem__('hubert')
    print(vec.__str__())
    print(vec.inner(4,5))

if __name__ =="__main__":
    main()
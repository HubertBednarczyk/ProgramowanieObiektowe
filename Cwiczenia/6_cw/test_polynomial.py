from polynomial import Polynomial

def main():
    poly = Polynomial(2)
    print(poly.__str__())
    print(poly.deg())
    print(poly.__neg__())
    print(poly.__add__([8]))
    # print(poly.__sub__(0))
    print(poly.__eq__([5, 4, 3, 0]))
    print(poly.__call__(5))

if __name__ =="__main__":
    main()
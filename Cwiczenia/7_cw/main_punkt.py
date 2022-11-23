from punkt import Punkt

def main():
    dpf = Punkt(4,2)

    dpf.set_x(2)
    print(dpf.__str__())
    print(dpf.__repr__())
    print(dpf)
if __name__ =="__main__":
    main()
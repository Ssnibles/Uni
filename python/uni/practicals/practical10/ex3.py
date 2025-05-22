# Ask the user for input
load = float(input("Enter a value for the load: "))
elasticity = float(input("Enter a value for the elasticity: "))
inertia = float(input("Enter a value for the inertia: "))
length = float(input("Enter a value for the lenght: "))


# Part 1
def Calc1(load, x):
    Part1 = load * x * (length - x)
    return Part1


# Part 2
def Calc2(elasticity, inertia, length):
    Part2 = 24 * elasticity * inertia * length
    return Part2


# Part 3
def Calc3(x, length):
    Part3 = 1**2 + x * (length - x)
    return Part3


for x in range(0, int(length), 5):
    Part1 = Calc1(load, x)
    Part2 = Calc2(elasticity, inertia, length)
    Part3 = Calc3(x, length)
    deflection = Part1 / Part2 * Part3
    print(deflection)

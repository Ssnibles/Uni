import math

paintRequired = int(input("Amount of paint required: "))

numTins = math.ceil(paintRequired / 5)
print(f"The number of tins reequired is {numTins}")

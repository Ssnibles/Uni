import math

# Amount of chlorine per cubic metre of water
CHLORINE_RATE = 0.1

# Amount of chlorine in one bag
BAG_WEIGHT = 2

# Cost of bag of chlorine
BAG_COST = 5.5

# Ask user for input
try:
    length = float(input("Enter the lenght of the pool: "))
    width = float(input("Enter the width of the pool: "))
    height = float(input("Enter the height of the pool: "))

    # Calculate values
    volume = length * width * height
    kgs_of_chlorine = math.ceil(volume * CHLORINE_RATE)
    cost_per_bag = kgs_of_chlorine / BAG_WEIGHT
    final_cost = cost_per_bag * BAG_COST

    # Print final results
    print(f"{volume} m^2")
    print("{:8.4f}".format(kgs_of_chlorine))
    print(f"${final_cost}")

except:
    print("Broken")

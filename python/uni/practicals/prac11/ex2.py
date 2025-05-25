import csv

# Open the output file for writing -f= open("planets.txt", "w")
f = open("planets.txt", "w")

# Open the CSV file for reading
with open("./planets.csv", mode="r") as file:

    planets = csv.reader(file)

    for line in planets:
        # Extract columns: name, mass, and radius from each row
        name = line[0]
        mass = float(line[1])  # Convert mass to float (double)
        radius = float(line[2])  # Convert radius to float (double)
        gravity = mass / radius**2  # Calculate gravity

        # Prepare the output string
        output = f"Planet: {name} | Mass: {mass} | Radius: {radius} | Gravity:{gravity: .3g}\n"

        print(output, end="")  # Print to the screen

        # Write the same output to the file
        f.write(output)

# Close the output file
f.close()

import csv
import random  # 1

# Import matplot and numpy
import matplotlib.pyplot as plt
import numpy as np

print("Waikato Uni humidity in teaching environment prediction")
print("by Joshua Breite 1678596")

# Declare vars
data = []  # 2
comfortable = []  # Store data based on users comfortable humidity
uncomfortable = []  # Store all uncomfortable levels
fileData = []
choice = 0  # initial choice value to start loop
days = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]  # Days of the week
fileDays = []
x = np.arange(len(days))  # Generate array of days of the week


# Plot data function for reuseability
def plotData(dataset1, dataset2, dayLabels):
    plt.xlabel("Days")  # Add xlable
    plt.ylabel("Humidity (g/m3)")  # Add ylabel
    plt.title("Humidity per day")
    plt.xticks(x, dayLabels, rotation=45)  # Add labels and rotate for better readability

    if dataset2:  # Only add the labels if there is a second dataset
        plt.plot(dataset1, label="Uncomfortable")
        plt.plot(dataset2, label="Comfortable")
    else:  # If there is only one dataset plot the set
        plt.plot(dataset1)

    plt.legend()  # Show legend
    plt.show()  # Show the plot


# Main loop
while choice != 9:  # loop to keep running until the user chooses to exit
    print("\nYour options are: ")
    print("1. Generate data")
    print("2. Plot data")
    print("3. Decide on study environment quality")
    print("4. Load a CSV file and plot")
    print("9. Exit")
    choice = int(input("enter your choice: "))  # 3

    if choice == 1:  # Generate random data
        print("Random data being generated")
        for i in range(7):  # loop to generate 7 random numbers
            preference = random.randint(0, 101)  # 4
            data.append(preference)  # 5
            print(data)

    if choice == 2:  # Plot the humidity levels per day
        print("Plot humidity levels per day")
        plotData(data, 0, days)

    if choice == 3:
        print("Deciding whether it is a good study environment or not")

        # Ask the user for a humidity they feel comfortable with
        comfortablePercentage = int(
            input("Enter a max humidity you feel comfortable with (e.g. 50): ")
        )

        # Check if it is between 1 and 99
        if comfortablePercentage >= 1 or comfortablePercentage <= 99:
            for line in data:
                if line <= comfortablePercentage:
                    comfortable.append(line)
                elif line > comfortablePercentage:
                    uncomfortable.append(line)
        else:  # Otherwise
            print("The max humidity you chose is not comfortable")

        # Show the days with comfortable and uncomfortable humidity
        print(
            f"Days with comfortable humidity: {len(comfortable)} | Days with uncomfortable humidity: {len(uncomfortable)}"
        )

        # Give a prediction whether it is a good day to study or not
        if len(comfortable) > len(uncomfortable):
            print("It is a good study environment")
        elif len(comfortable) == len(uncomfortable):
            print("It is tolerable weather")
        else:
            print("It is NOT a good study environment")

        # PLot the sliced data
        plotData(comfortable, uncomfortable, days)

        # Show an overview of days which are, and are not comfortable
        for line in data:
            if line <= comfortablePercentage:
                print("C", end="")  # comfortable
            else:
                print("H", end="")  # uncomfortable

    # Open a file .CSV and plot the data
    if choice == 4:
        with open("humidity.csv", mode="r", newline="") as file:
            data = csv.reader(file)  # Read the data

            for line in data:  # Loop through each data column
                day = fileDays.append(line[0])
                room = line[1]
                humidity = fileData.append(int(line[2]))

            plotData(fileData, 0, fileDays)  # Plot the data using the labels

print("\nPrediction Finished")

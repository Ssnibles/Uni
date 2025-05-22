min_value = int(input("Enter a minimum Value: "))  # Ask for input and convert to int
max_value = int(input("Enter a maximum Value: "))  # Ask for inoput and convert to int

if max_value >= min_value:  # If max is greater then or equal to min
    for x in range(min_value, max_value + 1):  # Loop from min through max
        print(x, "Times Table")  # Print x Times Table
        for y in range(min_value, max_value + 1):  # Loop from min through max
            print(x, "+", y, "=", x + y)  # Print x + y = x+y
        print("")  # Print empty line
else:  # Else
    print("Boooooo")  # Print Boooooo

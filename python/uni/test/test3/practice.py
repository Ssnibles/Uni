with open("comp103-15a.txt", mode="r") as file:
    for line in file:
        splitLine = line.strip("\n").split(",")
        print(splitLine)

        for pos in splitLine:
            print(pos)

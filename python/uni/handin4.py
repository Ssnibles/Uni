sum = 0

with open("file") as file:
    for line in file:
        num = int(line)
        sum = sum + num

print(sum)

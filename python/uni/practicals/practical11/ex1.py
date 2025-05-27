# Write all to one line
f = open("myfile.txt", "w")
f.write("First line")
f.write("Second Line")
f.write("Last Line")
f.close()

f = open("myfile2.txt", "w")
print("First line", file=f)
print("Second line", file=f)
print("Third line", file=f)
f.close()

f = open("myfile.txt", "r")
data = f.read()
print(len(data))
print(data)
f.close()

# Read and print from each file
f = open("myfile.txt", "r")
for data in f:
    data = data.strip("\n")
    print(data)
f.close()

total = 0
f = open("myfile2.txt", "r")
for data in f:
    data = data.strip("\n")
    print(data)
    total += len(data)
f.close()
print(total)

print(type(data))
print(len(data))

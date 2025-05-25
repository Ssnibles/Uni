f = open("myfile.txt", "w")
f.write("First line")
f.write("Second line")
f.write("Third line")
f.close()

# Create File in the ./files/
f = open("./files/myfile.txt", "w")
f.write("Bleh\n")
f.write("Second line\n")
f.write("Third line\n")
f.write("Fourth line\n")
f.close()

# Create File in the ./files/
f = open("./files/myfile", "w")
f.write("Bleh\n")
f.write("Second line\n")
f.write("Third line\n")
f.write("Fourth line\n")
f.close()

# Still works without f.close()
f = open("./files/myfile2.txt", "w")
f.write("Bleh\n")
f.write("Second line\n")
f.write("Third line\n")
f.write("Fourth line\n")

# Open file in read mode
f = open("myfile.txt", "r")
data = f.read()
print(data)
print(len(data))
print(type(data))
f.close()

f = open("myfile.txt", "r")
for data in f:
    data = data.strip("\n")
    print(data)
print(type(data))
f.close()

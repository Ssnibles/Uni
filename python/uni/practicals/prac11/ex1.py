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
print(data)
f.close()

# Read and print from each file
f = open("myfile.txt", "r")
for data in f:
    print(data)
f.close()
data = data.strip("\n")

f = open("myfile2.txt", "r")
for data in f:
    print(data)
f.close()
data = data.strip("\n")

x = 5
y = 3
z = 1

numFlags = 5


if ((x == 5) or (y > 0)) and (z < 1):
    print("true")


if numFlags not in range(1, 4):
    print("not in range")

if numFlags in range(1, 4):
    print("in range")

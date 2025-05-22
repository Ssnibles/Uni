import matplotlib.pyplot as plt

numbers = list(input("Input a list of numbers: "))

ax = plt.subplots()
ax.plot(numbers)
plt.show()

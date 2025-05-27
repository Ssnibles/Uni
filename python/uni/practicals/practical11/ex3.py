import csv
import statistics

dif_list = []

with open("./steel.csv", mode="r", newline="") as file:
    data = csv.reader(file)
    header = next(data)  # Skip header row if present

    print(f"{'Grade':<10} {'Low':<8} {'High':<8} {'Dif':<8}")

    for line in data:
        # Skip empty lines or malformed lined
        if len(line) < 3:
            continue

        grade = line[0]
        low = int(line[1])
        high = int(line[2])
        dif = high - low
        dif_list.append(dif)

        print(f"{grade:<10} {low:<8} {high:<8} {dif:<8}")

mean = statistics.mean(dif_list)
print(f"Mean: {mean:.3f}")

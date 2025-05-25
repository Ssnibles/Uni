import csv

vendor = []

with open("./yellow_tripdata_2015-06.csv", mode="r", newline="") as file:
    data = csv.reader(file)
    heder = next(data)

    for line in data:
        # Skip empty lines or malformed lines
        if len(line) < 3:
            continue

        vendor_id = int(line[0])
        tip = float(line[15])

        if vendor_id == 2:
            vendor.append(tip)

print(f"${sum(vendor)}")

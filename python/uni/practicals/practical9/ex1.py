input1 = input("Is input 1 ON or OFF: ").strip().upper()
input2 = input("Is input 2 ON or OFF: ").strip().upper()
input3 = input("Is it an AND or an OR gate: ").strip().upper()

if input3 == "OR":  # Check OR gate
    print("OR")
    if input1 == "ON" or (input2 == "ON"):
        print(f"{input1} and {input2} is ON")
    else:
        print(f"{input1} and {input2} is OFF")

elif input3 == "AND":  # Check AND gate
    print("AND")
    if input1 == "ON" and (input2 == "ON"):
        print(f"{input1} and {input2} is ON")
    else:
        print(f"{input1} and {input2} is OFF")

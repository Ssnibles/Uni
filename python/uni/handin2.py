number_of_tickets = int(input("Enter the number of tickets needed: "))
discount_rate = float(input("Enter the discrount rate: "))

total_cost = number_of_tickets * 20
print(total_cost)

discount_cost = total_cost * (discount_rate / 100)
print(discount_cost)

final_cost = total_cost - discount_cost
print(final_cost)

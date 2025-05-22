cities = [
    "Auckland",
    "Wellington",
    "Christchurch",
    "Hamilton",
    "Tauranga",
    "Napier-Hastings",
    "Dunedin",
    "Palmerston North",
]
populations = [1495000, 405000, 389700, 230000, 134400, 131000, 118500, 84300]
sizes = [1086, 444, 608, 877, 178, 375, 255, 178]

answer = input("Number")
print(f"{populations[answer] / sizes[answer]}")

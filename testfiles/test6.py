def calcGrades(mark):
    if mark <= 100 and mark >= 80:
        return "A"
    elif mark <= 80 and mark >= 65:
        return "B"
    elif mark <= 65 and mark >= 50:
        return "C"
    elif mark <= 50 and mark >= 40:
        return "D"
    else:
        return "E"


test1 = {"Gene": 10, "Markus": 67, "George": 99, "Payten": 100, "Josh": 1}

for name, score in test1.items():
    grade = calcGrades(score)
    print(name, "got a grade of", grade)

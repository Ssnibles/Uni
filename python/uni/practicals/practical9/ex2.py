student_id = input("Enter the student's ID: ")
exam_mark = int(input("Enter the student's exam mark: "))
grade = ""

if exam_mark in range(0, 101):
    if exam_mark >= 80 and exam_mark <= 100:
        grade = "A"
    elif exam_mark >= 65 and exam_mark <= 79:
        grade = "B"
    elif exam_mark >= 50 and exam_mark <= 64:
        grade = "C"
    elif exam_mark >= 35 and exam_mark <= 49:
        grade = "D"
    else:
        grade = "E"
else:
    print("Input a value in range of 0 to 100")

print(f"{student_id} : {exam_mark} : {grade}")

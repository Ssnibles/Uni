import matplotlib.pyplot as plt
import numpy as np


def Failing(grade):
    # Returns True if the grade is considered failing, otherwise False
    return grade in ["D", "E", "F", "IC"]


# List of all possible grades in the order we want them to appear on the chart
grade_order = ["A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "P", "RP", "D", "E", "F", "IC"]

# Initialize dictionaries to count how many students received each grade
fsen_grades = {grade: 0 for grade in grade_order}  # For FSEN BE(HONS) students
other_grades = {grade: 0 for grade in grade_order}  # For all other students

# Counters for FSEN BE(HONS) students who pass or fail
passing_count = 0
failing_count = 0

# Open the file containing student grade data
with open("comp103.txt", mode="r") as file:
    for line in file:
        splitLine = line.strip().split(",")  # Remove whitespace and split by comma
        if len(splitLine) != 5:
            continue  # Skip lines that don't have exactly 5 fields

        student_id, name, degree, faculty, grade = splitLine  # Unpack the fields

        # Check if the student is an FSEN BE(HONS) Engineering student
        if faculty == "FSEN" and degree == "BE(HONS)":
            # Count as passing or failing for FSEN BE(HONS) students
            if Failing(grade):
                failing_count += 1
            else:
                passing_count += 1
            # Increment the count for this grade in the FSEN dictionary
            if grade in fsen_grades:
                fsen_grades[grade] += 1
        else:
            # For all other students, increment the count for their grade
            if grade in other_grades:
                other_grades[grade] += 1

# Print summary statistics for FSEN BE(HONS) students
print(f"Number of passing FSEN Engineering students: {passing_count}")
print(f"Number of failing FSEN Engineering students: {failing_count}")

# Prepare data for plotting: x positions and grade counts
x = np.arange(len(grade_order))  # Numeric positions for each grade
fsen_counts = [fsen_grades[grade] for grade in grade_order]  # FSEN BE(HONS) grade counts
other_counts = [other_grades[grade] for grade in grade_order]  # Other students grade counts

bar_width = 0.4  # Width of each bar in the bar chart

plt.figure(figsize=(12, 6))  # Set the size of the plot
# Plot FSEN BE(HONS) bars to the left
plt.bar(x - bar_width / 2, fsen_counts, width=bar_width, label="FSEN BE(HONS)", color="skyblue")
# Plot Other Students bars to the right
plt.bar(
    x + bar_width / 2, other_counts, width=bar_width, label="Other Students", color="lightgreen"
)

plt.xlabel("Grade")  # Label for the x-axis
plt.ylabel("Number of Students")  # Label for the y-axis
plt.title("Grade Distribution: FSEN BE(HONS) vs Other Students")  # Chart title
plt.xticks(x, grade_order, rotation=45)  # Set grade labels and rotate for readability
plt.legend()  # Show the legend
plt.tight_layout()  # Adjust layout to prevent overlap
plt.show()  # Display the plot

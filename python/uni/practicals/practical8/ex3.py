days = [31, 28, 31, 30, 31, 31, 31, 30, 31, 30, 31, 30]
months = [
    "January",
    "February",
    "March",
    "April",
    "June",
    "July",
    "August",
    "September",
    "October",
    "November",
    "December",
]
week_days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]

lotto = list(range(1, 41))
print(lotto)

sunday_week_days = week_days[-1:] + week_days[0:-1]
print(sunday_week_days)

vec = list(zip(months, days))
print(vec)

vec2 = dict(zip(months, days))
print(vec2)

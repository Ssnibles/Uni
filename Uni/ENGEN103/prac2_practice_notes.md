```matlab
clear; clc;

today = [12212, 17617, 16968, 13375, 11378, 17617, 12062, 19891, ...
         11274, 10582, 16213, 19891, 11274, 12062, 19891];

people = unique(today); % Find each unique number (cardax number)

disp(today'); % Display the 'today' vector transposed (vertically) for readability

% Output how many times the door has been used today
fprintf("\nThe door has be used %d times today\n\n", length(today));

check_num = input("Check if a number has been used today: ");

% Create a logical array (today == check_num) to check each occurrence, then sum the trues(1)
occurrences = sum(today == check_num);

if occurrences > 0
    fprintf("%d has used the door %d times today\n\n", check_num, occurrences);
else
    fprintf("%d has not used the door today\n\n", check_num);
end

% Determine the status (Inside/Outside) of the checked number
if mod(occurrences, 2) == 0 % If the number of occurrences is even
    status = "Outside";
else % If the number of occurrences is odd
    status = "Inside";
end
fprintf("%d ended the day %s\n\n", check_num, status);

% Loop through each unique cardax number to determine its status
for i = 1:length(people)
    user_id = people(i); % Get the current cardax number
    use_count = sum(today == user_id); % Count how many times the user used the door

    % Determine the status of the current user
    if mod(use_count, 2) == 0 % If the user's use count is even
        status = "Outside";
    else % If the user's use count is odd
        status = "Inside";
    end
    fprintf("Cardax Number: %d, Status: %s\n", user_id, status); % Display the result
end
```

# Find each unique occurence

```matlab
<VAR> = unique(<ARRAY>)
```

# Check for number of occurences

```matlab
check = input("What to check for");

occurences = sum(<ARRAY> == check_num); 
```

> [!NOTE]
> The above creates a logical array (<ARRAY> == check_num) to check each occurence,
then sum the trues(1)

# Determine even or odd

```matlab
if mod(occurences, 2) == 0
    EVEN
else
    ODD
end
```

# Loop throgh each cardax number and check

```matlab
% Loop through each unique cardax number to determine its status
for i = 1:length(people)
    user_id = people(i); % Get the current cardax number
    use_count = sum(today == user_id); % Count how many times the user used the door

    % Determine the status of the current user
    if mod(use_count, 2) == 0 % If the user's use count is even
        status = "Outside";
    else % If the user's use count is odd
        status = "Inside";
    end
    fprintf("Cardax Number: %d, Status: %s\n", user_id, status); % Display the result
end
```

1. **`for i = 1:length(people)`:**

* This line starts a `for` loop that will iterate from `i = 1` up to the total number of unique cardax numbers stored in the `people` array.
* `length(people)` gives you the number of elements in the `people` array (i.e., how many unique users there are).
* In each iteration, the variable `i` will represent the current index of the `people` array.

2. **`user_id = people(i);`:**

* Inside the loop, this line retrieves the cardax number at the current index `i` from the `people` array and stores it in the `user_id` variable.
* For example, in the first iteration (`i = 1`), `user_id` will be assigned the first unique cardax number in the `people` array.

3. **`use_count = sum(today == user_id);`:**

* This is the crucial part. It counts how many times the current `user_id` appears in the `today` array.
* `today == user_id` creates a logical array where each element is `1` if the corresponding element in `today` is equal to `user_id`, and `0` otherwise.
* `sum(...)` then adds up all the `1`s in this logical array, giving you the total number of times `user_id` used the door.
* The result (the number of times the user used the door) is stored in the `use_count` variable.

4. **`if mod(use_count, 2) == 0`:**

* This `if` statement checks if `use_count` is an even number.
* `mod(use_count, 2)` calculates the remainder when `use_count` is divided by 2.
* If the remainder is 0, it means `use_count` is even.

5. **`status = "Outside";`:**

* If `use_count` is even, this line sets the `status` variable to "Outside".

6. **`else status = "Inside";`:**

* If `use_count` is not even (i.e., it's odd), this line sets the `status` variable to "Inside".

7. **`fprintf("Cardax Number: %d, Status: %s\n", user_id, status);`:**

* Finally, this line prints the `user_id` (cardax number) and its corresponding `status` ("Inside" or "Outside") to the command window.
* `%d` is a placeholder for the `user_id` (an integer), and `%s` is a placeholder for the `status` (a string).
* `\n` adds a newline character, so each user's information is printed on a separate line.

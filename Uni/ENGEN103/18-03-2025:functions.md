# Functions

> [!NOTE]
> To declare a new function:

```matlab
function  <OUTPUT> = <FUNCTION_NAME>(<INPUT>)
    % Calculate something
    % Format of call: <FUNCTION_NAME>(<INPUT>)

    <OUTPUT> = <SOME_CALCULATION>
end
```

## Example of a function:

```matlab
function area = circle_radius(radius)
% Calculate the area of a circle
% Format of call: circle(radius)

    area = pi*radius*radius;
end
```

## Run functions:

`circle_radius(5)`

> [!NOTE]
> Functions are only local scope so everything needs to be declared in the function

## More on functions

- Functions that calculate and return more then one value
- Functions that calculate and return multiple value
- Functions that do some specific task eg print to screen

## More outputs

```matlab
function [<OUTPUT_1>, <OUTPUT_2>] = <FUNCTION>(<INPUT>)
```

### To call this function

`[<OUTPUT_1>, <OUTPUT_2>] = <FUNCTION>(<INPUT>)`

# Passing arguments to functions

> [!NOTE]
> Some functions don't take inputs, but instead take in arguments

```matlab
function date()
    months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novmber", "December"]
    data = clock;
    year = data(1);
    m = data(2);
    month = string(months(m));
    day = date(3);
    fprintf("Today is %s %i, %i.\n", month, day, year);
end
```

# Interacting with files

- Read from a file
- Write to a file (overwrites the entire file)
- Append to a file (adds to the end of a file withough overwriting)

## How to write to a file

`save <FILENAME> <MATRIX_VAR_NAME> -ascii`

> [!Example] > `save my_matrix.dat mat -ascii`
> this will save a matrix called mat to a file named my_matrix.dat

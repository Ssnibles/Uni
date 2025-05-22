# Functions

> [!NOTE]
> To declare a new function:

```matlab
function  <OUTPUT> = <FUNCTION_NAME>(<INPUT>)
    % Calculate something
    % Format of call: <FUNCTION_NAME>(<INPUT>)

    <OUTPUT> = <INPUT> * <INPUT> / <INPUT> % will store the calculation in the <OUTPUT>
end
```

## Example of a function

```matlab
function area = circle_radius(radius)
% Calculate the area of a circle
% Format of call: circle(radius)

    area = pi*radius*radius;
end
```

## Run functions

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
> this will save a matrix called mat to a file named my_matrix.dat in plain text

> [!Example] > `save my_matrix.dat mat -ascii -append`
> this will append to the .dat file in the form of plain text

## How to read from a file

> [!NOTE]
> reading a file uses the load command

`load my_matrix.dat`

Files can be loaded with denominators in them, eg commas, these will be loaded as matrix with spaces as the deliminator

# Lower level I/O

## fopen

`fid = fopen("FILENAME", "PERMISSION")`
PERMISSION can be either `w`, `r`, or `a`

> [!Example]
>
> ```matlab
> fid = fopen("PI_text.txt", "r")
> fid =
>      3
> ```

## fscanf

```matlab
data = fscanf(fid, "%f, %f", [2, inf]);
```

## fgetl

> [!NOTE]
> gets line from fid

```matlab
fgetl(fid)
```

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
functions [<OUTPUT_1>, <OUTPUT_2>] = <FUNCTION>(<INPUT>)
```

### To call this function

`[<OUTPUT_1>, <OUTPUT_2>] = <FUNCTION>(<INPUT>)`

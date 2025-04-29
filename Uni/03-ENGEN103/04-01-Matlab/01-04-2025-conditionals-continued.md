# Getting list length

```matlab
list = [1 2 3 4 5]
for i = 1:lenght(list)
    disp("Hi");
end
```

# Switch statements

A ***switch*** statement can be used in place of an if-else/elseif block in situations
when we want to check whether a given variable is equal to one of a number
of possible values.

The key difference with if-else is that the switch statement tests only for the
equality condition.

```matlab
switch expression
    case expr1
        statements1
    case expr2
        statements2
.....%more cases
    otherwise
        statement
end
```

> [!Example]
> Suppose we want to create a function that takes in the name of a
calendar month, and then returns the number of days it has to the user. Let’s
start with the usual function stu

```matlab
function ndays = month_days(month)
% Here we take as input the name of a month as a string
% and return the number of day for that month
% Format of call: month_days(’Month’)

switch month
    case ’January’
        ndays = 31;
    case ’February’
        ndays = 28;
        % ndays = 29; % uncomment for a leap year
    case ’March’
        ndays = 31;
```

> [!NOTE]
> Note the importance of the “Format of call” description which shows the user
that the name of the month is expected to start with a capital letter, and that
the name should be passed to the function in single quotes.

> [!Example]
Suppose we want to create a function similar to the one from be-
fore that links a percentage score to a letter grade, but this time in reverse –
i.e. given a letter grade, the function returns the upper and lower bounds of
the corresponding interval of percentages.
>
> In this case we want to take a string, the letter grade with a “+” or “-”, and return
2 numbers – the lower and upper percent values for that grade
>
> With two outputs we need to return a vector, and we need to make sure this
user is aware of this

```matlab
function [lower, upper] = grade_letter(letter)
% this function takes a percentage score and
% returns the corresponding letter grade
% Format of call: [upper, lower] = grade_letter(’letter’)
% Here letter is one of A+,A,A-,B+,B,B-,C+,C,C-,D,E

switch letter
    case ’A+’
        lower = 90;
        upper = 100;
    case ’A’
```

> [!NOTE]
> Note that in order to correctly receive the two outputs from this function we
need to explicitly list 2 output variables in our function call, since a “straight”
function call simply returns the first output value.

```matlab
>> grade_letter('D')
and = 
    40

>> [lower, upper] = grade_letter('D')
lower = 
    40

uppper = 
    50
```

In many situations, the “otherwise” part of the switch statement can be used in
case the user’s input does not match any of the expected input.

```matlab
case ’D’
    lower = 40;
    upper = 50;
case ’E’
    lower = 0;
    upper = 40;
otherwise
    lower = -1;
    upper = -1;
    disp(’not a valid letter grade’)
end
```

Here I display an error message, and I also set the return values to be -1. The
reason for returning “bad” values in this case is that if this function was called
from within a program, then hopefully the master program would also return an
error as a result of negative scores. Always try to “future proof” your programs
in this way.

# The is function

> [!info]
There are a number of MATLAB built-in functions that test whether something
is TRUE. For example we can checked whether 2 vectors are equal using the
isequal function.

```matlab
 >> isequal('cat',['c' 'a' 't'])
 ans = 
    logical
    1
 ```

> [!NOTE]
> There are many `is` functions in matlab, such as:
>
> - isequal
> - isletter
> - isfloat
> - ischar
> - islogical
> - isnumeric
> - isinteger

# Row Vectors:

```matlab
vec = [0, 1, 2, 3]
```

```matlab
vec = 1:7
vec =
        1 2 3 4 5 6 7
```

## Linspace

```matlab
vec = linspace(<initial>, <final>, <amount>)
```

```matlab
vec = zeros(1,8)
vec =
        0 0 0 0 0 0 0 0
```

# Column Vectors:

```matlab
cv = [1; 2; 3; 4]
cv =
        1
        2
        3
        4
```

```matlab
mat = [1 1 1; 2 2 2; 3 3 3; 4 4 4]
mat =
        1 1 1
        2 2 2
        3 3 3
        4 4 4
```

Use ; to indicate a new row

## Accessing a Specific Row and Column:

Element = matrix (row, column)

```matlab
mat(2, 3)
ans =
        2
```

```matlab
m = zeros(3)
m =
        0 0 0
        0 0 0
        0 0 0

m = zeros(1, 3)
m =
        0
        0
        0
```

```matlab
m = randi(10, 3, 3)
m =
        10 2 4
         8 7 9
         1 6 0
```

```matlab
p = randi(10, 3, 3,); q = randi(10, 3, 3)
p + q %Add both matrices together
```

Multiplication and division in matrices

```matlab
p * q %Gives and error, because matlab is trying to do matrix multiplication

%To do elementwise multiplication use .
p .* q

%Same for division
p ./ q
```

Scalar matrices are 1 x 1

```matlab
length(vec)
```

# Access the Last Value in an Array

```matlab
vec(end)
```

## In a Vector

```matlab
vec(1, end) % row one end column
```

## Second to Last Element

````matlab
vec(end-1) % second to last element```
````

# Access and Reasign Value

```matlab
vec(1, 2) = 10
```

```matlba
prices = [prices[10, 11, 12]] % add to the end of the matrix
```

```matlab
prices(end+1) = 10
```

## Gets Numbers from Array in Steps

```matlab
odd = numbers(1:2:100)
odd = number(<start>:<steps>:<end>)
```

# Logical Array

```matlab
info = data<3
```

## Output Which Numbers in the Array Are less then 3

```matlab
data(data<3)
```

# Get Specific Numbers from an Array Using an Array

```matlab
 pos = [1 3 5]
 data(pos)
```

# Flip Matrix

```matlab
a = [1 3 5; 2 4 6]
a'
```

# Vectors and Matrices as Function Input

```matlab
x = 1:3:10
y = sqrt(x)
```

```matlab
m = [1 2 3 ; 4 5 6]
sin(m)
```

```matlab
vec = rand(1, 5)
mean(vec),max(vec)
```

## Matrices Need to Be Maxed or Mined or Summed Twice as They Do from top to Bottom

```matlab
r = randi(10, 3, 3)
r =
    7   10  8
    1   7   4
    9   8   7

max(r)

max(max(r))
```

# Randi

```matlab
randi(<numbers>, <x>, <y>)
randi(10, 5, 5) % 5 by 5 matrix with random numbers up to 10
randi([1:10], 5, 5) % numbers from 1 to ten using a matrix in a 5 by 5 matrix
```

# Accessing Arrays

```matlab
nummbers = [1:600000]
numbers(1:10) % gives Numbers 1 through 10 of the array
```

```matlab
w = true(2) % creates a 2 by 2 matrix of only trues eg 1
w = false(2) % creates a 2 by 2 matrix of only false eg 0
```

```matlab
find(a > 5) % finds all cases in which a is less then 5
```

# Compare Two Matrices

```matlab
v1 = [1 2 3 4]; v2 = [1 2 3 5]
q  = (v1 == v2)
all(q)
```

```matlab
plot(3,4,'r*') % plots a red * at location 3,4
```

# Title and Label for a Plot

```matlab
xlabel("x")
ylabel("y")
title("Plot of x and y")
```

# Useful Plotting Functions

To overlay multiple graphs on top of each other instead of deleting the previous graph use hold on and hold off

```matlab
hold on
hold off
clf
figure
grid
legend
```

```bash
figure
```

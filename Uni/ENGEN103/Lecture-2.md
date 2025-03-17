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

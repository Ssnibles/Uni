#!/bin/python

W = 2500
E = 30000000
inertia = 258
length = 300
x = 60

p1 = W * x * (length - x)
p2 = 24 * E * inertia * length
p3 = length**2 + x * (length - x)

y = (p1 / p2) * p3

print("{:0.3f}".format(y))

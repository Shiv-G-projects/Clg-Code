import math

f = 4
t = 3
b = 4
pi = 3.14128

pift = (pi*float(f)*float(t))
expo = math.exp(-float(b)*float(f)*float(t))
y = math.sin(2*pift) - expo


print("The value of y is:", y)
#initial inputs of name, address, and phone number
name = input("Enter your name: ")
print("Hello", name, "\n")

address = input("Enter your address: ")
print("You live at", address, "\n")

phone = input("Enter your phone number: ")
print("Your number is", phone, "\n")

#beginning of the math problem
print("We will now compute the mathematical problem")

#format specifiers for float numbers and integers
y = float(45689.8765)
x = float(23543.567)
z = int(691)
x1 = float(4567.89)

#listing variables for ease of access
list = [y, x, z, x1]

#printing the variables and mathematical expression
print(" Given\n y =", list[0], "\n","x =", list[1], "\n","z =", list[2], "\n","x1 =", list[3], "\n")

print("Inputting these values into the expression: y = (x+5)/(x1-z), we get \n ")

#computing and printing the answer
ans = (x+5)/(x1-z)

print("As an integer, y =", int(ans) ) #integer
print("As a float, y =", float(ans) ) #float

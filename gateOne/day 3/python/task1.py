import random

correct_number = 0
incorrect_number = 0
for index in range(10):
	first_numbers = random.randrange(-10, 10)
	second_numbers = random.randrange(-10, 10)
	
	operand = random.choice(["+","-","/","*"])
	
	if operand == "+":
		answer = first_numbers + second_numbers
	elif operand == "-":
		answer = first_numbers - second_numbers
	elif operand == "/":
		answer = first_numbers / second_numbers
	elif operand == "*":
		answer = first_numbers * second_numbers
	
	
	answer = first_numbers + second_numbers	
	print(first_numbers," ",operand," ",second_numbers, " = ", end= "")
	user_input = int(input())
	if answer == user_input:
		correct_number += 1
	else:
		incorrect_number += 1
	
print("the number of correct answers is ", correct_number)
print("the number of incorrect answers is ", incorrect_number)
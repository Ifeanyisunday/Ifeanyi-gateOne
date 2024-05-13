credit_number = str(input("Hello, kindly Enter card details to verify\n"))

def card_length(cardrange):
	length_of_credit_card = len(credit_number)
	return length_of_credit_card
	
if credit_number[0] == '4':
	print("Credit card Type: Visa Cards")
	print("Credit card Number: ", credit_number)
	print("Credit card Number: ", len(credit_number))
elif credit_number[0] == '5':
	print("Credit card Type: MasterCard")
	print("Credit card Number: ", credit_number)
	print("Credit card Number: ", len(credit_number))
elif credit_number[0] == '3' and credit_number[1] == '7':
	print("Credit card Type: American Express Card")
	print("Credit card Number: ", credit_number)
	print("Credit card Number: ", len(credit_number))
elif credit_number[0] == '6':
	print("Credit card Type: Discover Cards")
	print("Credit card Number: ", credit_number)
	print("Credit card Number: ", len(credit_number))
else: 
	print("Credit card Type: Invalid Card!!")
	print("Credit card Number: ", credit_number)
	print("Credit card Number: ", len(credit_number))
	print("Credit card Validity Status: Invalid")
	credit_number = str(input("Hello, kindly Enter card details to verify\n"))


if card_length(credit_number) < 16:
	print("Credit card Type: Invalid Card!!")
	print("Credit card Number: ", credit_number)
	print("Credit card Number: ", len(credit_number))
	print("Credit card Validity Status: Invalid")
	credit_number = str(input("Hello, kindly Enter card details to verify\n"))


string_to_numbers = int(credit_number)
arr_numbers = []

for i in range(card_length(credit_number) - 1, 0, (len(credit_number) -1) -1):
	arr_numbers.append(int(string_to_numbers % 10))
	string_to_numbers // 10


sum = 0
first_number = 0
second_number = 0
multiply = 0
sum_double_digits = 0



for i in range(len(credit_number) - 2, 0, (len(credit_number) - 2) -2):
	multiply = arr_numbers[i] * 2

	if multiply > 9:
		first_number = multiply // 10
		second_number = multiply % 10
		sum_double_digits = first_number + secondNumber
		sum += sum_double_digits 
	elif multiply <= 9:
		sum += multiply



sum_odd_places = 0
for i in range(card_length(credit_number) - 1, 0, (len(credit_number) - 1) - 2):
	if i % 2 != 0:
		sum_odd_places += arr_numbers[i]

sum_all = sum + sum_odd_places

if sum_all % 10 == 0:
	print("Credit Card Validity Status: Valid")
else:
	print("Credit Card Validity Status: Invalid")
	
		
	
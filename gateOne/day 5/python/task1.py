##alpha = list("123")
##name = alpha

##print(name)

digits = list(input("Enter digits: "))
def check_card(numbers):
	array_length = len(digits)
	alpha = list("abcdefghijklmnopqrstuvwxyz")
	
	alpha1 = 0

	for i in range(array_length):
		for j in range(array_length):
			if alpha[i] == numbers[j]:
				alpha1 += 1

	valid = 0
	if alpha1 == 0:
		valid += 1
	
	if digits[0] == '4' or digits[0] == '5' or digits[0] == '6':
		valid += 1
	
	if array_length == 19:
		valid += 1
	
	if array_length % 4 != 0:
		valid += 1
	
	if valid == 4:
		print("Card is valid")
	else:
		print("Card is not valid")	

print(check_card(digits))	
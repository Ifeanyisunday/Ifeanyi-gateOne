
scoreArray = [1,2,3,4,5]


def displayEvenIndex(numbers):
	even = []
	for count in range(1, len(scoreArray)):
		if count % 2 == 0:
			even.append(numbers[count])
	return even
			

print(displayEvenIndex(scoreArray))
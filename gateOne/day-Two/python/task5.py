scoreArray = [1,2,3,4,5]


def displayOddIndex(numbers):
	odd = []
	for count in range(len(scoreArray)):
		if count % 2 != 0:
			odd.append(numbers[count])
	return odd
			

print(displayOddIndex(scoreArray))
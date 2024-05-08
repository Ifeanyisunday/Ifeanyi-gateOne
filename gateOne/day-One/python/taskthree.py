sum = 0
score_number = 10
for count in range(score_number):
	score_collector = int(input("enter number: "))
	sum += score_collector


average = sum / score_number
print("the sum is ",sum, " the average is ",average)
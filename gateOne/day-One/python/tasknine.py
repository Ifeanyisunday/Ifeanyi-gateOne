sum = 0
score_number = 10

for count in range(score_number):
	score_collector = int(input("enter number: "))
	if score_collector >= 0 and score_collector <= 100:
		sum += score_collector

print("the sum of is ", sum)
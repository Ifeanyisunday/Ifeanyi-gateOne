even_sum = 0
score_number = 10
for count in range(score_number):
	score_collector = int(input("enter number: "))
	if count % 2 == 0:
		even_sum += score_collector

print("the sum of even index is ", even_sum)
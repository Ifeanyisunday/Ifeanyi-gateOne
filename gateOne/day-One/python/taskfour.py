sum_index = 0
score_number = 10
for count in range(score_number):
	score_collector = int(input("enter number: "))
	if count % 2 == 0:
		sum_index += count


print("the sum of even indexes ",sum_index)
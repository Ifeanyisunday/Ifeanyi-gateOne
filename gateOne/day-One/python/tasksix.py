even_sum = 0
score_number = 10
index = 1
for count in range(score_number):
	score_collector = int(input("enter number: "))
	if count % 2 == 0:
		even_sum += score_collector
		index += 1


average = even_sum / index
print("the average is ", average)
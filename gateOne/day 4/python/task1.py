box_list = [None] * 9
for index in range(9):
	user_input = input("Enter X or O: ")
	box_number = int(input("Enter box number: "))
		
	if box_number == 1:
		box_list[0] = user_input
	elif box_number == 2:
		box_list[1] = user_input
	elif box_number == 3:
		box_list[2] = user_input
	elif box_number == 4:
		box_list[3] = user_input
	elif box_number == 5:
		box_list[4] = user_input
	elif box_number == 6:
		box_list[5] = user_input
	elif box_number == 7:
		box_list[6] = user_input
	elif box_number == 8:
		box_list[7] = user_input
	elif box_number == 9:
		box_list[8] = user_input
			
counter = 1
for count in range(9):	
	if count % 3 == 0:
		print("")
	print([box_list[count]], end = "")
	counter += 1
	
			

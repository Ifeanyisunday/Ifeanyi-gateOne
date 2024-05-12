def findage(numbers):
	string_of_numbers = list(numbers)
	day1 = int(numbers[0])
	day2 = int(numbers[1])

	month1 = int(numbers[3])
	month2 = int(numbers[4])

	year1 = int(numbers[6])
	year2 = int(numbers[7])
	year3 = int(numbers[8])
	year4 = int(numbers[9])

	if day1 >= 1:
		get_date = day1 * 10 + day2
	else:
		get_date = day2

	if month1 >= 1:
		get_month = month1 * 10 + month2
	else:
		get_month = month2

	if year1 >= 1:
		get_year = year1 * 1000 + year2 * 100 + year3 * 10 + year4
	else:
		get_year = year4

	current_year = 2024
	number_of_months_in_year = 12
	year_range = current_year - get_year
	month_range = year_range * number_of_months_in_year
	getmonth_count = get_month
	
	count_age = 0

	for i in range(get_month, month_range, +12):
		getmonth_count += 12
		if getmonth_count > month_range:
			break;
		count_age += 1
	
	return count_age

print(findage("04-10-2000"))


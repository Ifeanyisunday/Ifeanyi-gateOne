first_name = []
last_name = []
phone_no = []


def add_contact():
	user_first_name = str(input("Enter first name: "))
	first_name.append(user_first_name)
	user_last_name = str(input("Enter last name: "))
	last_name.append(user_last_name)
	phonenumber = str(input("Enter mobile number: "))
	phone_no.append(phonenumber)
	print(">>>>>>>>>> Contact saved successfully <<<<<<<<<<<<")
	decision = str(input("Add another contact? "))
	while decision.lower() == "yes":
		user_first_name = str(input("Enter first name: "))
		first_name.append(user_first_name)
		user_last_name = str(input("Enter last name: "))
		last_name.append(user_last_name)
		phonenumber = str(input("Enter mobile number: "))
		phone_no.append(phonenumber)
		print(">>>>>>>>>> Contact saved successfully <<<<<<<<<<<<")
		decision = str(input("Do you want to add more contacts? "))
		if decision.lower() != "yes":
			break
	choice = str(input("Do you want to continue? "))
	if choice.lower() == "yes":
		menu()


def findcontact_byphonenumber():
	count = 0
	phonenumber = str(input("Enter mobile number: "))
	for element in phone_no:
		if phonenumber == element:
			print(first_name[count], last_name[count],"\n",phone_no[count])
		count += 1
	choice = str(input("Do you want to continue? "))
	if choice.lower() == "yes":
		menu()


def findcontact_byfisrtname():
	count = 0
	user_first_name = str(input("Enter first name: "))
	for element in first_name:
		if user_first_name == element:
			print(first_name[count], last_name[count],"\n",phone_no[count])
		count += 1
	choice = str(input("Do you want to continue? "))
	if choice.lower() == "yes":
		menu()	
	

def findcontact_bylastname():
	count = 0
	user_last_name = str(input("Enter last name: "))
	for element in last_name:
		if user_last_name == element:
			print(first_name[count], last_name[count],"\n",phone_no[count])
		count += 1
	choice = str(input("Do you want to continue? "))
	if choice.lower() == "yes":
		menu()


def edit_contact():
	count = 0
	contact_name = str(input("Enter contact first name: "))
	for element in first_name:
		if contact_name == element:
			print(first_name[count], last_name[count])
			print("")
			print("Edit contact")
			new_firstname = str(input("Enter new first name: "))
			first_name[count] = new_firstname
			new_lastname = str(input("Enter new last name: "))
			last_name[count] = new_lastname
			new_number = str(input("Enter new phone number: "))
			phone_no[count] = new_number
		count += 1
	choice = str(input("Do you want to continue? "))
	if choice.lower() == "yes":
		menu()		

def menu():
	print("CHOOSE PERFERRED OPTION\n"
	"1 -> Add contact\n"
	"2 -> Remove contact\n"
	"3 -> Find contact by phone number\n"
	"4 -> Find contact by first name\n"
	"5 -> Find contact by last name\n"
	"6 -> Edit contact\n"
	"7 -> Back to menu\n")

	select = int(input("Enter preferred number: "))	
	match select:
		case 1: add_contact()
		case 2: "remove_contact"
		case 3: findcontact_byphonenumber()
		case 4: findcontact_byfisrtname()
		case 5: findcontact_bylastname()
		case 6: edit_contact()
		case 7: menu()
	


print("CHOOSE PERFERRED OPTION\n"
	"1 -> Add contact\n"
	"2 -> Remove contact\n"
	"3 -> Find contact by phone number\n"
	"4 -> Find contact by first name\n"
	"5 -> Find contact by last name\n"
	"6 -> Edit contact\n"
	"7 -> Back to menu\n")

select = int(input("Enter preferred number: "))	
match select:
	case 1: add_contact()
	case 2: "remove_contact"
	case 3: findcontact_byphonenumber()
	case 4: findcontact_byfisrtname
	case 5: findcontact_bylastname()
	case 6: edit_contact()
	case 7: menu()
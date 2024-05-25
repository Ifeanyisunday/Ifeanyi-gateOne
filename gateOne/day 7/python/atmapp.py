profile_name = []
phone_no = []
pin = []
account_balance = []

print("=====================================")
print("WELCOME TO BANKE BANK")
print("=====================================")


def create_account():
	user_name = str(input("Enter first name and last name: "))
	profile_name.append(user_name);
	user_phone_number = str(input("Enter phone number: "))
	phone_no.append(user_phone_number)
	user_pin = str(input("Enter pin: "))
	pin.append(user_pin)
	account_balance.append(0)
	print(">>>>>>>>>> Account created successfully <<<<<<<<<<<<")
	decision = str(input("Do you want to create another account? "))
	while decision.lower() == "yes":
		user_name = str(input("Enter first name and last name: "))
		profile_name.append(user_name);
		user_phone_number = str(input("Enter phone number: "))
		phone_no.append(user_phone_number)
		user_pin = str(input("Enter pin: "))
		pin.append(user_pin)
		account_balance.append(0)
		print(">>>>>>>>>> Account created successfully <<<<<<<<<<<<")
		decision = str(input("Do you want to create another account? "))
		if decision.lower() != "yes":
			break 
	choice = str(input("Do you want to continue? "))
	if choice.lower() == "yes":
		menu()

def deposit():
	user_name = str(input("Enter account name: "))
	user_deposit_amt = int(input("Enter deposit amount: "))
	for index in range(len(profile_name)):
		if user_name == profile_name[index]:
			account_balance[index] = account_balance[index] + user_deposit_amt
			print("You just deposited", user_deposit_amt, "naira")
			print("Your account balance is ", account_balance[index])
	choice = str(input("Do you want to continue? "))
	if choice.lower() == "yes":
		menu()

def withdrawal():
	user_name = str(input("Enter account name: "))
	user_withdraw_amt = int(input("Enter withdrawal amount: "))
	for index in range(len(profile_name)):
		if user_name == profile_name[index]:
			if user_withdraw_amt <= account_balance[index]:
				account_balance[index] = account_balance[index] - user_withdraw_amt
				print("You have been debited ", user_withdraw_amt, "naira")
				print("Your account balance is", account_balance[index], "naira")
				break
			elif user_withdraw_amt > account_balance[index]:
				print("Your account balance is too low")
				break
	choice = str(input("Do you want to continue? "))
	if choice.lower() == "yes":
		menu()


def transfer():
	count = 0
	counter = 0
	recipent_name = str(input("Enter recipent account name: "))
	user_name = str(input("Enter your account name: "))
	user_pin = str(input("Enter pin: "))
	user_transfer_amt = int(input("Enter amount: "))
	for index in profile_name:
		if user_name == index and user_transfer_amt <= account_balance[count]:
			account_balance[count] = account_balance[count] - user_transfer_amt
			for element in profile_name:
				if recipent_name == element:
					account_balance[counter] = account_balance[counter] + user_transfer_amt
					print("Dear", recipent_name, "you just received", user_transfer_amt, "naira from", user_name)
				counter += 1
		elif user_name != index and user_transfer_amt > account_balance[count]:
			print("Transaction failed!! Your balance is too low")
			break
		count += 1
	choice = str(input("Do you want to continue? "))
	if choice.lower() == "yes":
		menu()


def change_pin():
	count1 = 0
	old_pin = str(input("Enter old pin: "))
	new_pin = str(input("Enter new pin: "))
	for element in pin:
		if old_pin == element:
			pin[count1] = new_pin
			print("your new pin is", pin[count1])
			break
		count1 += 1
	choice = str(input("Do you want to continue? "))
	if choice.lower() == "yes":
		menu()

			
def check_balance():
	count2 = 0
	user_name = str(input("Enter your account name: "))
	collect_pin = str(input("Enter your pin: "))
	for element in profile_name:
		if user_name == element:
			print("Your account balance is ",account_balance[count2])
			break
		count2 += 1
	choice = str(input("Do you want to continue? "))
	if choice.lower() == "yes":
		menu()

def menu():
	print("CHOOSE PERFERRED OPTION\n"
	"1 -> Create account\n"
	"2 -> Deposit\n"
	"3 -> Withdraw\n"
	"4 -> Transfer\n"
	"5 -> Change pin\n"
	"6 -> Check balance\n"
	"7 -> Back to menu\n")

	select = int(input("Enter preferred number: "))	
	match select:
		case 1: create_account()
		case 2: deposit()
		case 3: withdrawal()
		case 4: transfer()
		case 5: change_pin()
		case 6: check_balance()
		case 7: menu()
			
	
					
				
print("CHOOSE PERFERRED OPTION\n"
	"1 -> Create account\n"
	"2 -> Deposit\n"
	"3 -> Withdraw\n"
	"4 -> Transfer\n"
	"5 -> Change pin\n"
	"6 -> Check balance\n"
	"7 -> Back to menu\n")

select = int(input("Enter preferred number: "))	
match select:
	case 1: create_account()
	case 2: deposit()
	case 3: withdrawal()
	case 4: transfer()
	case 5: change_pin()
	case 6: check_balance()
	case 7: menu()
				
			
		

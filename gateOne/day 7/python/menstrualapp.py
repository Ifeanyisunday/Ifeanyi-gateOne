from datetime import datetime, timedelta

def menu():
	response = input('DO YOU WANT TO CONTINUE?: \n')
	if response == "yes":
		select = int(input("MAKE YOUR CHOICE\n"
			"1 -> Check your next menstrual flow\n"
			"2 -> Do you want some tips\n"))

		match select:
			case 1:
				check_menstrual_flow()
				menu()
			case 2:
				check_tips()



def check_menstrual_flow():
	user_last_period = input("Enter the date of your last period(yyyy-mm-dd): \n")
	user_cycle_length = int(input("Enter your cycle length: \n"))
	user_date =  datetime.strptime(user_last_period, "%Y-%m-%d")

	
	user_next_period = user_date + timedelta(days=user_cycle_length)
	user_ovulation_period = user_next_period - timedelta(days=14)
	fertile_period_begin = user_ovulation_period - timedelta(days=5)
	fertile_period_ends = user_ovulation_period + timedelta(days=2)
	safe_period_1 = user_date + timedelta(days=1) 
	safe_period_2 = fertile_period_ends + timedelta(days=1)

	print("Your next period is on ",user_next_period)
	print("Your ovulation period starts on ",user_ovulation_period)
	print("Your fertile period starts on ",fertile_period_begin, " and ends by ",fertile_period_ends)
	print("Your safe period is between ",safe_period_1, "-",safe_period_2)
	menu()

def check_tips():
	select_tips = int(input("CHOOSE OPTION:\n"
		"1 -> How to care for yourself\n"
		"2 -> Relieve menstrual cramps\n"
		"3 -> How to manage menstral bleeding\n"
		"4 -> Back to menu\n"))
	match select_tips:
		case 1:
			tips1()
			menu()
		case 2:
			tips2()
			menu()
		case 3:
			tips3()
			menu()
		case 4:
			menu()
	

def tips1():
	print("HOW CAN YOU CARE FOR YOURSELF AT HOME\n"

		"-Keep track of the day you start your menstrual period each month.\n" 
		"-Also note how long your period lasts.\n" 
		"-If your cycle is regular, it can help you predict when you will have your next period.\n"
		"-To help with symptoms, get regular exercise, eat healthy foods, and try to reduce stress.\n"
		"-It may also help to limit food or drinks that make your symptoms worse, such as alcohol or caffeine.\n")
def tips2():
	print("HOW TO RELIEVE MENSTRUAL CRAMPS\n"

		"-Put a warm water bottle or a warm cloth on your belly.\n" 
		"-Or use a heating pad set on low.\n" 
		"-Heat improves blood flow and may relieve pain.\n"
		"-To relieve back pressure, lie down and put a pillow under your knees.\n" 
		"-Or lie on your side and bring your knees up to your chest.\n"
		"-Get regular exercise. It improves blood flow, which may decrease pain.\n"
		"-Ask your doctor if you can take anti-inflammatory medicines to reduce pain.\n" 
		"-These include ibuprofen (Advil, Motrin) and naproxen (Aleve). \n"
		"-Be safe with medicines. Read and follow all instructions on the label.\n"
		"-Start taking the recommended dose when symptoms begin or one day before your menstrual period starts.\n" 
		"-If you are trying to become pregnant, talk to your doctor before you use any medicine.\n")
def tips3():
	print("HOW TO MANAGE MENSTRUAL BLEEDING\n"
				
		"-Tampons range from small to large, for light to heavy flow.\n" 
		"-You can place a tampon in your vagina by using the slender tube packaged with the tampon.\n" 
		"-Or you can place it with a finger. Change the tampon at least every 4 to 8 hours.\n" 
		"-This helps prevent leakage and infection.\n"
		"-Pads range from thin and light to thick and super absorbent.\n" 
		"-They protect your clothing, with or without using a tampon.\n"
		"-Menstrual cups are inserted in the vagina to collect menstrual flow.\n" 
		"-You remove the menstrual cup to empty it. Some are disposable and some can be washed and used again.\n"
		"-Tampons or menstrual cups may work well for activities that you can't use pads, such as swimming.\n" 
		"-You may have to try different products to find out what is right for you.\n" 
		"-Whichever you use, be sure to change it regularly.\n" 
		"-This helps prevent leaking or infection.\n")




print("""WELCOME TO MAZI MENSTRUAL APP""")
print("")
print("CHECK YOUR NEXT MENSTRUAL CYCLE")
print("")
response = input('DO YOU WANT TO CONTINUE?: \n')
if response == "yes":
	select = int(input("MAKE YOUR CHOICE\n"
		"1 -> Check your next menstrual flow\n"
		"2 -> Do you want some tips"))

	match select:
		case 1:
			check_menstrual_flow()
			menu()
		case 2:
			check_tips()
			
else:
	print("Go back to check for tips and your menstrual flow")
	menu()
